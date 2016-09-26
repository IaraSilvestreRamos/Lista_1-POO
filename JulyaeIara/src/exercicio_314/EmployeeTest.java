package exercicio_314;

public class EmployeeTest {
public static void main(String[] args){
		
		
		
		Employee p = new Employee("Iara", "Silvestre", 3200);
		System.out.println("Primeiro Objeto:\nNome: "+ p.getNome() +"\nSobrenome: " + p.getSobrenome() +"\nSalario anual: "+  p.getSalariomensal()*12);
		
		Employee s = new Employee("Julya", "Helyonara", 4500);
		System.out.println("\nSegundo Objeto:\nNome: "+ s.getNome() +"\nSobrenome: " + s.getSobrenome() +"\nSalario anual: "+  s.getSalariomensal()*12);
	
		double pri = 0.10 * (p.getSalariomensal()*12);
		pri += (p.getSalariomensal()*12);
		
		
		
		
		System.out.println("\nPrimeiro Objeto  com acrescimo de 10%:\nNome: "+ p.getNome() +"\nSobrenome: " + p.getSobrenome() +"\nSalario anual: "+ pri );
		double seg = 0.10 * (s.getSalariomensal()*12);
		seg += (s.getSalariomensal()*12);
		System.out.println("\nSegundo Objeto com acrescimo de 10%:\nNome: "+ s.getNome() +"\nSobrenome: " + s.getSobrenome() +"\nSalario anual: "+ seg );
	}
}



