package Q2_ProblemaAgregação;

public class Curso {
    private String nome;
    private String descricao;
    private double cargaHoraria;
    private int nivel;

    public Curso(String nome, String descricao, double cargaHoraria, int nivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void infoCurso() {
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Carga Horaria: " + cargaHoraria+" horas");
        System.out.println("Nivel(0-10): " + nivel);
    }

    public void cadastrarCurso(Instrutor instrutor) {
        System.out.println("Instrutor(a) " + instrutor.getNome()+" cadastrado(a) no Curso de " + getNome());
    }
}
