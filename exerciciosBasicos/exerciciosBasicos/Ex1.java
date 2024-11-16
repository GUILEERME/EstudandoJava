package exerciciosBasicos;
import javax.swing.*;
import java.util.*;
public class Ex1 {
public static void main (String[]args) {
	
	// Declaração dos valores A, B e C
	int valorA = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor A "));
	int valorB = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor B "));
	int valorC = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor C "));
	
	//Soma entre A e B
	int soma = valorA + valorB;
	
	if (soma > valorC) {
		System.out.println( "A soma entre A e B é maior que o valor C" + "\n" + 
	    " Soma = " + soma + "\n" + " Valor C = " + valorC);
	}
	else {
		System.out.println( "A soma entre A e B é menor que o valor C" + "\n" + 
			    " Soma = " + soma + "\n" + " Valor C = " + valorC);
	}
	
}	 
 }
