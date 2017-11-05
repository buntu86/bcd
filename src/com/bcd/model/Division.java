package com.bcd.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Division {
    private final StringProperty id = new SimpleStringProperty();
    private final StringProperty idProject = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty printName = new SimpleStringProperty();
    private final StringProperty folder = new SimpleStringProperty();

    public Division(String id, String idProject, String name, String printName, String folder) {
        setId(id);
        setIdProject(idProject);
        setName(name);
        setPrintName(printName);
        setFolder(folder);
    }
    
    public String getIdProject() {
        return idProject.get();
    }

    public void setIdProject(String value) {
        idProject.set(value);
    }

    public StringProperty idProjectProperty() {
        return idProject;
    }

    public String getId() {
        return id.get();
    }

    public void setId(String value) {
        id.set(value);
    }

    public StringProperty idProperty() {
        return id;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getPrintName() {
        return printName.get();
    }

    public void setPrintName(String value) {
        printName.set(value);
    }

    public StringProperty printNameProperty() {
        return printName;
    }


    public String getFolder() {
        return folder.get();
    }

    public void setFolder(String value) {
        folder.set(value);
    }

    public StringProperty folderProperty() {
        return folder;
    }    

    @Override
    public String toString() {
        return getName();
    }
}
