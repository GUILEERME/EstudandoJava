
package matriz;
 import java.util.*;
public class Matriz {
	public static void main(String [] args) {
  int matriz1[][] = new int [3][5];
  
  for (int i = 0; i < 3; i++ ) {
	 for (int j = 0; j < 5; j++ ) { 
		 matriz1[i][j] = (int)(Math.random()*10);
		 System.out.print(matriz1[i][j] + " - ");
	 }
	 System.out.println();
	 System.out.println("---------------------");
  }
  
	}
}
