package br.com.Sistema.Cartao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Compra> compras = new ArrayList<>();

        double saldo;
        System.out.println("Digite o limite do cartão: ");
        saldo = sc.nextDouble();
        sc.nextLine();

        int opcao = 1;
        while (opcao != 0) {
            System.out.println("Digite valor da compra? ");
            double valor = sc.nextDouble();
            if (saldo <= valor )
        }
    }
}
