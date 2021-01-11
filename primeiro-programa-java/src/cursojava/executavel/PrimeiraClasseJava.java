package cursojava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 80;
		int nota3 = 50;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno aprovado com media de : " + media);

		} else if (media >= 40 && media <= 69) {
			System.out.println(" Aluno em recuperação com media de : " + media);
		} else {
			System.out.println("Aluno reprovado com media de : " + media);
		}		
	}
}
