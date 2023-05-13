package session5.phonebrand;

public class Iphone implements Phone{
    @Override
    public void takePicture() {
        System.out.println("Class: Iphone -> Method: takePicture()");
    }

    @Override
    public void printColor() {
        System.out.println("Class: Iphone -> Method: printColor()");
    }
}
