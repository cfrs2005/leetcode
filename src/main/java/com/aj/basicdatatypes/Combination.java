package com.aj.basicdatatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangqingyue
 * @date 2020/12/29
 */
public class Combination {

    public static void main(String[] args) {
        List<String> dpi = new ArrayList<>();
        dpi.add("240");
        dpi.add("480");
        dpi.add("120");
        List<String> cpu = new ArrayList<>();
        cpu.add("v7");
        cpu.add("v8");
        List<String> country = new ArrayList<>();
        country.add("en");
        country.add("us");
        country.add("cn");
        List<String> channel = new ArrayList<>();
        channel.add("gp");
        channel.add("ap");

        List<List<String>> allList = new ArrayList<>();
        allList.add(dpi);
        allList.add(cpu);
        allList.add(country);
        allList.add(channel);
        calculateCombination(allList, 0, new String[allList.size()]);

    }


    public static void calculateCombination(List<List<String>> inputList, int beginIndex, String[] arr) {
        if (beginIndex == inputList.size()) {
            for (String i : arr) {
                System.out.print(i + ", ");
            }
            System.out.println();
            return;
        }
        for (String c : inputList.get(beginIndex)) {
            arr[beginIndex] = c;
            calculateCombination(inputList, beginIndex + 1, arr);
        }
    }


}
