package Q3_ProblemaComposição;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, int memoriaRAM,
                      String fabricante, String chipset, int nSlots, String tipoMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = new PlacaMae(fabricante, chipset, nSlots, tipoMemoria);
    }

    public void infoComputador() {
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Processador: " +processador);
        System.out.println("Memoria RAM: " +memoriaRAM);
        System.out.println("Placa-mãe:");
        placaMae.infoPlacaMae();
        System.out.println();
    }

    public void atualizarPlacaMae(String fabricante, String chipset, int nSlots, String tipoMemoria) {
        placaMae.atualizarDados(fabricante, chipset, nSlots, tipoMemoria);
    }
}
