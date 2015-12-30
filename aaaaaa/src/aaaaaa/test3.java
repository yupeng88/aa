package aaaaaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {
    /**
     * 验证是否是数字
     * 
     * @param str
     * @return
     * 
     * @author yupeng
     * @date 2015年12月22日 下午4:44:49
     */
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric2(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", 123);
        result.add(map);
        if(result.get(0).get("message")!=null){
            System.out.println("能成功吗?");
        }
        for (Map<String, Object> m : result) {
            if (m.get("message") != null) {
                System.out.println(m.get("message"));
            }else{
                System.out.println("判断成功");
            }

        }

    }
}
