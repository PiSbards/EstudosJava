public class Gato extends Animal{
    public Gato(String nome, int numeroPatas) {
        super(nome, numeroPatas);
    }

    @Override
    public void som() {
        System.out.println("MIAU!");
    }
}
