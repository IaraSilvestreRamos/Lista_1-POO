package exercicio_215;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		int x;
		int y;
		System.out.print("Digite um numero inteiro: ");
		Scanner numero = new Scanner(System.in);
		x = numero.nextInt();
		System.out.print("Digite um numero inteiro: ");
		y = numero.nextInt();
		
		int soma = x+y;
		int diferenca = x-y;
		int produto = x*y;
		int quociente = x/y;
		
		System.out.println(x+" + "+y+" = "+soma);
		System.out.println(x+" - "+y+" = "+diferenca);
		System.out.println(x+" x "+y+" = "+produto);
		System.out.println(x+" / "+y+" = "+quociente);
			
		numero.close();
	}

}
