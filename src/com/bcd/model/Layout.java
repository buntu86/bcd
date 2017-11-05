package com.bcd.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Layout {
    private final StringProperty id = new SimpleStringProperty();    
    private final StringProperty idType = new SimpleStringProperty();
    private final StringProperty idDivision = new SimpleStringProperty();
    private final StringProperty idOwner = new SimpleStringProperty();
    private final StringProperty idController = new SimpleStringProperty();
    private final StringProperty idDrawing = new SimpleStringProperty();
    private final StringProperty number = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty printName = new SimpleStringProperty();
    private final StringProperty revision = new SimpleStringProperty();
    
    public Layout(String id, String idType, String idDivison, String idOwner, String idController, String idDrawing, String number, String name, String printName, String revision) {
        setId(id);
        setIdType(idType);
        setIdDivision(idDivison);
        setIdOwner(idOwner);
        setIdController(idController);
        setIdDrawing(idDrawing);
        setNumber(number);
        setName(name);
        setPrintName(printName);
        setRevision(revision);
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

    public String getIdType() {
        return idType.get();
    }

    public void setIdType(String value) {
        idType.set(value);
    }

    public StringProperty idTypeProperty() {
        return idType;
    }


    public String getIdDivision() {
        return idDivision.get();
    }

    public void setIdDivision(String value) {
        idDivision.set(value);
    }

    public StringProperty idDivisionProperty() {
        return idDivision;
    }


    public String getIdOwner() {
        return idOwner.get();
    }

    public void setIdOwner(String value) {
        idOwner.set(value);
    }

    public StringProperty idOwnerProperty() {
        return idOwner;
    }

    public String getIdController() {
        return idController.get();
    }

    public void setIdController(String value) {
        idController.set(value);
    }

    public StringProperty idControllerProperty() {
        return idController;
    }


    public String getIdDrawing() {
        return idDrawing.get();
    }

    public void setIdDrawing(String value) {
        idDrawing.set(value);
    }

    public StringProperty idDrawingProperty() {
        return idDrawing;
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


    public String getPrintName() {
        return printName.get();
    }

    public void setPrintName(String value) {
        printName.set(value);
    }

    public StringProperty printNameProperty() {
        return printName;
    }


    public String getRevision() {
        return revision.get();
    }

    public void setRevision(String value) {
        revision.set(value);
    }

    public StringProperty revisionProperty() {
        return revision;
    }
}
