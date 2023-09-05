public class Carro extends Veiculos{
    private int quantidadedePortas;

    public Carro(String marca, String modelo, int ano, double preco, int quantidadedePortas) {
        super(marca, modelo, ano, preco);
        this.quantidadedePortas = quantidadedePortas;
    }

    public int getQuantidadedePortas() {
        return quantidadedePortas;
    }

    public void setQuantidadedePortas(int quantidadedePortas) {
        this.quantidadedePortas = quantidadedePortas;
    }

    public void imprimirInformacoesCarro() {
        imprimirInformacoes();
        System.out.println("\nQuantidade de Portas: "+quantidadedePortas);
    }

}
