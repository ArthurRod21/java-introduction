package br.java.intro.calculadora.A;

import java.util.Scanner;

public class Calculadora {

	private static String[] operacoes = { "Soma", "Subtra��o", "Divis�o", "Multiplica��o", "Raiz Quadrada",
			"Exponencia�o" };
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		listarOperacoes();
		escolhaUsuario();
		scan.close();
		System.out.println("Obrigado trouxa agora trate de usar novamente a calculadora...otario");
	}

	private static void listarOperacoes() {
		System.out.println("Escolha a Opera��o desejada: ");

		for (int i = 0; i < operacoes.length; i++) {
			if (i % 2 != 0) {
				System.out.println(String.format("%s-%s", (i + 1), operacoes[i]) + "  ");
			} else {
				System.out.print(String.format("%s-%s", (i + 1), operacoes[i]) + "  ");
			}
		}
	}

	private static void escolhaUsuario() {

		int escolha = 999;

		while (escolha != 0) {
			System.out.println("Insira o n�mero da opera�o: (ou digite para desligar a calculadora) ");
			escolha = scan.nextInt();

			// switch � o equivalente a um interruptor de v�rias posi��es
			switch (escolha) {
			case 0: {
				escolha = 0;
				break;
			}
			case 1: {
				soma();
				break;
			}
			case 2: {
				subtracao();
				break;
			}
			case 3: {
				divisao();
				break;
			}
			case 4: {
				multiplicacao();
				break;
			}
			case 5: {
				raiz();
				break;
			}
			case 6: {
				exponenciacao();
				break;
			}

			default:
				throw new IllegalArgumentException("Valor Inesperado:" + escolha);
			}
		}

	}

	private static void soma() {
		System.out.println("Opera��o de Soma:");

		System.out.println("Primeiro n�mero:");
		int A = scan.nextInt();
		System.out.println("Segundo n�mero:");
		int B = scan.nextInt();

		int resultado = A + B;
		System.out.println(String.format("%s + %s = %s", A, B, resultado));

	}

	private static void subtracao() {
		System.out.println("opera�o de Subtra��o:");

		System.out.println("Primeiro n�mero:");
		int A = scan.nextInt();
		System.out.println("Segundo n�mero:");
		int B = scan.nextInt();

		int resultado = A - B;
		System.out.println(String.format("%s - %s = %s", A, B, resultado));

	}

	private static void divisao() {
		System.out.println("Opera��o de Divis�o");

		System.out.println("Primeiro n�mero:");
		int A = scan.nextInt();
		System.out.println("Segundo n�mero:");
		int B = scan.nextInt();

		int resultado = A / B;
		System.out.println(String.format("%s / %s = %s", A, B, resultado));
	}

	private static void multiplicacao() {
		System.out.println("Opera��o de Divisão");

		System.out.println("Primeiro n�mero:");
		int A = scan.nextInt();
		System.out.println("Segundo n�mero:");
		int B = scan.nextInt();

		int resultado = A * B;
		System.out.println(String.format("%s * %s = %s", A, B, resultado));
	}

	private static void raiz() {
		System.out.println("Opera��o de Raiz quadrada");

		System.out.println("Insira n�mero:");
		double A = scan.nextInt();

		double resultado = Math.sqrt(A);
		System.out.println(String.format("A raiz de %s � %s", A, resultado));
	}

	private static void exponenciacao() {
		System.out.println("Opera��o de exponencia��o");

		System.out.println("Primeiro n�mero:");
		double A = scan.nextInt();
		System.out.println("Expoente:");
		double B = scan.nextInt();

		double resultado = Math.pow(A, B);		
		System.out.println(String.format("%s ^ %s = %s", A, B, resultado));
	}
}