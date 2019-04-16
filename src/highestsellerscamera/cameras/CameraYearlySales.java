package highestsellerscamera.cameras;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CameraYearlySales {

  CameraMonthlySales cameraMonthlySales = new CameraMonthlySales();

  List<Camera> cameras = Arrays.asList(new Canon(), new Nikon(), new Fuji(), new Panasonic());

  Map<String, List<Double>> yearlySalesOfCamera = new HashMap<>();

  public Map getCameraYearlySales() {

    for (Camera camera : cameras) {
      String cameraName = camera.getCameraName();
      List<Double> salePerMonth = cameraMonthlySales.getSalePerMonth();
      yearlySalesOfCamera.put(cameraName, salePerMonth);
    }

    System.out.println("\nThe monthly sales of the cameras are: " + yearlySalesOfCamera);
    return yearlySalesOfCamera;
  }
}