public class Book {
    String Title,Author;
    void detail(){
        System.out.println("Title:"+Title);
        System.out.println("Author:"+Author);
    }
}
class main{
    public static void main(String[] args) {
        Book B1=new Book();
        B1.Title="Algorithm";
        B1.Author="Ajay";
        B1.detail();
    }
}
