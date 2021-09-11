package testaclasse;

import classes.Pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		//construtor simples
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setIdade(59);
		pessoa1.setNome("Jose carlos");
		pessoa1.setCpf("07498480816");
		pessoa1.setEnderreco("Rua Rubi");
		pessoa1.setCasado(true);

	}
	//construtor completo 
	Pessoa pessoa2 = new Pessoa(59,"Jose carlos","07498480816",1.70,"Rua rubi",true);
	
	//contrutor personalizado
	Pessoa pessoa3 = new Pessoa(59,"Jose carlos","07498480816",true);
	
	
}
