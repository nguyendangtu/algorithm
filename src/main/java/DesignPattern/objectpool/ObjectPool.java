package DesignPattern.objectpool;

import java.util.HashMap;
import java.util.Set;

abstract class ObjectPool<T> {

    long deadtime;

    protected HashMap<T, Long> lock, unlock;

    abstract T create();

    abstract boolean validate(T t);

    abstract void dead(T t);

    public ObjectPool() {
        deadtime = 50000;//50 seconds
        lock = new HashMap<>();
        unlock = new HashMap<>();
    }

    synchronized T takeOut() {
        long now = System.currentTimeMillis();
        T t;
        if (unlock.size() > 0) {
            Set<T> keys = unlock.keySet();
            for (T key : keys) {
                //timeout
                if (now - unlock.get(key) <= deadtime) {
                    if (validate(key)) {
                        lock.put(key, System.currentTimeMillis());
                        unlock.remove(key);
                        return key;
                    }
                }
                unlock.remove(key);
                dead(key);
            }
        }
        //create object while t is null;
        t = create();
        lock.put(t, System.currentTimeMillis());
        return t;
    }

    synchronized void takeIn(T t) {
        lock.remove(t);
        unlock.put(t, System.currentTimeMillis());
    }


}
