public class Caminhao extends Veiculos {
    private double cargaMaxima;

    public Caminhao(String marca, String modelo, int ano, double preco, double cargaMaxima) {
        super(marca, modelo, ano, preco);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    public void imprimirInformacoesCaminhao(){
        imprimirInformacoes();
        System.out.println("\nCarga Máxima: "+cargaMaxima+"T");
    }
}
