package us.kpatrick;

public class Fiction implements Book {
    String description;
    boolean isGood;

    public Fiction() {
        description = "Fiction Book";
        isGood = true;
    }

    @Override
    public void displayBook() {
        System.out.println(description + " is " + (isGood?"a good Book":"a bad Book"));
    }
}
