package br.java.intro.calculadora.A;

import java.util.Scanner;

public class Calculadora {

	// TODO Listar operações: soma, subtração, divisão e multiplicação
	private static String[] operacoes = { "Soma", "Subtração", "Divisão", "Multiplicação", "Raiz Quadrada",
			"Exponenciação" };
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		listarOperacoes();
		escolhaUsuario();
		scan.close();
		System.out.println("Obrigado trouxa agora trate de usar novamente a calculadora...otario");
	}

	private static void listarOperacoes() {
		System.out.println("Escolha a Operação desejada: ");

		for (int i = 0; i < operacoes.length; i++) {
			if (i % 2 != 0) {
				System.out.println(String.format("%s-%s", (i + 1), operacoes[i]) + "  ");
			} else {
				System.out.print(String.format("%s-%s", (i + 1), operacoes[i]) + "  ");
			}
		}
	}

	// TODO criar um loop que busque a operacao escolhida pelo usuario
	// loops sao for, foreach e while
	private static void escolhaUsuario() {

		int escolha = 999;

		while (escolha != 0) {
			System.out.println("Insira o número da operação: (ou digite para desligar a calculadora) ");
			escolha = scan.nextInt();

			// switch e o equivalente a um interruptor de varias posições
			switch (escolha) {
			case 0:
				escolha = 0;
				break;
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
			default:
				throw new IllegalArgumentException("Valor Inesperado:" + escolha);
			}
		}

	}

	private static void soma() {
		System.out.println("operação de Soma:");

		System.out.println("Primeiro numero:");
		int A = scan.nextInt();
		System.out.println("Segundo numero:");
		int B = scan.nextInt();

		int resultado = A + B;
		System.out.println(String.format("%s + %s = %s", A, B, resultado));

	}

	private static void subtracao() {
		System.out.println("operação de Subtração:");

		System.out.println("Primeiro numero:");
		int A = scan.nextInt();
		System.out.println("Segundo numero:");
		int B = scan.nextInt();

		int resultado = A - B;
		System.out.println(String.format("%s - %s = %s", A, B, resultado));

	}

	private static void divisao() {
		System.out.println("Operação de Divisão");

		System.out.println("Primeiro numero:");
		int A = scan.nextInt();
		System.out.println("Segundo numero:");
		int B = scan.nextInt();

		int resultado = A / B;
		System.out.println(String.format("%s / %s = %s", A, B, resultado));

	}

	private static void multiplicacao() {
		System.out.println("Operação de Divisão");

		System.out.println("Primeiro numero:");
		int A = scan.nextInt();
		System.out.println("Segundo numero:");
		int B = scan.nextInt();

		int resultado = A * B;
		System.out.println(String.format("%s * %s = %s", A, B, resultado));
	}

	private static void raiz() {
		System.out.println("Operação de Raiz quadrada");

		System.out.println("Insira numero");
		double A = scan.nextInt();

		double resultado = Math.sqrt(A);
		System.out.println(String.format("A raiz de %s é %s", A, resultado));
	}

}
