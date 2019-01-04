package br.com.unidev.base.model;

public class Usuario {

	private String nome;
	private String sexo;
	private Integer idade;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario(String nome, String sexo, Integer idade, String email) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.email = email;
	}

	public Usuario() {
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", email=" + email + "]";
	}
	
	

}
