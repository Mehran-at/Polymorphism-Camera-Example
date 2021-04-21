package com.kingcode.cameraapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YearlySumSale {

    public Map getSumOfEveryCameraPerYear(Map<String,List<Double>> camerasMonthlySalesList) {

        Map<String,Double> totalSellEveryCamera = new HashMap<>();

        for (String key : camerasMonthlySalesList.keySet()) {
            double sum = 0;
            for (List<Double> list : camerasMonthlySalesList.values()) {

                for (int position = 0 ; position < list.size() ; position++) {
                    sum = list.get(position);
                }
            }
            totalSellEveryCamera.put(key, sum);
        }
        System.out.println("\nTotal sell of every camera per year is:  " + totalSellEveryCamera);
        return totalSellEveryCamera;
    }
}