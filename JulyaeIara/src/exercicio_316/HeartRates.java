package exercicio_316;

public class HeartRates {
	private String nome;
	private String sobrenome;
	private int mes;
	private int dia;
	private int ano;
	
public HeartRates(String nome, String sobrenome, int mes, int dia, int ano){
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.mes = mes;
	this.dia = dia;
	this.ano = ano;
}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int Calculomaxima(int idade){
		return (220 - idade);
		}
	
	public int Idade(int ano, int anoatual, int mesatual, int diaatual){
		int idade = anoatual- ano;
		
			return idade;
		}
	
	public double FrequenciaAlvo(double Frequencia){
		return (Frequencia * 0.5);
	}
	public double FrequenciaAlvo2(double Frequencia){
		return (Frequencia * 0.85);
	}
}


