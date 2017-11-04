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
        Log.msg(0, "str::" + str);
        try{
            PreparedStatement pstmt = Sql.Conn().prepareStatement("SELECT * FROM prj_project WHERE name LIKE ? ORDER BY number ASC");
            pstmt.setString(1, "%" + str + "%");
            Log.msg(0, pstmt.toString());
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                ProjectManager.listProject.add(new Project(
                rs.getDouble("id"),
                rs.getString("number"),
                rs.getString("name"),
                rs.getString("folder")));
            }
        }
        catch(SQLException e){
            Log.msg(1, "Erreur SQL getListProjectBySearch " + e.getMessage());
        }

        Log.msg(0, "size " + listProject.size());
        
        return ProjectManager.listProject;
    }
    
    public static Project getProjectById(double id){
        return null;
    }

    private static void addProjectToList(ResultSet rs){ 
        try{
            ProjectManager.listProject.add(new Project(
            rs.getDouble("id"),
            rs.getString("number"),
            rs.getString("name"),
            rs.getString("folder")));
        }
        catch(SQLException e){
            Log.msg(1, "Erreur SQL addProjectToList " +e.getMessage());
        }        
    }
}
