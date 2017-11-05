package com.bcd.data.sql;

import com.bcd.model.Division;
import com.bcd.utils.Log;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DivisionManager {
    private static ObservableList<Division> listDivision = FXCollections.observableArrayList();
    
    public static ObservableList<Division> getListDivisionByIdProject(String idProject){
        listDivision.clear();
        try{
            PreparedStatement pstmt = Sql.Conn().prepareStatement("SELECT * FROM prj_division WHERE idProject=? ORDER BY number ASC");
            pstmt.setString(1, idProject);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                //Division(String id, String idProject, String name, String printName, String folder) {
                DivisionManager.listDivision.add(new Division(
                        rs.getString("id"), 
                        rs.getString("idProject"),
                        rs.getString("name"),
                        rs.getString("printName"),
                        rs.getString("folder")
                ));
            }
        }
        catch(SQLException e){
            Log.msg(1, "Erreur SQL getListDivisionByIdProject " + e.getMessage());
        }        
        
        return listDivision;
    }    
}