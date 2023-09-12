public class Professor extends Funcionario{
    private String livro;

    public Professor(String nome, int matricula, String departamento, String livro) {
        super(nome, matricula, departamento);
        this.livro = livro;
    }
    @Override
    public void quemSouEu(){
        quemSouEu();
        System.out.println("E ainda sou um Professor!");
    }
}
