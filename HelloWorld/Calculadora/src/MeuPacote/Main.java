package MeuPacote;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a opcao desejada de 1 a 4 (1 - soma | 2 - Mult | 3 - Sub | 4 - Div):");
		int operacao = scan.nextInt();
		System.out.println("Digite o numero A: ");
		int a = scan.nextInt();
		System.out.println("Digite o numero B: ");
		int b = scan.nextInt();
		
		Calculadora calc = new Calculadora();
		int resultado = 0;
		if (operacao == 1){
			resultado = calc.soma(a, b);
		}
		else if (operacao == 2){
			resultado = calc.multiplicacao(a, b);
		}
		else if (operacao == 3){
			resultado = calc.subtracao(a, b);
		}
		else if (operacao == 3){
			resultado = calc.divisao(a, b);
		}
		System.out.printf("Resultado = %d \n", String.valueOf(resultado);
		scan.close();
	}
}
