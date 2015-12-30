package aaaaaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test5 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("-------------");
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("1", "11");
        map.put("2", "22");
        map.put("3", "33");
        map.put("4", "44");

        // 1
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(map.get(s));
        }
        System.out.println("-------------");
        // 2
        Iterator<String> ii = map.keySet().iterator();
        while (ii.hasNext()) {
            System.out.println(map.get(ii.next()));
        }
        System.out.println("-------------");
        // 3
        Iterator<?> iii = map.entrySet().iterator();
        while (iii.hasNext()) {
            @SuppressWarnings("unchecked")
            Entry<String, Object> entry = (Entry<String, Object>) iii.next();
            System.out.println(entry.getValue());
        }
    }

}
