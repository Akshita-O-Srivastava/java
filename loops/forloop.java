package loops;
import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of term:");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }
    }
    
}
