import java.util.*;

public final class bw extends Hashtable
{
    @Override
    public final synchronized void clear() {
        super.clear();
    }
    
    public bw() {
        super();
    }
    
    @Override
    public final synchronized Object put(final Object key, final Object value) {
        return super.put(key, value);
    }
    
    @Override
    public final synchronized Object remove(final Object key) {
        return super.remove(key);
    }
    
    @Override
    public final synchronized Object get(final Object key) {
        return super.get(key);
    }
}
