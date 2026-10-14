import java.util.*;

public final class fa extends Vector
{
    @Override
    public final synchronized void addElement(final Object obj) {
        super.addElement(obj);
    }
    
    @Override
    public final synchronized void insertElementAt(final Object obj, final int index) {
        super.insertElementAt(obj, index);
    }
    
    public fa() {
        super();
    }
    
    @Override
    public final synchronized boolean removeElement(final Object obj) {
        return super.removeElement(obj);
    }
    
    @Override
    public final synchronized void removeElementAt(final int index) {
        super.removeElementAt(index);
    }
    
    @Override
    public final synchronized void removeAllElements() {
        super.removeAllElements();
    }
    
    @Override
    public final synchronized Object elementAt(final int index) {
        return super.elementAt(index);
    }
}
