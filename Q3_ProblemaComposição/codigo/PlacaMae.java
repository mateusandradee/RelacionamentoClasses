package Q3_ProblemaComposição;

public class PlacaMae {
    private String fabricante;
    private String chipset;
    private int nSlots;
    private String tipoMemoria;

    public PlacaMae(String fabricante, String chipset, int nSlots, String tipoMemoria) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.nSlots = nSlots;
        this.tipoMemoria = tipoMemoria;
    }

    public void infoPlacaMae() {
        System.out.println("    Fabricante: " + fabricante);
        System.out.println("    Chipset: " + chipset);
        System.out.println("    nSlots: " + nSlots);
        System.out.println("    tipoMemoria: " + tipoMemoria);
    }

    public void atualizarDados(String fabricante, String chipset, int numeroSlots, String tipoMemoria) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.nSlots = numeroSlots;
        this.tipoMemoria = tipoMemoria;
    }
}
