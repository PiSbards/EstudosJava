public class Livro extends Produto{
    private String autor;
    private int paginas;

    public Livro(String nome, Double preco, String autor, int paginas) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean ehGrande(){
        return (paginas > 200);
    }
}
