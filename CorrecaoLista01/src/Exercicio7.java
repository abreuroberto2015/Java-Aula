import java.util.Scanner;

//Criar um programa que leia um valor em Real e a cota��o do d�lar,
//e converta esse valor em d�lares.


public class Exercicio7 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double real ;
		double dolar = 5.25;
		double res;		
		
		System.out.println("Digite o valor em R$: ");
		real = leitor.nextDouble();
		
		res = (1 / dolar) * real;
		
		System.out.printf("R$ %.2f � equivalente � $ %.2f", real, res);

	}
}
