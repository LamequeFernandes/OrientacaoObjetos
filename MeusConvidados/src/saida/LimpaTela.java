package saida;

public class LimpaTela { 
	
	public LimpaTela() {}
	
	public void limpaTela(int numLinhas){
		for(int limpar = 0; limpar < numLinhas; limpar++)
			System.out.println(" ");
	}
}
