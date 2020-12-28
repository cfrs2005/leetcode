package com.aj.basicdatatypes;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;

/**
 * @author zhangqingyue
 * @date 2020/12/28
 */
public class Solution {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("asdkhqwhekjwqe", 123);
        map.put("hhhhhqwewe", 4444);
        map.put("jjklxweqe", 5555);
        map.put("qweqwejj#123123hkjhkh", 6666);
        map.put("PointsServiceByBasicsPlatformImpl$$EnhancerBySpringCGLIB$$ec1578e2", 123);
        Solution solution = new Solution();
        String result = solution.containsKey(map, "PointsServiceByBasicsPlatformImpl");
        System.out.println(result);
    }

    /**
     * @param map
     * @param abc
     * @return
     */
    public String containsKey(HashMap<String, Integer> map, String abc) {
        for (String key : map.keySet()) {
            if (key.contains(abc)) {
                return abc;
            }
        }
        return null;
    }
}
