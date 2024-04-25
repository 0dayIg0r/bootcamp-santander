package edu.igor.firstWeek.primeira_atividade;

import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agencia");
        String agencia = scanner.next();

        System.out.println("Nome:");
        String nome = scanner.next();

        System.out.println("Seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("AGENCIA: " + agencia);
        System.out.println("NÚMERO DA CONTA: " + numero);
        System.out.println("NOME: " + nome);
        System.out.println("SALDO: " + saldo);
    }
}
