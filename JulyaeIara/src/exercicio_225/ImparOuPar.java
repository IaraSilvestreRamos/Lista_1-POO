package exercicio_225;

import java.util.Scanner;

public class ImparOuPar {

    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	int numero = teclado.nextInt();
        
        System.out.print("Impar ou Par."); 
        System.out.print("Digite um número: ");
        
        
        if (numero%2==0) {System.out.println(numero +" é Par");}
        else{
        System.out.println(numero +" é Impar");
        
        
        teclado.close();
    }

}}
