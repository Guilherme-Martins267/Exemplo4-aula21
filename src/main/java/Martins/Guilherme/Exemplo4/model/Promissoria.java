package Martins.Guilherme.Exemplo4.model;

public class Promissoria {
    private String promissoria;

    public Promissoria() {
    }

    public Promissoria(String promissoriaromissoria) {
        this.promissoria = promissoria;
    }

    public String getPromissoria() {
        return promissoria;
    }

    public void setPromissoria(String promissoria) {
        this.promissoria = promissoria;
    }

    @Override
    public String toString() {
        return "Promissoria{" +
                "Promissoria='" + promissoria + '\'' +
                '}';
    }
}


