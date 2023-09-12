public class Aluno extends Pessoa{
    private float nota;

    public Aluno(String nome, int matricula, float nota) {
        super(nome, matricula);
        this.nota = nota;
    }
    @Override
    public void quemSouEu(){
        quemSouEu();
        System.out.println("E eu sou um Aluno!");
    }
}
