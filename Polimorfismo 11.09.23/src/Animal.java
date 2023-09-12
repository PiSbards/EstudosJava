public abstract class Animal {
    protected static String nome;
    protected int numeroPatas;

    public abstract void som();

    public Animal(String nome, int numeroPatas) {
        this.nome = nome;
        this.numeroPatas = numeroPatas;
    }
}
