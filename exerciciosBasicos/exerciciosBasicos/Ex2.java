package exerciciosBasicos;
import javax.swing.*;
public class Ex2 {
	public static void main (String[]args) {
		// Ler um  número inserido pelo usuário
		int numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número "));
      		
		//Verificar se o número é par positivo
		if (numero % 2 == 0 && numero > 0 ) {
			System.out.println( numero + " é um número par positivo ");
		} //Verificar se o número é ímpar positivo	
		if (numero % 2 == 1 && numero > 0 ) {
			System.out.println( numero + " é um número ímpar positivo ");
		} // Verificar se o número é par negativo
		if (numero % 2 == 0 && numero < 0 ) {
			System.out.println( numero + " é um número par negativo ");
		}// Verficar se é ímpar negativo
		if (numero % 2 == -1 && numero < 0 ) {
			System.out.println( numero + " é um número ímpar negativo ");
		} //Caso o usuário digite 0
		if (numero == 0) {
			System.out.println(" 0 é um numero par e neutro");
		}
	}
}

//Definitivamente é o código mais porco que eu já fiz