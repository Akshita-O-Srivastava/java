package ifelse;
import java.util.Scanner;

public class threedigit {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("three digit number");
        }
        else{
            System.out.println("not a three digit");
        }

    }
    
}
