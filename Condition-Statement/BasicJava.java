import java.util.Scanner;

public class BasicJava{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number 1");
       int a=sc.nextInt();

       System.out.println("Enter num 2");
        int b = sc.nextInt();
        if (a>=b) {
            System.out.println("A is largest number " +a);
        }else{
            System.out.println("B is largest number "+b);
        }
    }
}