package matriz;

public class EX1 {
	public static void main(String [] args) {
		int matrizM[][] = new int [4][6];
		int matrizN[][] = new int [4][6];
		int matrizProduto[][] = new int [4][6];
		int matrizSoma [] [] = new int [4][6];
		int matrizDiferenca [] [] = new int [4][6];
		
		for (int i = 0; i < 4; i++) { 
			 for (int j = 0; j < 6; j++ ) { 
				 matrizM[i][j] = (int)(Math.random()*10);			
				 System.out.print( matrizM[i][j] + " - ");
			 }
			 System.out.println();
			 System.out.println("---------------------");
		}
		for (int i = 0; i < 4; i++) { 
			 for (int j = 0; j < 6; j++ ) { 
				 matrizN[i][j] = (int)(Math.random()*10);
				 System.out.print( matrizN[i][j] + " - ");
			 }
			 System.out.println();
			 System.out.println("---------------------");
	}
		//For para os cálculos
		for (int i = 0; i < 4; i++) { 
			 for (int j = 0; j < 6; j++ ) {
				 matrizM[i][j] = (int)(Math.random()*10);	
					//Matriz do produto
					matrizProduto[i][j] =  matrizM[i][j] * matrizN[i][j];
				System.out.println("===================================="
						+ "\nProduto de M por N");
				System.out.println(matrizProduto[i][j]);
			
				//Matriz da diferença
			
			 }
			 
		}
		for (int i = 0; i < 4; i++) {
			 for (int j = 0; j < 6; j++ ) {
				 matrizM[i][j] = (int)(Math.random()*10);	
					//Matriz da soma
					matrizSoma[i][j] =  matrizM[i][j] + matrizN[i][j];
					System.out.println("===================================="
							+ "\nSoma de M com N");
					System.out.println(matrizSoma[i][j]);	 
		}	
}
		for (int i = 0; i < 4; i++) {
			 for (int j = 0; j < 6; j++ ) {
					matrizDiferenca[i][j] =  matrizM[i][j] - matrizN[i][j];
					System.out.println("===================================="
							+ "\nDiferença entre M e N");
					System.out.println(matrizDiferenca[i][j]);
			 }
}
		}
	}
