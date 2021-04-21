package com.kingcode.cameraapp.service;

public class HuaweiMate40ProImpl extends BatteryLife implements CameraService {

    @Override
    public void megapixel(String cameraName) {

        System.out.println(cameraName.toUpperCase() + " 50MP (f/1.9)");
    }
}
