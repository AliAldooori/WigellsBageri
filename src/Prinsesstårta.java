package WigellsBageri.src;

import WigellsBageri.src.BusinesObject;
import WigellsBageri.src.Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prinsesstårta   {
    String tårtbotten  ;
    String visbyGrädde  ;
    String vaniljkräm ;
    String hallonsylt ;
    String marsipanlock ;
    String marsipanros ;
    String florsocker ;


    private boolean bestalld ;
    private String status;
    private PropertyChangeSupport propertyChangeSupport;

    public Prinsesstårta() {
        this.tårtbotten = tårtbotten;
        this.visbyGrädde = visbyGrädde;
        this.vaniljkräm = vaniljkräm;
        this.hallonsylt = hallonsylt;
        this.marsipanlock = marsipanlock;
        this.marsipanros = marsipanros;
        this.florsocker = florsocker;

        this.propertyChangeSupport = propertyChangeSupport;
    }

    public String getTårtbotten() {
        return tårtbotten;
    }

    public void setTårtbotten(String tårtbotten) {
        this.tårtbotten = tårtbotten;
    }

    public String getVisbyGrädde() {
        return visbyGrädde;
    }

    public void setVisbyGrädde(String visbyGrädde) {
        this.visbyGrädde = visbyGrädde;
    }

    public String getVaniljkräm() {
        return vaniljkräm;
    }

    public void setVaniljkräm(String vaniljkräm) {
        this.vaniljkräm = vaniljkräm;
    }

    public String getHallonsylt() {
        return hallonsylt;
    }

    public void setHallonsylt(String hallonsylt) {
        this.hallonsylt = hallonsylt;
    }

    public String getMarsipanlock() {
        return marsipanlock;
    }

    public void setMarsipanlock(String marsipanlock) {
        this.marsipanlock = marsipanlock;
    }

    public String getMarsipanros() {
        return marsipanros;
    }

    public void setMarsipanros(String marsipanros) {
        this.marsipanros = marsipanros;
    }

    public String getFlorsocker() {
        return florsocker;
    }

    public void setFlorsocker(String florsocker) {
        this.florsocker = florsocker;
    }

    public PropertyChangeSupport getPropertyChangeSupport() {
        return propertyChangeSupport;
    }

    public void setPropertyChangeSupport(PropertyChangeSupport propertyChangeSupport) {
        this.propertyChangeSupport = propertyChangeSupport;
    }

    public void setBestalld(boolean bestalld) {
        boolean oldBestalld = this.bestalld;
        this.bestalld = bestalld;
        this.propertyChangeSupport.firePropertyChange("Beställd ", oldBestalld, this.bestalld);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        this.propertyChangeSupport.firePropertyChange("Prinsesstårta levererat ", oldStatus, this.status);
    }

    // Metod för att lägga till listner
    public void addPropertyChangeListner(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }


}
