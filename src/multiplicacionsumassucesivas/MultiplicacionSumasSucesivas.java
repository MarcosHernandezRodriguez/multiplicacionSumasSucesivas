/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacionsumassucesivas;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class MultiplicacionSumasSucesivas {
    
    public static void main(String[] args) {        
      Scanner S = new Scanner (System.in);
      
      int a,b,res;
      System.out.print("1er número: ");
      a = S.nextInt();
      System.out.print("2ndo número: ");
      b = S.nextInt();
      res = multSS(a,b);
      System.out.println("Resultado madafaka: " + res);
    }
    
    public static int multSS(int a, int b){
        if(b == 0){
          return 0;
        }else if(b > 0){
          return (a+multSS(a,b-1));
        }else if(b < 0){
          return (-a+multSS(a,b+1));
        }
        return -1;
    }
}
