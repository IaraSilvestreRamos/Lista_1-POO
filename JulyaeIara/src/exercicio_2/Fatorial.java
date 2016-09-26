/**
 * @author Julya
 *
 */
package exercicio_2;

public class Fatorial {
	public void calcularFatorial(int numero) {
	
		int fatorial = 1;
		System.out.print(numero+"! = ");
		while (numero>0){
			
			if (numero == 1){
				System.out.print(numero);
			}
			else{
				System.out.print(numero+"*");
			}
			
			fatorial = fatorial*numero;
			numero--;
			}
		
		System.out.print(" = "+fatorial);
		
	}

}