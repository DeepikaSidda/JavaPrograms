import java.util.Scanner;

public class vowelconsonentproblem {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente a charactered:");
        char ch = sc.next().charAt(0);
    
    switch(ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        System.out.println("Ovel");
        break;
        default:
        System.out.println("consonent");
    }
}
    
}
