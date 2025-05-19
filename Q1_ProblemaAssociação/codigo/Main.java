package Q1_ProblemaAssociação;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Mateus");
        Carro carro1 = new Carro("BMW");

        pessoa1.usarCarro(carro1);
        carro1.dirigir();
    }
}
