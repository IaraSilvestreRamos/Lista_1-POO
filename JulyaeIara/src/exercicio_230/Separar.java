package exercicio_230;

import java.util.Scanner;

public class Separar {
	
		
		public static void Separa() {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.print("Digite um número de 5 digitos: ");
			int num = teclado.nextInt();
			
	
			
			
		


				System.out.print((num/10000)%10+"   ");
				System.out.print((num/1000)%10+"   ");
				System.out.print((num/100)%10+"   ");
				System.out.print((num/10)%10+"   ");
				System.out.print(num%10+"   ");
			
		
			teclado.close();
			} 
		public static void main(String[] args){
			Separa();
		}
}


