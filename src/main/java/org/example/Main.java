package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computador = "", jogador = "";
        int pontosJogador = 0, pontosComputador = 0;
        boolean novamente = true;
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Bem vindo ao Azilo \n" +
                "Escolha entre pedra, papel ou tesoura para jogar\n" +
                "Caso queira sair digite (sair)");

        while (novamente) {
            computador = opcoes[random.nextInt(3)];
            System.out.println("Sua escolha:");
            jogador = scanner.nextLine();
            if (!jogador.equalsIgnoreCase("Pedra") &&
                    !jogador.equalsIgnoreCase("Papel") &&
                    !jogador.equalsIgnoreCase("Tesoura"))

                continue;

            System.out.println("O Computador escolheu\n" + computador);
            if (jogador.equalsIgnoreCase(computador)) {
                System.out.println("Empate");

            } else if (jogador.equalsIgnoreCase("Pedra") && computador.equalsIgnoreCase("Tesoura") ||
                    (jogador.equalsIgnoreCase("Papel") && computador.equalsIgnoreCase("Pedra")) ||
                    (jogador.equalsIgnoreCase("Tesoura") && computador.equalsIgnoreCase("Papel"))) {
                System.out.println("GANHOU");
                pontosJogador++;
            } else {
                System.out.println("Voce perdeu");
                pontosComputador++;
            }


            System.out.println(("Placar:Jogador" + pontosJogador + "\nPlacar:Maquina" + pontosComputador));
            System.out.println("FIM");
        }

        scanner.close();
    }


}
