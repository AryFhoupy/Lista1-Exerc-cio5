import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Quantos metros você deseja converter?");
        float metros = entrada.nextFloat();

        float centimetros = metros * 100;

        System.out.printf("%.1f", centimetros);

        entrada.close();
    }
}
