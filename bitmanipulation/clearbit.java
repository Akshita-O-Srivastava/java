package bitmanipulation;
import java.util.Scanner;

public class clearbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the position to clear");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int notbitmask = ~(bitmask);
        int newnum=notbitmask &n;
        System.out.println(newnum);
        
    }
    
}
