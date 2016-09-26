package exercicio_232;

import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[] args){
		System.out.println("Digite 5 números inteiros");
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int positivo=0;
		int negativo=0;
		int zero=0;
		
		while(cont<5){
			cont++;
			System.out.print("Insira o "+cont+"º número: ");
			int num = teclado.nextInt();
			if(num < 0){
				negativo++;
			}
			if(num>0){
				positivo++;
			}
			if(num ==0){
				zero++;
			}
		}
		System.out.println("Números positivos: "+positivo);
		System.out.println("Números negativos: "+negativo);
		System.out.println("Zeros: "+zero);
		teclado.close();
	}
	

}
