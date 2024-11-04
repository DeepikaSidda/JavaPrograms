import java.util.Scanner;
public class digticounter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
            int num=sc.nextInt();
            int digit=0;
            while(num>0){
                num /=10;
                digit++;
            }34578
            
            System.out.println(digit);

        }


    }
    

