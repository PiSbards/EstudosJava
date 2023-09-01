import java.util.Scanner;

public class PrimeiroProjeto {

    public static void main(String[] args) {
        //Variaveis
        System.out.println("Hello World!");
        System.out.println("==================");
        int soma, x,y;
        x = 10;
        y= 20;
        soma = x+y;
        System.out.println(soma);

        System.out.println("==================");
        boolean menor = x<20;
        System.out.println(menor);

        System.out.println("==================");
        float num = 1.5F;
        double num1 = 7.77;
        System.out.println(num);
        System.out.println(num1);

        System.out.println("==================");
        //Instanciando e relacionando outras classes
        Condicional c1 = new Condicional();//instanciando um objeto
        c1.comparar();

        System.out.println("==================");
        Casa casaPietro = new Casa("Pietro", "branca", 777, 300);
        System.out.println(casaPietro.cor);

        Casa casaJorge = new Casa("jorge","verde", 159, 150);
        System.out.println((casaJorge.cor));

        casaPietro.abrirPorta();
        System.out.println("==================");
        //Usando while
        casaPietro.demolirCasa();
        System.out.println(casaPietro.tamanho);
        System.out.println("==================");
        //Usando for
        casaPietro.reconstruirCasa();
        System.out.println(casaPietro.tamanho);

        //Livros
        Livros Alice = new Livros("Alice no país das Maravilhas", "Luis Carrol", "tds10", 1950);
        Livros Zara = new Livros("Zarastrusta", "Nietzsche","tds10", 1890);
        Alice.abrir();
        Alice.fechar();
        System.out.println("==================");
        Zara.abrir();
        Zara.fechar();


    }

}
