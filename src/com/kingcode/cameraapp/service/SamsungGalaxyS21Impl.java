package com.kingcode.cameraapp.service;

public class SamsungGalaxyS21Impl extends BatteryLife implements CameraService {

    @Override
    public void megapixel(String cameraName) {

        System.out.println(cameraName.toUpperCase() + " 108MP (f/1.8)");
    }
}