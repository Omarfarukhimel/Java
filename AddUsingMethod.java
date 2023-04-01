import java.util.Scanner;
public class AddUsingMethod {
    public static void sum(int a,int b){
        System.out.println("total sum is:- "+(a+b));
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st number");
        a=input.nextInt();
        System.out.println("Enter 2nd number");
        b=input.nextInt();

        sum(a,b);
    }
}
