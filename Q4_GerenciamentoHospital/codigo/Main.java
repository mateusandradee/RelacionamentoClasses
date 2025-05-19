package Q4_GerenciamentoHospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital Regional");

        UnidadeAtendimento upa = new UnidadeAtendimento("UPA");
        UnidadeAtendimento prontoSocorro = new UnidadeAtendimento("Pronto Socorro");

        hospital.adicionarUnidade(upa);
        hospital.adicionarUnidade(prontoSocorro);

        Medico m1 = new Medico("Dr. Mateus", "Cardiologia");
        Medico m2 = new Medico("Dra. Jucy", "Nutricionista");

        upa.adicionarMedico(m1);
        upa.adicionarMedico(m2);
        prontoSocorro.adicionarMedico(m1);

        hospital.exibirEstrutura();

        Paciente p1 = new Paciente("João", 45);
        Consulta consulta = new Consulta(m1, p1, "17/05/2025");

        consulta.exibirDetalhes();
    }
}