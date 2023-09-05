public class Loja {
    public static void main(String[] args) {
        //CRIANDO OBJETO
        Livro livro = new Livro("Republica", 101.0,"Platão",150 );
        System.out.println(livro.ehGrande());
        System.out.println(livro.ehCaro());
    }
}
