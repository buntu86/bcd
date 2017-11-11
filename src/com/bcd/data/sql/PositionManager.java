package com.bcd.data.sql;

import com.bcd.model.Layout;
import com.bcd.model.Position;
import com.bcd.utils.Log;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PositionManager {
    private static ObservableList<Position> listPosition = FXCollections.observableArrayList();
    
    public static ObservableList<Position> getListPositionByIdLayout(String idLayout){
        listPosition.clear();
        try{
            PreparedStatement pstmt = Sql.Conn().prepareStatement("SELECT * FROM rbr_position WHERE idLayout=? ORDER BY number ASC");
            pstmt.setString(1, idLayout);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
/*
    public Position(String id, String idMandrel, String idZT, String idSL, String idG, String idL, String idS, String idBT, String idPT, String idLoc, String number, 
            int diam, int count, int addCount, int mult, String complement, int flag, String handle, int revD, int rev, String comments, String revI, double bBD){                
                */
                PositionManager.listPosition.add(new Position(
                        rs.getString("id"),
                        rs.getString("idMandrel"),
                        rs.getString("idZoneType"),
                        rs.getString("idSteelList"),
                        rs.getString("idGroup"),
                        rs.getString("idLayout"),
                        rs.getString("idStep"),
                        rs.getString("idBarType"),
                        rs.getString("idPositionType"),
                        rs.getString("idLocation"),
                        rs.getString("number"),
                        rs.getInt("diameter"),
                        rs.getInt("count"),
                        rs.getInt("additionalCount"),
                        rs.getInt("multiplier"),
                        rs.getString("complement"),
                        rs.getInt("flag"),
                        rs.getString("handle"),
                        rs.getInt("revisionDeleted"),
                        rs.getInt("revision"),
                        rs.getString("comments"),
                        rs.getString("revisionIndex"),
                        rs.getDouble("bendingBlockDiameter")
                ));
            }
        }
        catch(SQLException e){
            Log.msg(1, "Erreur SQL getListLayoutByIdDivision " + e.getMessage());
        }        
        

        
        return listPosition;
    }
    
    public static ObservableList<Position> trisList(ObservableList<Position> listIn){
        ObservableList<Position> listOut = FXCollections.observableArrayList();
        Position tempPos=null;
        
        for(Position pos : listIn){
            if(pos.getFlag()==1)
            {
                if(tempPos==null)
                {
                    tempPos = pos;
                }
                else if(tempPos.getNumber().equals(pos.getNumber())){
                    tempPos.setCount(pos.getCount()+pos.getAddCount());
                }
                else
                {
                    listOut.add(tempPos);
                    tempPos = pos;
                }
            }
        }
        listOut.add(tempPos);
        
        Log.msg(0, "listIn size " + listIn.size());
        Log.msg(0, "listOut size " + listIn.size());
        return listOut;
    };
}
