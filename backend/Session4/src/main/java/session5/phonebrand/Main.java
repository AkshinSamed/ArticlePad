package session5.phonebrand;

public class Main {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();

        samsung.takePicture();
        samsung.printColor();

        System.out.println();

        iphone.printColor();
        iphone.takePicture();
    }
}

