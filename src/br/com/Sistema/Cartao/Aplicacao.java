package br.com.Sistema.Cartao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Compra> compras = new ArrayList<>();

        double saldo;
        System.out.print("Digite o limite do cartão: ");
        saldo = sc.nextDouble();
        sc.nextLine();

        int opcao = 1;
        while (opcao != 0) {
            System.out.print("Digite a descrição da compra: ");
            String descricao = sc.nextLine();

            System.out.print("Digite valor da compra: ");
            double valor = sc.nextDouble();
            sc.nextLine();

            if (valor <= saldo) {
                Compra compra = new Compra(descricao, valor);
                compras.add(compra);
                saldo -= valor;
                System.out.println("Compra realizada com sucesso!");
                System.out.print("Digite 0 para sair ou 1 para continuar: ");
                opcao = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Saldo Invalido!");
            break;
            }
        }
        Collections.sort(compras);
        System.out.println();

        for(Compra compra : compras) {
            System.out.println(compra);
        }

        System.out.println();
        System.out.println("Saldo do Cartão: " + saldo);

        sc.close();
    }
}
