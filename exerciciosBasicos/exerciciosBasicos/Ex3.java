package exerciciosBasicos;
import javax.swing.*;
public class Ex3 {
	public static void main (String[]args) {
	//Valores inseridos pelo usuário
		int numeroA = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número "));
		int numeroB = Integer.parseInt(JOptionPane.showInputDialog(" Digite outro número "));
		        
        if (numeroA == numeroB ){
        	//Variável que vai ser soma ou multiplicação
        	int SomaOuMult = numeroA *2 ;
        	System.out.println(" Soma de A e B =" + " " + SomaOuMult);
        } else {
        	int SomaOuMult = numeroA * numeroB;
        	System.out.println(" Produto entre A e B =" + SomaOuMult);
        }
	}
}