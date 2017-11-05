package com.bcd.view;

import javafx.scene.layout.BorderPane;
import com.bcd.MainApp;
import com.bcd.model.Project;
import com.bcd.utils.Log;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class RootLayoutController {

    private MainApp mainApp;
    private BorderPane rootLayout;
    private AnchorPane projectLayout, searchProjectLayout;
    private String idProjectOpened = "";
        
    @FXML
    private void handleExit(){
        System.exit(0);
    }
    
    @FXML
    private void searchProject(){        
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/com/bcd/view/SearchProject.fxml"));            
            searchProjectLayout = (AnchorPane) loader.load();     
            SearchProjectController controller = loader.getController();
            controller.setRootLayout(this);
            rootLayout.setCenter(searchProjectLayout);            
        } catch (Exception e) {
            Log.msg(1, "searchProject | " + e.getMessage());
        }
    }
    public void openProject() {
        if(idProjectOpened!="")
        {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(MainApp.class.getResource("/com/bcd/view/Project.fxml"));            
                projectLayout = (AnchorPane) loader.load();     
                ProjectController controller = loader.getController();
                controller.setRootLayout(this);
                controller.setIdProjet(this.idProjectOpened);
                rootLayout.setCenter(projectLayout);            
            } catch (Exception e) {
                Log.msg(1, "openProject | " + e.getMessage());
            }
        }
        else
            Log.msg(1, "openProject | Erreur idProjectOpened ne peux être null.");
    }
    @FXML
    public void closeProject(){
        rootLayout.getChildren().remove(searchProjectLayout);
        rootLayout.getChildren().remove(projectLayout);
    }

    public void setRootLayout(BorderPane rootLayout) {
        this.rootLayout = rootLayout;
        searchProject();
    }

    public void setMainApp(MainApp aThis) {
        this.mainApp = aThis;
    }

    public void setIdProjectOpened(String id) {
        this.idProjectOpened = id;
    }
}


/*
    @FXML
    private void handleOpenAgenda(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/com/soumManager/view/agenda/Agenda.fxml"));            
            agendaLayout = (AnchorPane) loader.load();  
            Stage agendaStage = new Stage();
            agendaStage.setTitle("Agenda");
            agendaStage.initModality(Modality.APPLICATION_MODAL);
            Scene scene = new Scene(agendaLayout);
            agendaStage.setScene(scene);            
            AgendaController controller = loader.getController();
            controller.setStage(agendaStage);

            agendaStage.addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent t) -> {
                if(t.getCode()==KeyCode.ESCAPE)
                {
                    agendaStage.close();
                    Log.msg(0, "Agenda : esc");
                }
            });            

            agendaStage.showAndWait();

        } catch (Exception e) {
            Log.msg(1, "showAgenda | " + e.getMessage());
        }        
    }    
    */
    