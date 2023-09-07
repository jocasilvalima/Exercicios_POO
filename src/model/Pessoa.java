package model;

public class Pessoa {
	private String nome, rg, cpf, telefone, email;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String rg, String cpf, String telefone, String email) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "nome:" + nome + 
				"\nRg=" + rg + 
				"\nCpf=" + cpf + 
				"\nTelefone=" + telefone + 
				"\nE-mail=" + email;
	}
	

}

