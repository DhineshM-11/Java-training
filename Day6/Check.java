package Day6;

public class Check {
    public static void main(String[] args) {
        String a="shahulk451@gmail.com";
        StringBuilder s1=new StringBuilder(a);
        int e=s1.lastIndexOf("@");
        if(e!=-1){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email ");
        }
    }
}
