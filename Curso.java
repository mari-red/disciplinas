import java.util.ArrayList;

public class Curso {

    private String nome;
    private ArrayList<String> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplina(String disciplina) {
        this.disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Curso:"+ this.nome + "\nDisciplinas: " +this.disciplinas;
    }
}
