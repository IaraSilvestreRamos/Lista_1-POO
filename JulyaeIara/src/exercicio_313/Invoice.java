package exercicio_313;

public class Invoice {
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
//Construtor
public Invoice (String numero, String descricao, int quantidade, double preco){
	this.numero = numero;
	this.descricao = descricao;
	
	if (quantidade<=0){
		this.quantidade = 0;
	}
	else{
		this.quantidade = quantidade;
	}
	
	if (preco<=0){
		this.preco = 0;
	}
	else{
		this.preco = preco;
	}
}

// Get e set

public String getNumero() {
	return numero;
}



public void setNumero(String numero) {
	this.numero = numero;
}


public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}
	
	
//metodo

public double getInvoiceAmount (){
	double resultado = this.quantidade*this.preco;
	return  resultado;
	
}
		
		
		
		
		

	
}
