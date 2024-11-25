package JUC;

import java.util.HashMap;
import java.util.Map;

public class ReadWriteLockDemo {
}

class MyCache {
    private volatile Map<String, Object> map = new HashMap<>();


    public void put(String key, Object value) {
        map.put(key, value);
    }

}
