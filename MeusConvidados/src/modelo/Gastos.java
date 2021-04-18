package modelo;

import java.util.Scanner;

public class Gastos {
	//atributos
	private String descricaoGasto;
	private double valorGasto;
	private String[] gastosCadastrados = new String[30];
	private int numGastos;

	Scanner ler = new Scanner(System.in);
	
	//contrutor
	public Gastos() {}

	//gets e sets
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

	//metodo para cadastrar gastos do evento
	public void cadastrar() {
		System.out.println(" ");
		System.out.println("Digite a quantidade de gastos que deseja adicionar ao Evento(max. 30): ");
		int itens = ler.nextInt();
		if (itens <= 30) {
			for (int contador = 0; contador < itens; contador++) {
				System.out.println(" ");
				System.out.println("Gasto " + (contador + 1) + ": ");
				System.out.print("Nome do Gasto ou item: ");
				System.out.print("Valor, com centavos: ");
				setValorGasto(ler.nextDouble());

				System.out.println(" ");
				System.out.println("Item cadastrado com sucesso!");
				System.out.println("----------------------------------------------------------------------");

				setNumGastos(itens);
			}
		}
	}

	//metodo para mostrar lista de gastos
	public void consultarGastosCadastrados() {
		System.out.println(" ");
		System.out.println("                 ------- Lista de Gastos -------     ");
		System.out.println(" ");
		for (int i = 0; i < getNumGastos(); i++) {
			System.out.println((i + 1) + "-" + gastosCadastrados[i]);
		}
	}
}
