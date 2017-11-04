package com.bcd.model;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Project {
    private final StringProperty number = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();    
    private final StringProperty folder = new SimpleStringProperty();    
    private final StringProperty id = new SimpleStringProperty();
    
    public Project(String id, String number, String name, String folder) {
        setId(id);
        setNumber(number);
        setName(name);
        setFolder(folder);
    }
    
    public String getNumber() {
        return number.get();
    }

    public void setNumber(String value) {
        number.set(value);
    }

    public StringProperty numberProperty() {
        return number;
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


    public String getFolder() {
        return folder.get();
    }

    public void setFolder(String value) {
        folder.set(value);
    }

    public StringProperty folderProperty() {
        return folder;
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

    @Override
    public String toString() {
        return getNumber() + " - " + getName();
    }
}
