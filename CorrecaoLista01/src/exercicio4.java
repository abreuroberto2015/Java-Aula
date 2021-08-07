//Criar um programa que leia um número real imprima o seu dobro.

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double numero;
		double dobro;
		
		System.out.println("Digite um numero:");
		numero = leitor.nextDouble();
		
		dobro = numero * 2;
		
		System.out.printf("O dobro de %s é : %s" , numero, dobro);

	}

}
