package exercicio_2;

import java.util.Scanner;

public class Fatorial2 {
	public static void main (String[] args){
	
	Scanner teclado = new Scanner (System.in);
	System.out.println("Insira um numero para ser calculado o fatorial: ");
	int num = teclado.nextInt();
		
	Fatorial fatorial = new Fatorial ();
	fatorial.calcularFatorial(num);
	teclado.close();
	
	}
}