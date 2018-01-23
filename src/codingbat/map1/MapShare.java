package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

public class MapShare {

    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b"
    to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	*/

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(mapShare(new HashMap<String, String>() {{
            put("a", "aaa");
            put("b", "bbb");
            put("c", "ccc");
        }}));
        System.out.println(mapShare(new HashMap<String, String>() {{
            put("b", "xyz");
            put("c", "ccc");
        }}));
        System.out.println(mapShare(new HashMap<String, String>() {{
            put("a", "aaa");
            put("c", "meh");
            put("d", "hi");
        }}));

    }
}
