import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Curso c1 = new Curso("Computer science");
        c1.addDisciplina("d1");
        c1.addDisciplina("d2");
        c1.addDisciplina("d3");
        System.out.println(c1);
    }
}
