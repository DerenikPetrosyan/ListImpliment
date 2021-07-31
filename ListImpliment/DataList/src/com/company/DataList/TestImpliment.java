package com.company.DataList;

import java.util.List;

public class TestImpliment {
    public static void main(String[] args) {
        List<Integer> listData = new DataList<>();
        for (int i = 10; i < 20; i++) {
            listData.add(i);
        }
        listData.remove(3);
        System.out.println(listData);
        listData.add(3,100);
        System.out.println(listData);
        List<Integer> testData = new DataList<>();
        testData.add(12);
        testData.add(18);
        testData.add(19);
        System.out.println(listData.containsAll(testData));
        listData.removeAll(testData); 
        System.out.println(listData);
    }
}
