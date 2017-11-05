package com.bcd.data.sql;

import com.bcd.model.Division;
import com.bcd.model.Layout;
import com.bcd.utils.Log;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LayoutManager {
    private static ObservableList<Layout> listLayout = FXCollections.observableArrayList();
    
    public static ObservableList<Layout> getListLayoutByIdDivision(String idDivision){
        listLayout.clear();
        try{
            PreparedStatement pstmt = Sql.Conn().prepareStatement("SELECT * FROM prj_layout WHERE idDivision=? ORDER BY number ASC");
            pstmt.setString(1, idDivision);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                //Layout(String id, String idType, String idDivison, String idOwner, String idController, String idDrawing, String number, String name, String printName, String revision) {
                LayoutManager.listLayout.add(new Layout(
                        rs.getString("id"), 
                        rs.getString("idType"),
                        rs.getString("idDivision"),
                        rs.getString("idOwner"),
                        rs.getString("idController"),
                        rs.getString("idDrawing"),
                        rs.getString("number"),
                        rs.getString("name"),
                        rs.getString("printName"),
                        rs.getString("revision")
                ));
            }
        }
        catch(SQLException e){
            Log.msg(1, "Erreur SQL getListLayoutByIdDivision " + e.getMessage());
        }        
        
        return listLayout;
    }        
}
