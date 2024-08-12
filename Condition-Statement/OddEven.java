import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num ");
        int num=sc.nextInt();
        if (num%2==0) {
            System.out.println("Given Number in Even "+num);
            
        }else{
            System.out.println("Given Number in Odd " +num);
        }
    }
}
