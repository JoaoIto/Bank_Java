import models.Conta;
import banco.Banco;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa novaPessoa = new Pessoa("Joao", 17, 700, 123456789);
        System.out.println(novaPessoa.getNome());
        Conta conta1 = new Conta(novaPessoa, 123, 123456789);
        System.out.println(conta1.getNome());
    }
}