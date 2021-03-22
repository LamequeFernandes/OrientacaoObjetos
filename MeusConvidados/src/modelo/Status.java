package modelo;

public class Status {
	
	private boolean convidado;
	private boolean evento;
	private boolean tarefa;
	
	public boolean isConvidado(){
		return this.convidado;
	}
	public void setConvidado(boolean convidado) {
		this.convidado = convidado;
	}
	public boolean isEvento() {
		return evento;
	}
	public void setEvento(boolean evento) {
		this.evento = evento;
	}
	public boolean isTarefa() {
		return tarefa;
	}
	public void setTarefa(boolean tarefa) {
		this.tarefa = tarefa;
	}
	
}
 