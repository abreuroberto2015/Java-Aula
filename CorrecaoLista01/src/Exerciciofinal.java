import java.util.Scanner;

//Criar um programa que receba dois valores A e B, e efetue a troca
//dos valores de forma que a vari�vel A passe a possuir o valor 
//da vari�vel B e que a vari�vel B passe a possuir o valor da vari�vel A.
//Por fim, apresentar os valores trocado.



public class Exerciciofinal {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int a, b, aux;
		
		System.out.println("Digite valor a: ");
		a = leitor.nextInt(); 
		
		System.out.println("Digite valor b: ");
		b = leitor.nextInt();
		
		System.out.printf("A = %s | B = %s\n\n", a, b);
		
		aux = a;		
		a = b;
		b = a;
		
		System.out.printf("A = %s | B = %s\n\n", a, aux);
		
	}

}
