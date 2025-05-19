package Q3_ProblemaComposição;

public class Main {
    public static void main(String[] args) {
        // Cadastro de um computador completo
        Computador pc1 = new Computador(
                "Acer", "Aspire 3", "Intel Core i3", 12,
                "ASUS", "B460M", 4, "DDR4"
        );

        // Exibição de informações
        pc1.infoComputador();

        // Atualização dos dados da placa-mãe via objeto Computador
        pc1.atualizarPlacaMae("Gigabyte", "B560M", 2, "DDR4");

        // Exibir novamente para verificar a atualização
        pc1.infoComputador();
    }
}
