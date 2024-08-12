import java.util.Scanner;

public class Practice {
    // public static void main(String[] args) {
    //     char ch='i';
    //     if (ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u') {
    //         System.out.println("char is vowel");
    //     }else{
    //         System.out.println("char is not vowe'");
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        char ch=sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println(ch+ " Character is uppercase");
        }else if(Character.isLowerCase(ch)) {
            System.out.println(ch + "Character is lowercae");
        }else{
            System.out.println("Given String is not number");
        }
    }
}
