package exercicio_216;

import java.util.Scanner;

public class MaiorNumero {

public static void main(String[] args) {
	         
	int x, y;
	System.out.print("Digite um numero inteiro: ");
	Scanner numero = new Scanner(System.in);
	x = numero.nextInt();
	System.out.print("Digite um numero inteiro: ");
	y = numero.nextInt();

	if ( x > y )
	System.out.println(x+" is larger.");
	else if ( y > x)
	System.out.println(y+" is larger.");
	else if ( x == y )
	System.out.println("These numbers are equals.");
	
	numero.close();
	    } 
	}



