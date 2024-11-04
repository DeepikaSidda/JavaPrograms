public class array {
    public static void main(String[] args) {
        String[] trees={"neem","coconut","apple"};
        System.out.println(trees[1]);//accesing the element


        trees[2]="banana";   //changing the value
        System.out.println(trees);


        for (int i = 0; i < trees.length; i++) { //Loop Through an Array
            System.out.println(trees[i]);
          }

          for(string i:trees){  //Loop Through an Array with For-Each
            System.out.println(i);

          }
    }
    
}
