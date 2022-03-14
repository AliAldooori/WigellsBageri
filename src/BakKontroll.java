package WigellsBageri.src;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BakKontroll implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("\nBaktillstånd: " + evt.getPropertyName() + " : " + evt.getNewValue());
    }
}
