package classes;

public class Pessoa {
	int idade;
	String nome;
	String cpf;
	double altura;
	String enderreco;
	boolean casado;
	
	public Pessoa() {
		super();
	}

	public Pessoa(int idade, String nome, String cpf, double altura, String enderreco, boolean casado) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.altura = altura;
		this.enderreco = enderreco;
		this.casado = casado;
	}
	
	
	public Pessoa(int idade, String nome, String cpf,boolean casado ) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.casado = true;
				
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getEnderreco() {
		return enderreco;
	}

	public void setEnderreco(String enderreco) {
		this.enderreco = enderreco;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	
	
}
