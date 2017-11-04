package com.bcd.view;

import com.bcd.data.sql.ProjectManager;
import com.bcd.model.Project;
import com.bcd.utils.Log;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ProjectController implements Initializable {
    @FXML
    private TextField tf_search;
    @FXML
    private ListView<Project> listView;
    private String search = "";    
    private int archive=0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updateList("");
        tf_search.textProperty().addListener((observable, oldValue, newValue) -> {
            updateList(newValue);
            this.search = newValue;
        });
        listView.getSelectionModel().selectedItemProperty().addListener((ob, ov, nv) -> Log.msg(0, "id::" + nv.getId()));

    }    

    private void updateList(String str) {
        
        listView.setItems(ProjectManager.getListProjectBySearch(str, archive));
    }
}
