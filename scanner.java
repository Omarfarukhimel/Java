import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int id;
        double salary;
        String name ;
        System.out.println("Enter your name");
        name=input.nextLine();
        System.out.print("Enter your id: ");
        id=input.nextInt();
        System.out.print("Enter your salary: ");
        salary=input.nextDouble();
        System.out.println("Hello "+name);
        System.out.println("Your id is :"+id);
        System.out.println("yeah Your salary not bad which is :"+salary+"tk");
    }

}
