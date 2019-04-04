package highestsellerscamera;
//This classes suppose to take care of the 'HOW' part. But I mentioned that repeat two methods while as we learned
// copying and repeating a code is not a good thing. Since it tells us that our codes are not abstract  enough.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nikon implements Camera
{
    @Override
    public String getCameraName() {
        return "highestsellerscamera.Nikon";
    }

    @Override
    public List<Double>getSalePerMonth() {
        List<Double> listOfYearlySales= new ArrayList<>();
        for (int month = 0; month < 12; month++) {
            Scanner scanner = new Scanner(System.in);
            double monthlySales = scanner.nextDouble();
            listOfYearlySales.add(monthlySales);
        }
        return listOfYearlySales;
    }

    @Override
    public Double getSum(List<Double> lists) {
        lists= getSalePerMonth();
        double sum = 0;
        for (int element = 0; element < lists.size(); element++) {
            sum += lists.get(element);
        }
        return sum;
    }
}
