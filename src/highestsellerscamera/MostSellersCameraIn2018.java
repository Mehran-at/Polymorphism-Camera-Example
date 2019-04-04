package highestsellerscamera;

import java.util.*;

public class MostSellersCameraIn2018 {
    public static void main(String[] args) {
        Camera canon = new Canon();
        Camera nikon = new Nikon();
        Camera fuji = new Fuji();
        Camera panasonic = new Panasonic();

        List<Camera> cameras = Arrays.asList(canon, nikon, fuji, panasonic);

        List<String> keys = new ArrayList<>();
        for (Camera camera : cameras) {
            keys.add(camera.getCameraName());
        }
        System.out.println("The brands of of cameras we're considering in this comparison are: " + keys);

        List<Double> salePerMonthCanon = new ArrayList<>();
        List<Double> salePerMonthNikon = new ArrayList<>();
        List<Double> salePerMonthFuji = new ArrayList<>();
        List<Double> salePerMonthPanasonic = new ArrayList<>();

        System.out.println("Please enter every month sales for canon");
        Double sumCanon = canon.getSum(salePerMonthCanon);
        System.out.println("Total yearly sales of highestsellerscamera.Canon is: " + sumCanon + " $");

        System.out.println("Please enter every month sales for highestsellerscamera.Nikon");
        Double sumNikon = nikon.getSum(salePerMonthNikon);
        System.out.println("Total yearly sales of highestsellerscamera.Nikon is: " + sumNikon + " $");

        System.out.println("Please enter every month sales for highestsellerscamera.Fuji");
        Double sumFuji = fuji.getSum(salePerMonthFuji);
        System.out.println("Total yearly sales of highestsellerscamera.Fuji is: " + sumFuji + " $");

        System.out.println("Please enter every month sales for highestsellerscamera.Panasonic");
        Double sumPanasonic = panasonic.getSum(salePerMonthPanasonic);
        System.out.println("Total yearly sales of highestsellerscamera.Panasonic is: " + sumPanasonic + " $");


        System.out.println("Total highestsellerscamera.Canon Sales was: " + sumCanon + " $ and total highestsellerscamera.Nikon sales was " + sumNikon +
                " $ and total highestsellerscamera.Fuji sales was " + sumFuji + " $ and total highestsellerscamera.Panasonic sales was " + sumPanasonic);


        List<Double> totalSaleEveryCompany = Arrays.asList(sumCanon, sumNikon, sumFuji, sumPanasonic);
        Double highestSales = Collections.max(totalSaleEveryCompany);
        System.out.println("Between them " + "   " + " has the highest sold cameras rate in the year 2018 with the total amount of " + highestSales + " $.");
    }

}