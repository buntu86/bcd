package com.bcd.view;

import com.bcd.data.sql.ProjectManager;
import com.bcd.model.Project;
import com.bcd.utils.Log;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import static javafx.scene.input.KeyCode.ENTER;
import javafx.scene.input.KeyEvent;

public class SearchProjectController implements Initializable {
    @FXML
    private TextField tf_search;
    @FXML
    private ListView<Project> listView;
    @FXML
    private Button afficher;
    private String search = "";    
    private int archive=0;
    private String id = "";
    private RootLayoutController rootLayout;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updateList("");
        afficher.setDisable(true);
        tf_search.textProperty().addListener((observable, oldValue, newValue) -> {
            updateList(newValue);
            listView.getSelectionModel().selectFirst();
            this.search = newValue;
        });
        listView.getSelectionModel().selectedItemProperty().addListener((ob, ov, nv) -> {
            if(nv!=null)
            {
                id=nv.getId();
                afficher.setDisable(false);
                Log.msg(0, "id::" + nv.getId());
            }
            else
                afficher.setDisable(true);
        });
    }    
    
    @FXML
    private void affiche(){
        rootLayout.closeProject();
        Log.msg(0, "AFFICHE PROJET : " + id);
    }
    
    @FXML
    private void handleKeyPressed(KeyEvent ke){
      if(ke.getCode().equals(ENTER))
        affiche();
    }
    
    private void updateList(String str) {
        listView.setItems(ProjectManager.getListProjectBySearch(str, archive));
    }

    public void setRootLayout(RootLayoutController aThis) {
        this.rootLayout = aThis;
    }
}
