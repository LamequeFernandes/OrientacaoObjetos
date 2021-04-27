package modelo;

/**
 * Defini os dados de Gastos implementado os gets e sets
 * 
 * @author Lameque Fernandes
 * @versão 1.0 (Abril 2021)
 */


import java.util.Scanner;

public class Gastos{
	//atributos
	private String descricaoGasto;
	private double valorGasto;
	private String formaPagamento;
	

	private String[] gastosCadastrados = new String[30];
	private int numGastos;

	Scanner ler = new Scanner(System.in);
	
	//contrutor
	public Gastos() {}

	//gets e sets
	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public int getNumGastos() {
		return numGastos;
	}

	public void setNumGastos(int numGastos) {
		this.numGastos = numGastos;
	}	

	public String getDescricaoGasto() {
		return descricaoGasto;
	}

	public void setDescricaoGasto(String descricaoGasto) {
		this.descricaoGasto = descricaoGasto;
	}

	public double getValorGasto() {
		return valorGasto;
	}

	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}

}
