package Q4_GerenciamentoHospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private List<UnidadeAtendimento> unidades;

    public Hospital(String nome) {
        this.nome = nome;
        this.unidades = new ArrayList<>();
    }

    public void adicionarUnidade(UnidadeAtendimento unidade) {
        unidades.add(unidade);
    }

    public void exibirEstrutura() {
        System.out.println("Hospital: " + nome);
        for (UnidadeAtendimento unidade : unidades) {
            unidade.exibirInformacoes();
        }
    }
}

