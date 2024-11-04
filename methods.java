/*public class methods {
    static void Mymethod(){
        System.out.println("hello every one");

    }
    public static void main(String[] args){
        Mymethod();
    }
    
}

public class methods{
    static void Mymethod(String name,int age){
        System.out.println(name+""+age);


    }
    public static void main(String[] args) {
        Mymethod("Deepika",19);
    }
}*/


//return value//

public class methods{
    static int Mymethod(int x,int y){ //with void we cannot return a value//
        return x+y;
    }
    public static void main(String[] args){
        System.out.println(Mymethod(2,3));
    }

}
