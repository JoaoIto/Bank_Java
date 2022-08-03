# Banco 🏦

**Este é uma replicação básica de um projeto de banco e conta que já foi criado e postado <a href="https://github.com/JoaoIto/BankSistem">aqui</a> no perfil! Eu estou aprendendo Java e gostaria de praticar o básica para entender a sintaxe da linguagem.**

**Todas as linhas de códigos foram explicadas minuciosamente em cada arquivo...**

## Criando variáveis do objeto de conta:

Basicamente, um objeto de conta, só precisamos ter dois valores padrões para criá-la, o valor de entrada, e obviamente um nome, para diferenciar cada conta...

**Para isso cria-se, um objeto float, já que o valor é um valor numérico, porém, quando trabalhamos em banco, nem sempre o valor precisa ser dado inteiramente, por isso uma variável ```float```.**
```java
public class Conta {
    float saldo;
    String conta;
}
```

## Funções da conta:

As funções que incluiremos dentro do programa serão de: **Depósito e Saque**

### Saque:

**A função de saque, obviamente pega mais um valor da conta e sendo assim este valor é subtraído do saldo da conta automaticamente.**

**Ainda é colocado uma condicional, para que assim não ocorra o erro de conseguir sacar qualquer valor da conta, sendo assim, só poderá ser sacado um valor possível menor ou igual ao do próprio saldo.**

```java
public void sacar(float sacar) {
        if (sacar > saldo) {
            System.out.println("Erro!");
        } else {
            saldo -= sacar;
        }
    }
```

### Depósito: 

**Já a função de depósito, é de base um valor que o usuário escolhe a colocar em sua conta criada, assim esse valor é somado ao saldo que inicialmente é zero na conta.**

```java
public void depositar(float deposito) {
        saldo += deposito;
    }
```