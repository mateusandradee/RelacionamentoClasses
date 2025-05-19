package Q2_ProblemaAgregação;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("POO", "Java", 102, 10);
        Instrutor instrutor1 = new Instrutor("Marcela Alves", "Eng de Software", "marcela.alves@unifesspa.edu.br", 7);

        curso1.infoCurso();
        curso1.cadastrarCurso(instrutor1);
    }
}
