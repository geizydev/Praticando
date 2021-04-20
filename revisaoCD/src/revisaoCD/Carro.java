package revisaoCD;

public class Carro {
//	Atributos
	private String nome;
	private String cor;
	private String modelo;
	private int ano;
	private boolean estadoAtual;
	private double velocidade;

	//	Construtor;
	public Carro(String nome, String cor,String modelo, int ano, boolean estadoAtual, double velocidade ) {
		this.nome=nome;
		this.cor=cor;
		this.modelo=modelo;
		this.ano=ano;
		this.estadoAtual=estadoAtual;
		this.velocidade=velocidade;
	}
//	comportamentos dos Atributos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isEstadoAtual() {
		return estadoAtual;
	}
	public void setEstadoAtual(boolean estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
//	comportamentos;
	public boolean getLigar() {
		if(estadoAtual==false) {
			estadoAtual=true;
		}else{
			System.out.println("Carro já está ligado");
		}
		return estadoAtual;	
		
	}
	public boolean getDesligar(){
		if(estadoAtual==true) {
			estadoAtual=false;
		}else {
			System.out.println("Carro já está desligado");
		}
		return estadoAtual;
	}
	

}
