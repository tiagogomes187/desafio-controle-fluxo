package br.dev.tiagogomes.entities;

import br.dev.tiagogomes.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {

			contar(parametroUm, parametroDois);

		}catch (ParametrosInvalidosException exception){
			System.out.println("O segundo parãmetro deve ser maior que o primeiro");
		}

		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois){
			throw new ParametrosInvalidosException("O segundo parãmetro deve ser maior que o primeiro");
		}else {
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
			for (int i = 0; i < contagem; i++) {
				System.out.printf("Imprimindo o número %s%n", i+1);
			}

		}
	}
}