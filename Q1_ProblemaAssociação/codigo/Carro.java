package Q1_ProblemaAssociação;

public class Carro {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void dirigir(){
        System.out.println("O modelo de carro "+modelo+" foi dirigido com sucesso!");
    }
}
