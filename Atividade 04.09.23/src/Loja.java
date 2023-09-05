public class Loja {
    public static void main(String[] args) {
        Carro carro = new Carro("WV","Gol",2005,30.000,4);
        carro.imprimirInformacoesCarro();
        System.out.println("===================");
        Moto moto = new Moto("Honda","Biz",2020,15.000, 125);
        moto.imprimirInformacoesMoto();
        System.out.println("===================");
        Caminhao caminhao = new Caminhao("Scania","S-Sleeper Perfil Alto",2023,1.500000,13);
        caminhao.imprimirInformacoesCaminhao();
        System.out.println("===================");
    }
}
