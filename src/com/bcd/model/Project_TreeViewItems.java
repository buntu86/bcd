package com.bcd.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Project_TreeViewItems {
    private final StringProperty text = new SimpleStringProperty();
    private final StringProperty id = new SimpleStringProperty();
    private final IntegerProperty type = new SimpleIntegerProperty();

    public Project_TreeViewItems(String id, String text, int type) {
        setId(id);
        setText(text);
        setType(type);
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

    public int getType() {
        return type.get();
    }

    public void setType(int value) {
        type.set(value);
    }

    public IntegerProperty typeProperty() {
        return type;
    }

    public String getText() {
        return text.get();
    }

    public void setText(String value) {
        text.set(value);
    }

    public StringProperty textProperty() {
        return text;
    }

    @Override
    public String toString() {
        return getText();
    }
}
