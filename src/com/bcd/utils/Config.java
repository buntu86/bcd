package com.bcd.utils;

/*import com.soumManager.model.Catalog;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

public class Config {
     
    private static Path tempFolder = Paths.get("D:\\temp\\soum");
    private static Path tempX451 = Paths.get(tempFolder.toString() + "\\x451.xml");
    private static Properties prop = new Properties();
    private static Path path_listCatalog, path_dbReference;
    private static ObservableList<Catalog> listCatalog = FXCollections.observableArrayList();
    private static Path fileSia451;
    
    public static Path getTempX451(){
        return tempX451;
    }
    
    public static void iniConfig(){
        try {            
            prop.load(new FileInputStream("resources/config.properties"));
            path_listCatalog = Paths.get(prop.getProperty("path_listCatalog"));
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur - fichier de config");
            alert.setHeaderText(null);
            alert.setContentText("Le fichier de configuration n'a pas pu être chargé.");
            alert.showAndWait();
            System.exit(1);
        }   
        try {            
            prop.load(new FileInputStream("resources/config.properties"));
            path_dbReference = Paths.get(prop.getProperty("path_dbReference"));
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur - fichier de réference");
            alert.setHeaderText(null);
            alert.setContentText("Le fichier de dbReference n'a pas pu être chargé.");
            alert.showAndWait();
            System.exit(1);
        }   
    }
    
    public static Path getPath_listCatalog(){
        return path_listCatalog;
    }
    
    public static Path getPath_dbReference(){
        return path_dbReference;
    }
    
    public static ObservableList<Catalog> getListCatalog(){
        return listCatalog;
    }
    
    public static void setFileSia451(File file){
        fileSia451 = file.toPath();
    }
    public static Path getFileSia451(){
        return fileSia451;
    }
}
*/