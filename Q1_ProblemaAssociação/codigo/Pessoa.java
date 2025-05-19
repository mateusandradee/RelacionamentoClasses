package Q1_ProblemaAssociação;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void usarCarro(Carro carro) {
        System.out.println("A pessoa dirigiu o carro "+carro.getModelo());
    }
}
