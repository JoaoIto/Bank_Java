package banco;

import models.Conta;

public class Banco {
    private Pessoa titular;
    private int agencia, numeroConta;
    private float saldo;

    public Conta(Pessoa titular, int agencia, int numeroConta){
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        saldo = 0;
    }

    public float adicionaSaldo() {
        saldo += valor;
        return saldo;
    }

    public void removeSaldo() {
        saldo -= valor;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa Titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }
}
