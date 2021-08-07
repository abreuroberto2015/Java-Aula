//Criar um programa que leia 2 números reais, efetuar as 4 operações 
//matemáticas e mostrar os resultados

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double a, b, res;
		
		System.out.println("Digite o valor A: ");
		a = leitor.nextDouble();
		
		System.out.println("Digite o valor B: ");
		b = leitor.nextDouble();
		
		res = a + b;
		System.out.println("SOMA: " + res);
		
		res = a - b;
		System.out.println("SUBTRACAO: " + res);
		
		res = a * b;
		System.out.println("MULTIPLICACAO: " + res);
		
		res = a / b;
		System.out.println("DIVISAO: " + res);

	}

}
