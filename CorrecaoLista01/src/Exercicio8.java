import java.util.Scanner;

//Criar um programa que receba o ano de nascimento de uma pessoa
//e imprima a sua idade atual e imprima também a sua idade em 2050


public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int anoNascimento;
		int idadeAtual;
		int idade2050;
		
		System.out.println("Digite o seu ano de nascimento: ");
		anoNascimento = leitor.nextInt(); 
		
		idadeAtual = 2021 - anoNascimento;
		
		System.out.println("Idade atual: " + idadeAtual);
		
		idade2050 = 2050 - anoNascimento;
		
		System.out.println("Idade em 2050: " + idade2050);
		
		

	}

}
