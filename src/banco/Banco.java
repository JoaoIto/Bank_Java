package banco;

import models.Conta;

public class Banco {
    public static void main(String[] args) {
        /*
         * Criando dois objetos de conta (a e b) que terão as propriedades da classe
         * conta, localizada em models.Conta;
         */
        Conta a = new Conta("Conta 1");
        Conta b = new Conta("Conta 2");
        System.out.println(a.toString());
        System.out.println(b.toString());

        /*
         * Operação exemplar, na qual depositei um valor qualque e houve uma alteração
         * no saldo da conta a; 
         */
        a.depositar(125);
        System.out.println(a.toString());
        a.sacar(25);
        System.out.println(a.toString());
    }
}
