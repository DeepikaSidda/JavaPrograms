/*Your friend Rahul plans to visit exotic countries all around the world. Sadly, Rahul's math skills aren't good enough.
 Take the amount of money Rahul has before the currency exchange and the amount of money that is spent from his savings as input, 
 print the amount of money that remains in his savings.*/
 import java.util.Scanner;
 public class problem1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rahuls total savings:");
        int totalsavings=sc.nextInt();
        System.out.println("Enter Rahuls Exchange amount:");
        int exchangeamount=sc.nextInt();
        int remainingsavings=totalsavings-exchangeamount;
        System.out.println(remainingsavings);

    }
 }