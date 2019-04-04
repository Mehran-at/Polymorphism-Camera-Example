package highestsellerscamera;
// Interfaces is a way to abstract our application as much as possible and make the code more applicable. The idea is about what is going to happen and how. But 'how' part will be done in our Classes

// For this application I tried to exercise usage of Interface. So I create this application to get the get which company sold the most cameras during an year.
import java.util.List;

public interface Camera {
    String getCameraName();
    List<Double> getSalePerMonth();
    Double getSum(List<Double> lists);
}
