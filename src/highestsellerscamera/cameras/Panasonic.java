package highestsellerscamera.cameras;
//This classes suppose to take care of the 'HOW' part. But I mentioned that repeat two methods while as we learned
// copying and repeating a code is not a good thing. Since it tells us that our codes are not abstract  enough.


public class Panasonic implements Camera{
  @Override
  public String getCameraName() {
    return "Panasonic";
  }
}
