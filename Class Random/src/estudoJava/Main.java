package estudoJava;

import java.util.Random;

;

public class Main {

	public static void main(String[] args) {
		// instancia um objeto da classe randon usando o construtor padrão
		Random gerador = new Random();
		
		// imprime um numero inteiro aleatorio de 0 a 100
		System.out.println(gerador.nextInt(100) + 1);
		
		// imprime um numero inteiro aleatorio de 1 a 10
		// System.out.println(gerador.nextInt(10) + 1);
		
		

	}

}
