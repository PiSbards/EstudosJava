public class Casa {
    String nome;
    String cor;
    int numero;
    int tamanho;

    public Casa(String nome, String cor, int numero, int tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.numero = numero;
    }

    public void abrirPorta(){
        System.out.println("Porta Aberta");
    }
    public void fecharPorta(){
        System.out.println(("Porta fechada"));
    }
    public void demolirCasa(){
        while(tamanho > 0){
            System.out.println("Derrubei 10m²");
            tamanho-=10;
        }
        System.out.println("Casa demolida");
    }
    public void reconstruirCasa(){

        for(int i=0;i<100; i++){
            tamanho +=1;
            System.out.println(tamanho);
        }
        System.out.println("Casa Reconstruida!");
    }
}
