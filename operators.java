/*import java.util.Scanner;
public class operators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  number:");
        int num =sc.nextInt();
        String ans= num % 2 == 0 ? " Even " | " Odd " :
        System.out.println(ans);
        sc.close();
    }
    
}
*/
/*Logical operator & -it check the both operations for result ,&&-it checks the only one operator to give the result
Logical OR operator | - returns true in any one of the statement is true  || shortcircuited or it doesnot evaluate the second expression */
   
public class operators {
    public static void main(String[] args){
        int age=18;
        String citizenship="Indian";
        if(age>=18 & citizenship=="Indian"){
            System.out.println("Person eligilble to vote");
        }
        else{
            System.out.println("Person is not eligible to vote");
        }
    }
}


       
       