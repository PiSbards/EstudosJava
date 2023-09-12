public class Funcionario extends Pessoa{
    private String departamento;

    public Funcionario(String nome, int matricula, String departamento) {
        super(nome, matricula);
        this.departamento = departamento;
    }
    @Override
    public void quemSouEu(){
        quemSouEu();
        System.out.println("E eu sou um funcionário!");
    }
}
