public class Produto {
    //ATRIBUTOS
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public boolean ehCaro() {
        return (preco > 100);
    }
}
