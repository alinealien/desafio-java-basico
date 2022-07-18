package DesafioSintaxe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);

            System.out.println("Por favor, digite o número da Agência:");
            int agencia = leitor.nextInt();

            Scanner leitor1 = new Scanner(System.in);

            System.out.println("Por favor, digite o seu Nome: ");
            String nomeCliente = leitor1.nextLine();

            Scanner leitor2 = new Scanner(System.in);

            System.out.println("Por favor, digite o número da Conta: ");
            int numero = leitor2.nextInt();

           Scanner leitor3 = new Scanner(System.in);

            System.out.println("Por favor, digite o número da Saldo: ");
            double saldo = leitor3.nextDouble();


        System.out.println(" Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: " +
                agencia + "," + " conta " + numero + " e seu saldo: " + saldo + " já está disponível para saque.");



    }
}
