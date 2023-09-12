public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Pietro", 123456, 8.9f);
        Funcionario func1 = new Funcionario("Jorge", 15978, "TI");
        Professor prof = new Professor("Jorginho",789645, "TI", "Jorge e o Jorginho");

        aluno1.falarNome();
        func1.falarNome();
        prof.falarNome();
        System.out.println("======================");

        aluno1.quemSouEu();
    }
}
