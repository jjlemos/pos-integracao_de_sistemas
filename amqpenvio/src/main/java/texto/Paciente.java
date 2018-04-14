package texto;

import java.io.Serializable;

public class Paciente implements Serializable{
	int id;
	String nome;
	
	public Paciente() {

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
