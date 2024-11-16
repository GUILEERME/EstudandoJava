package matriz;
import java.util.*;


public class EX2 {
	public static void main(String [] args) {
		int matrizM[][] = new int [6][6];
		int valorA = (int) (Math.random()*11);
		int matrizTotal[][] = new int [6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				matrizM[i][j] = (int) (Math.random()*11);
				matrizTotal [i][j] = matrizM[i][j] * valorA;
			}
	
		}
		
	}
}
	
