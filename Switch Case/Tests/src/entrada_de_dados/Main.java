package entrada_de_dados;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Digite um numero de 1 a 7");
int x = sc.nextInt();
System.out.println();
String dia;
switch (x) {
case 1:
dia = "domingo";
break;
case 2:
dia = "segunda";
break;
case 3:
dia = "terca";
break;
case 4:
dia = "quarta";
break;
case 5:
dia = "quinta";
break;
case 6:
dia = "sexta";
break;
case 7:
dia = "sabado";
break;
default:
dia = "valor invalido";
break;
}
System.out.println("Dia da semana: " + dia);
sc.close();
}
}