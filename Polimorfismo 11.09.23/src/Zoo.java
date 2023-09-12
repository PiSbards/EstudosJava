public class Zoo {
    public static void main(String[] args) {
        Vaca mimosa = new Vaca("Mimosa",4);
        Gato bichano = new Gato("Bichano",4);
        Carneiro shaun = new Carneiro("Shaun",4);

        Animal bichos [] = {mimosa,bichano,shaun};

        for(Animal animal:bichos ){
            System.out.println(Animal.nome + " é da classe " +animal.getClass().getName()+" tem "
                    +animal.numeroPatas+" patas e faz");
            animal.som();
            System.out.println("=============");
        }
    }
}
