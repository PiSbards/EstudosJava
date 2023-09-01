public class Livros {
    String nome;
    String autor;
    String editora;
    int ano;

    public Livros(String nome, String autor, String editora, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public void abrir(){
        System.out.println("Abriu livro:");
        System.out.println(nome);
    }
    public void fechar(){
        System.out.println("Fechou livro:");
        System.out.println(nome);
    }
}
