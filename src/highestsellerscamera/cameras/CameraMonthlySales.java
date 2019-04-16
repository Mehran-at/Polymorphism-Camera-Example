package highestsellerscamera.cameras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CameraMonthlySales {

  List<Double> getSalePerMonth() {

    List<String> monthsNames = Arrays.asList(
        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

    List<Double> monthlySalesList = new ArrayList<>();

    for (int month = 0; month < 12; month++) {
      System.out.println("PLease enter the total sales of the " + monthsNames.get(month) + " and press Enter: ");
      Scanner scanner = new Scanner(System.in);
      double monthlySales = scanner.nextDouble();
      monthlySalesList.add(monthlySales);
    }

    System.out.println("\nList of monthly sales for this camera is: " + monthlySalesList);
    return monthlySalesList;
  }
}
