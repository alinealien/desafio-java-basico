package DesafioSintaxe;

import java.util.ArrayList;

public class ContaTerminal {

    private String nomeCliente;
    private String agencia;
    private Integer numero;
    private Double saldo;


    public ContaTerminal(String nomeCliente, String agencia , Integer numero, Double saldo){
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;


    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void imprimir() {

        System.out.println("Nome: " + this.getNomeCliente());
    }
}
