public class Moto extends Veiculos {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, double preco, int cilindrada) {
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void imprimirInformacoesMoto(){
        imprimirInformacoes();
        System.out.println("\nCilindradas: "+cilindrada);
    }
}
