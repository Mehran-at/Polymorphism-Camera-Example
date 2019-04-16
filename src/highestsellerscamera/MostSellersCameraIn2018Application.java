package highestsellerscamera;

import highestsellerscamera.cameras.CameraMonthlySales;
import highestsellerscamera.cameras.CameraYearlySales;
import highestsellerscamera.cameras.YearlySumSale;

import java.util.Map;

public class MostSellersCameraIn2018Application {
  public static void main(String[] args) {
    CameraMonthlySales cameraMonthlySales = new CameraMonthlySales();
    CameraYearlySales cameraYearlySales = new CameraYearlySales();
    YearlySumSale yearlySumSale = new YearlySumSale();
    Map cameraYearlySales1 = cameraYearlySales.getCameraYearlySales();
    yearlySumSale.getSumOfEveryCameraPerYear(cameraYearlySales1);
  }
}