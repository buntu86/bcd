package com.bcd.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Position {
    private final StringProperty id = new SimpleStringProperty();
    private final StringProperty idMandrel = new SimpleStringProperty();    
    private final StringProperty idZoneType = new SimpleStringProperty();    
    private final StringProperty idSteelList = new SimpleStringProperty();
    private final StringProperty idGroup = new SimpleStringProperty();    
    private final StringProperty idLayout = new SimpleStringProperty();    
    private final StringProperty idStep = new SimpleStringProperty();    
    private final StringProperty idBarType = new SimpleStringProperty();    
    private final StringProperty idPositionType = new SimpleStringProperty();    
    private final StringProperty idLocation = new SimpleStringProperty();
    private final StringProperty number = new SimpleStringProperty();    
    private final IntegerProperty diam = new SimpleIntegerProperty();    
    private final IntegerProperty count = new SimpleIntegerProperty();
    private final IntegerProperty addCount = new SimpleIntegerProperty();    
    private final IntegerProperty multiplier = new SimpleIntegerProperty();    
    private final StringProperty complement = new SimpleStringProperty();    
    private final IntegerProperty flag = new SimpleIntegerProperty();    
    private final StringProperty handle = new SimpleStringProperty();
    private final IntegerProperty revisionDeleted = new SimpleIntegerProperty();    
    private final IntegerProperty revision = new SimpleIntegerProperty();    
    private final StringProperty comments = new SimpleStringProperty();    
    private final StringProperty revisionIndex = new SimpleStringProperty();    
    private final DoubleProperty bendingBlockDiameter = new SimpleDoubleProperty();    

    public Position(String id, String idMandrel, String idZT, String idSL, String idG, String idL, String idS, String idBT, String idPT, String idLoc, String number, 
            int diam, int count, int addCount, int mult, String complement, int flag, String handle, int revD, int rev, String comments, String revI, double bBD){
        setId(id);
        setIdMandrel(idMandrel);
        setIdZoneType(idZT);
        setIdSteelList(idSL);
        setIdGroup(idG);
        setIdLayout(idL);
        setIdStep(idS);
        setIdBarType(idBT);
        setIdPositionType(idPT);
        setIdLocation(idLoc);
        setNumber(number);
        setDiam(diam);
        setCount(count);
        setAddCount(addCount);
        setMultiplier(mult);
        setComplement(complement);
        setFlag(flag);
        setHandle(handle);
        setRevisionDeleted(revD);
        setRevision(rev);
        setComments(comments);
        setRevisionIndex(revI);
        setBendingBlockDiameter(bBD);
    }

    @Override
    public String toString() {
        return getNumber() + "|diam." + getDiam();
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


    public int getDiam() {
        return diam.get();
    }

    public void setDiam(int value) {
        diam.set(value);
    }

    public IntegerProperty diamProperty() {
        return diam;
    }


    public String getIdMandrel() {
        return idMandrel.get();
    }

    public void setIdMandrel(String value) {
        idMandrel.set(value);
    }

    public StringProperty idMandrelProperty() {
        return idMandrel;
    }


    public String getIdZoneType() {
        return idZoneType.get();
    }

    public void setIdZoneType(String value) {
        idZoneType.set(value);
    }

    public StringProperty idZoneTypeProperty() {
        return idZoneType;
    }


    public String getIdSteelList() {
        return idSteelList.get();
    }

    public void setIdSteelList(String value) {
        idSteelList.set(value);
    }

    public StringProperty idSteelListProperty() {
        return idSteelList;
    }


    public String getIdGroup() {
        return idGroup.get();
    }

    public void setIdGroup(String value) {
        idGroup.set(value);
    }

    public StringProperty idGroupProperty() {
        return idGroup;
    }


    public String getIdLayout() {
        return idLayout.get();
    }

    public void setIdLayout(String value) {
        idLayout.set(value);
    }

    public StringProperty idLayoutProperty() {
        return idLayout;
    }


    public String getIdStep() {
        return idStep.get();
    }

    public void setIdStep(String value) {
        idStep.set(value);
    }

    public StringProperty idStepProperty() {
        return idStep;
    }


    public String getIdBarType() {
        return idBarType.get();
    }

    public void setIdBarType(String value) {
        idBarType.set(value);
    }

    public StringProperty idBarTypeProperty() {
        return idBarType;
    }


    public String getIdPositionType() {
        return idPositionType.get();
    }

    public void setIdPositionType(String value) {
        idPositionType.set(value);
    }

    public StringProperty idPositionTypeProperty() {
        return idPositionType;
    }


    public String getIdLocation() {
        return idLocation.get();
    }

    public void setIdLocation(String value) {
        idLocation.set(value);
    }

    public StringProperty idLocationProperty() {
        return idLocation;
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
    


    public String getComplement() {
        return complement.get();
    }

    public void setComplement(String value) {
        complement.set(value);
    }

    public StringProperty complementProperty() {
        return complement;
    }


    public int getFlag() {
        return flag.get();
    }

    public void setFlag(int value) {
        flag.set(value);
    }

    public IntegerProperty flagProperty() {
        return flag;
    }


    public String getHandle() {
        return handle.get();
    }

    public void setHandle(String value) {
        handle.set(value);
    }

    public StringProperty handleProperty() {
        return handle;
    }


    public int getRevisionDeleted() {
        return revisionDeleted.get();
    }

    public void setRevisionDeleted(int value) {
        revisionDeleted.set(value);
    }

    public IntegerProperty revisionDeletedProperty() {
        return revisionDeleted;
    }


    public int getRevision() {
        return revision.get();
    }

    public void setRevision(int value) {
        revision.set(value);
    }

    public IntegerProperty revisionProperty() {
        return revision;
    }


    public String getComments() {
        return comments.get();
    }

    public void setComments(String value) {
        comments.set(value);
    }

    public StringProperty commentsProperty() {
        return comments;
    }


    public String getRevisionIndex() {
        return revisionIndex.get();
    }

    public void setRevisionIndex(String value) {
        revisionIndex.set(value);
    }

    public StringProperty revisionIndexProperty() {
        return revisionIndex;
    }


    public double getBendingBlockDiameter() {
        return bendingBlockDiameter.get();
    }

    public void setBendingBlockDiameter(double value) {
        bendingBlockDiameter.set(value);
    }

    public DoubleProperty bendingBlockDiameterProperty() {
        return bendingBlockDiameter;
    }


    public int getMultiplier() {
        return multiplier.get();
    }

    public void setMultiplier(int value) {
        multiplier.set(value);
    }

    public IntegerProperty multiplierProperty() {
        return multiplier;
    }


    public int getAddCount() {
        return addCount.get();
    }

    public void setAddCount(int value) {
        addCount.set(value);
    }

    public IntegerProperty addCountProperty() {
        return addCount;
    }


    public int getCount() {
        return count.get();
    }
    public void setCount(int value) {
        count.set(value);
    }
    public IntegerProperty countProperty() {
        return count;
    }
}
