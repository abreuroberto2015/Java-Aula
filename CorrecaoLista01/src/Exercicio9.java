//Criar um programa que receba idade de uma 
//pessoa e imprima o seu ano de nascimento.


import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idadeAtual;
		int anoNascimento;
		
		System.out.println("Digite a sua idade atual: ");
		idadeAtual = leitor.nextInt(); 
		
		 anoNascimento = 2021 - idadeAtual;
		
		System.out.println("anoNascimento: " + anoNascimento);
		
		
	}

}
