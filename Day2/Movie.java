package hello;

public class Movie {
    String title;
    float rating;
    void showdetail(){
        System.out.println("Title:"+title);
        System.out.println("Rating:"+rating);
    }
    public static void main(String[] args) {
        Movie m1=new Movie();
        m1.title="Salaar";
        m1.rating=4.5f;
        m1.showdetail();
    }
}
