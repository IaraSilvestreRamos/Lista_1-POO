package exercicio_225;

import java.util.Scanner;

public class ImparOuPar {

    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	int numero = teclado.nextInt();
        
        System.out.print("Impar ou Par."); 
        System.out.print("Digite um n�mero: ");
        
        
        if (numero%2==0) {System.out.println(numero +" � Par");}
        else{
        System.out.println(numero +" � Impar");
        
        
        teclado.close();
    }

}}
