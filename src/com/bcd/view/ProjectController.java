package com.bcd.view;

import com.bcd.data.sql.DivisionManager;
import com.bcd.data.sql.LayoutManager;
import com.bcd.data.sql.PositionManager;
import com.bcd.data.sql.ProjectManager;
import com.bcd.model.Division;
import com.bcd.model.Layout;
import com.bcd.model.Position;
import com.bcd.model.Project;
import com.bcd.model.Project_TreeViewItems;
import com.bcd.utils.Log;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class ProjectController implements Initializable {

    @FXML
    private TreeView<Project_TreeViewItems> treeView;
    @FXML
    private TableView<Position> tableView;
    @FXML
    private TableColumn<Position, String> num;
    @FXML
    private TableColumn<Position, Integer> diam;
    @FXML
    private TableColumn<Position, Integer> count;
    @FXML
    private TableColumn<Position, String> var1;    
    @FXML
    private TableColumn<Position, String> var2;    
    @FXML
    private TableColumn<Position, String> var3;    
    
    private RootLayoutController rootLayout;
    private ObservableList<Division> listDivision = FXCollections.observableArrayList();
    private TreeItem<Project_TreeViewItems> root = null;
    private String idLayoutSelected = "";
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    void setRootLayout(RootLayoutController aThis) {
        this.rootLayout = aThis;
    }

    void setIdProjet(String id) {
        root = new TreeItem<>(new Project_TreeViewItems("0", ProjectManager.getProjectById(id).toString(), 0));
        treeView.setRoot(root);
        
        for(Division division : DivisionManager.getListDivisionByIdProject(id)){
            TreeItem<Project_TreeViewItems> divisionNode = new TreeItem<>(new Project_TreeViewItems(division.getId(), division.getName(), 1));
            
            for(Layout layout : LayoutManager.getListLayoutByIdDivision(division.getId())){
                TreeItem<Project_TreeViewItems> layoutNode = new TreeItem<>(new Project_TreeViewItems(layout.getId(), layout.getNumber() + "-" + layout.getName(), 2));
                divisionNode.getChildren().add(layoutNode);
                Log.msg(0, layout.getId());
            }
            
            root.setExpanded(true);
            root.getChildren().add(divisionNode);
            divisionNode.setExpanded(true);

        }
        
        if(treeView!=null)
        {
            treeView.getSelectionModel().selectedItemProperty().addListener((ob, ov, nv) -> {
                if(nv.getValue().getType()==2)
                {
                    idLayoutSelected=nv.getValue().getId();
                    if(idLayoutSelected!=""){
                        tableView.setItems(PositionManager.trisList(PositionManager.getListPositionByIdLayout(idLayoutSelected)));
                        num.setCellValueFactory(cellData -> cellData.getValue().numberProperty());
                        diam.setCellValueFactory(cellData -> cellData.getValue().diamProperty().asObject());
                        count.setCellValueFactory(cellData -> cellData.getValue().countProperty().asObject());
                        
                    }
                }
            });
        }
    }
}
