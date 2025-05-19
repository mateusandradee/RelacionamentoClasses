package Q4_GerenciamentoHospital;

import java.util.ArrayList;
import java.util.List;

public class UnidadeAtendimento {
    private String nome;
    private List<Medico> medicos;

    public UnidadeAtendimento(String nome) {
        this.nome = nome;
        this.medicos = new ArrayList<>();
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void exibirInformacoes() {
        System.out.println("  Unidade: " + nome);
        System.out.println("    Médicos:");
        for (Medico medico : medicos) {
            System.out.println("      " + medico.getNome());
        }
    }
}

