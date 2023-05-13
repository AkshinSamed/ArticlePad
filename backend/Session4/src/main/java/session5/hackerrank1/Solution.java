package session5.hackerrank1;

abstract class Book {
    String title;

    abstract void setTitle(String title);

    String getTitle() {
        return title;
    }

}

//Write MyBook class here
class MyBook extends Book {
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

}

public class Solution {

    public static void main(String[] args) {

    }
}