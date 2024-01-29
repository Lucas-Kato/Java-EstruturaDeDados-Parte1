package br.com.treinaweb.estruturaDados.main;

import java.util.Scanner;
import java.util.Vector;

import br.com.treinaweb.estruturaDados.modelos.Pessoa;
import br.com.treinaweb.estruturadedados.Vetor;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a opção que desejada: ");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. Vetores");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		}
		scanner.close();
	}

	private static void fazerGerenciamentoMemoria() {
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println("-----------------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("-----------------------------");
		Pessoa p1 = new Pessoa(1, "GH");
		System.out.println(p1.toString());
		Pessoa p2 = p1;
		System.out.println(p2.toString());
		System.out.println("-----------------------------");
		p2.setNome("Felipe");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1 == p2);

	}

	private static void fazerVetor() {
		// indice começa com 0
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>(3);
		vetorPessoas.inserir(new Pessoa(1, "Thiago Santana"));
		vetorPessoas.inserir(new Pessoa(2, "Felipe"));
		vetorPessoas.inserir(new Pessoa(3,"Ana Rodrigues"));
		vetorPessoas.inserir(new Pessoa(4, "Frizzo"));
		vetorPessoas.inserirEm(1, new Pessoa(5, "Nicholas"));
		System.out.println(vetorPessoas.toString());
	}
}
