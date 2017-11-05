package com.bcd.data.sql;

import com.bcd.model.Project;
import com.bcd.utils.Log;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProjectManager {
    
    private static ObservableList<Project> listProject = FXCollections.observableArrayList();
    
    public static ObservableList<Project> getListProjectBySearch(String str, int archive) {
        ProjectManager.listProject.clear();
        //Log.msg(0, "str::" + str);
        try{
            PreparedStatement pstmt = Sql.Conn().prepareStatement("SELECT * FROM prj_project WHERE ((number LIKE ?) OR (name LIKE ?)) ORDER BY number ASC");
            pstmt.setString(1, "%" + str + "%");
            pstmt.setString(2, "%" + str + "%");
            //Log.msg(0, pstmt.toString());
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                addProjectToList(rs);
            }
        }
        catch(SQLException e){
            Log.msg(1, "Erreur SQL getListProjectBySearch " + e.getMessage());
        }

        //Log.msg(0, "size " + listProject.size());
        
        return ProjectManager.listProject;
    }
    
    public static Project getProjectById(String id){
        Project tmpProject = null;
        try{
            PreparedStatement pstmt = Sql.Conn().prepareStatement("SELECT * FROM prj_project WHERE id = ?");
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                tmpProject = new Project(
                    rs.getString("id"),
                    rs.getString("number"),
                    rs.getString("name"),
                    rs.getString("folder"));
            }
        }
        catch(SQLException e){
            Log.msg(1, "Erreur SQL getProjectById " + e.getMessage());
        }
        
        return tmpProject;
    }

    private static void addProjectToList(ResultSet rs){ 
        try{
            ProjectManager.listProject.add(new Project(
            rs.getString("id"),
            rs.getString("number"),
            rs.getString("name"),
            rs.getString("folder")));
        }
        catch(SQLException e){
            Log.msg(1, "Erreur SQL addProjectToList " +e.getMessage());
        }        
    }
}
