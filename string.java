public class string {
    public static void main(String[] args) {
        /*String Length

A String in Java is actually an object, which contain methods that can perform certain operations on strings. 
For example, the length of a string can be found with the length() method: */
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());

String txt1 = "Hello World";
System.out.println(txt1.toUpperCase());   //converts into uppercase
System.out.println(txt1.toLowerCase()); 
System.out.println(txt1.charAt(2));  //converts into lowercase

//The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)//

String txt2 = "deepika is a good girl!";
System.out.println(txt2.indexOf("girl")); 

//Concatenation//

String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
    }
    
}
