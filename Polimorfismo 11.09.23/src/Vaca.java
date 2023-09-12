public class Vaca  extends Animal{
    public Vaca(String nome, int numeroPatas) {
        super(nome, numeroPatas);
    }

    @Override
    public void som() {
        System.out.println("MUUUUUUUUUUU!");
    }
}
