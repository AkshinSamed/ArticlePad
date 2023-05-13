package session5.phonebrand;

public class Samsung implements Phone{
    @Override
    public void takePicture() {
        System.out.println(" Class: Samsung -> Method: takePicture()");
    }

    @Override
    public void printColor() {
        System.out.println(" Class: Samsung -> Method: printColor()");
    }
}
