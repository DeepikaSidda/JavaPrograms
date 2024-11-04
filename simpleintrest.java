import java.util.Scanner;
public class simpleintrest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rate of intrest");
        int r=sc.nextInt();
        System.out.println("Enter principle vale");
        int p=sc.nextInt();
        System.out.println("Enter time period");
        int t=sc.nextInt();
        int s=(p*t*r)/100;
        System.out.println(s);

    }
}

