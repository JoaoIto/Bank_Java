package models;

public class Conta {
    /*
     * Criando variáveis padrão do objeto de conta, (saldo: valor numérico; e conta:
     * valor em caracteres[nome da conta];)
     */
    float saldo;
    String conta;

    public Conta(String conta) {
        /* Função da variável de string conta; */
        saldo = 0;
        this.conta = conta;
    }

    /*
     * As funções a seguir são as operações matemáticas que o código fará assim que
     * receber cada comando ao criar uma conta de usuário novo.
     * No caso, a de depósito irá somar ao valor de saldo e a de saque, irá subtrair
     * o valor na susa conta;
     */
    public void depositar(float deposito) {
        saldo += deposito;
    }

    /*
     * Nessa operação ainda é colocado, que quando o usuário não pode tentar sacar
     * qualquer valor, já que se o valor da operação for maior que o que ele já
     * estiver em saque, ele deve transmitir na tela, uma mensagem de erro!
     */
    public void sacar(float sacar) {
        if (sacar > saldo) {
            System.out.println("Erro!");
        } else {
            saldo -= sacar;
        }
    }

    public String toString() {
        return "Saldo: " + saldo;
    }
}
