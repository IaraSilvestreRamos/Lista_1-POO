package exercicio_313;



public class InvoiceTest {
	public static void main(String[] args) {
		
		
		Invoice teste = new Invoice ("001","Sanduiche",4, 5.50);
		
		System.out.println(teste.getNumero());
		System.out.println(teste.getDescricao());
		System.out.println(teste.getQuantidade());
		System.out.println(teste.getPreco());
		System.out.println("Preco = R$"+teste.getInvoiceAmount());
		
		
	}

}
