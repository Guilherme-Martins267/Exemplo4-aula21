package Martins.Guilherme.Exemplo4.model;

public class Assassinos {
    private String nome;
    private int idade;
    private double habilidade;

    public Assassinos() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getHabilidade() {
        return this.habilidade;
    }

    public void setHabilidade(double habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public String toString() {
        return "Assassinos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", habilidade=" + habilidade +
                '}';
    }
}

