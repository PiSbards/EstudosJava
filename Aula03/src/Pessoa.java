public abstract class Pessoa {
    private String nome;
    private int matricula;

    public Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public void falarNome(){
        System.out.println(nome);
    }
    public void quemSouEu(){
        System.out.println("Eu sou uma pessoa!");
    }
}
