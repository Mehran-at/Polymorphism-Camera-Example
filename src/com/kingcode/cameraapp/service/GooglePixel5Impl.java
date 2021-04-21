package com.kingcode.cameraapp.service;

public class GooglePixel5Impl extends BatteryLife implements CameraService {

    @Override
    public void megapixel(String cameraName) {

        System.out.println(cameraName.toUpperCase() + " 12MP (f/1.7)");
    }
}
