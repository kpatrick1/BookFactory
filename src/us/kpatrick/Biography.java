package us.kpatrick;

public class Biography implements Book {
    String description;
    boolean isGood;

    public Biography() {
        description = "Biography Book";
        isGood = false;
    }

    @Override
    public void displayBook() {
        System.out.println(description + " is " + (isGood?"a good Book":"a bad Book"));
    }
}
