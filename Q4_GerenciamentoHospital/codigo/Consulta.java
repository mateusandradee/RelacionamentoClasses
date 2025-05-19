package Q4_GerenciamentoHospital;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String data;

    public Consulta(Medico medico, Paciente paciente, String data) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    public void exibirDetalhes() {
        System.out.println("Consulta:");
        System.out.println("  Médico: " + medico.getNome() + " (" + medico.getEspecialidade() + ")");
        System.out.println("  Paciente: " + paciente.getNome() + ", " + paciente.getIdade() + " anos");
        System.out.println("  Data: " + data);
    }
}