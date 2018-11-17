package us.kpatrick;

public class BookFactory {
    public Book getBook(BookType bookType){
        switch (bookType){
            case FICTION: return new Fiction();
            case BIOGRAPHY: return new Biography();
            case GRAPHIC_NOVEL: return new GraphicNovel();
            default: return null;
        }
    }
}
