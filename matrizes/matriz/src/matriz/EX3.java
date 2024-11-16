package matriz;
import java.util.*;
import javax.swing.JOptionPane;
public class EX3 {
	public static void main(String [] args) {
		//Número de linhas
		int l = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas"));
		//Número de colunas
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas"));
		int matriz1[] [] = new int [l][c];
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				matriz1[i][j] = (int) (Math.random()*10);
				System.out.print(matriz1[i][j] + " |");
			}
			System.out.println();
			System.out.println("---------------------");
		}
		System.out.println();
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				matriz1[i][j] = (int) (Math.random()*10);
				System.out.println("Posição:" + i + " x " + c + " = " + matriz1[i][j]);
				
			}
			System.out.println();
			System.out.println("---------------------");
	}
}}
