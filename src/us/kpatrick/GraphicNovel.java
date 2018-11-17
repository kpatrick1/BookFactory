package us.kpatrick;

public class GraphicNovel implements Book{
    String description;
    boolean isGood;

    public GraphicNovel() {
        description = "Graphic Novel";
        isGood = false;
    }

    @Override
    public void displayBook() {
        System.out.println(description + " is " + (isGood?"a good Book":"a bad Book"));
    }
}
