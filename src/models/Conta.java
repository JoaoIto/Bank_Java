package models;

public class Conta {
    private String nome;
    private int idade;
    private float renda;
    private long cpf;

    public Pessoa(String nome, int idade, float renda, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public float getRenda(){
        return renda;
    }
    public long getCpf(){
        return cpf;
    }
}