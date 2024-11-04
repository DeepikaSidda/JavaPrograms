/*Method Overloading
With method overloading, multiple methods can have the same name with different parameters*/

public class methodoverloading {
    static int Add(int x,int y){
        return x+y;

    }
    static double add(double x, double y ){
        return x+y;
    }
    public static void main(String[] args) {
        int value1=Add(3,3);
        double value2=Add(17,45);
        System.out.println(value1);
        System.out.println(value2);
    }
    
}
