import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
       
        int i,fact=1;
        int num;//it is the number to calculate the factorial
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        num=sc.nextInt();
        for( i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("factorial of"+""+num+""+"is:"+fact);

    }
    
}
