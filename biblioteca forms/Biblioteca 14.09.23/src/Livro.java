public class Livro {
    private String exemplar;
    private String autor;
    private int edicao;
    private int ano;
    private char disponibilidade;

    public Livro(String exemplar, String autor, int edicao, int ano, char disponibilidade) {
        this.exemplar = exemplar;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.disponibilidade = disponibilidade;
    }

}
