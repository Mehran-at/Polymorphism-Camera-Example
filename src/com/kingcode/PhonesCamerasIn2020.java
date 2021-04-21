package com.kingcode;

import com.kingcode.cameraapp.service.*;

public class PhonesCamerasIn2020 {

    public static void main(String[] args) {

        CameraService googlePixel = new GooglePixel5Impl();
        googlePixel.megapixel("Google Pixel");

        CameraService huawei = new HuaweiMate40ProImpl();
        huawei.megapixel("Huawei");

        CameraService iPhone = new IPhone12ProMaxImpl();
        iPhone.megapixel("IPhone");

        CameraService samsung = new SamsungGalaxyS21Impl();
        samsung.megapixel("Samsung");

        BatteryLife camera = new GooglePixel5Impl();
        ((GooglePixel5Impl) camera).megapixel("GooglePixel");
        ((CameraService) camera).megapixel("GooglePixel");
        ((CameraService) (GooglePixel5Impl) camera).megapixel("GooglePixel");
        ((GooglePixel5Impl) (CameraService) camera).megapixel("GooglePixel");
//        ((BatteryLife)camera).megapixel("GooglePixel");

//        CameraMonthlySales cameraMonthlySales = new CameraMonthlySales();
//        CameraYearlySales cameraYearlySales = new CameraYearlySales();
//        YearlySumSale yearlySumSale = new YearlySumSale();
//        Map cameraYearlySales1 = cameraYearlySales.getCameraYearlySales();
//        yearlySumSale.getSumOfEveryCameraPerYear(cameraYearlySales1);
    }
}