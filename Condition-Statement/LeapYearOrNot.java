import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int year=sc.nextInt();
        boolean a=(year%4)==0;
        boolean x=(year%100)!=0;
        boolean z=(year %100==0)&&(year%400==0);
        if (a && x||z) {
            System.out.println("Year in a leap year:"+year);
        }else{
            System.out.println("not leap year " +year);
        }

    }
}
