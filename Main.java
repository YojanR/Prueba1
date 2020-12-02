import java.util.*;
import java.util.Scanner;


public class Main {
    
    
      
    public static String solveMeFirst(int n, int m) {
        String side;

        if ( n > m ){
            if (m % 2 == 0){
                side = "U";
            }else{
                side = "D";
            }
        }else{
            if ( n % 2 == 0){
                side = "L";
            }else{
                side = "R";
            }
        }
        return side;
    }
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        
      Scanner dato = new Scanner(System.in);
      int number;
      int n;
      int m;
      String res;
      number= dato.nextInt();
      
        for (int i=0; i<number; i++){
            n = dato.nextInt();
            m = dato.nextInt();

            res = solveMeFirst(n, m);
            System.out.println(res);
        }
    }
}