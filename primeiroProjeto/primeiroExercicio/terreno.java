import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução do programa

        System.out.println("- Cálculo de terreno, buscando saber o seu preço -");
        System.out.println("\n");

        // Dados do terreno

        System.out.print("Digite o valor da largura do terreno: ");
        double larguraTerreno = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimentoTerreno = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double metroQuadrado = sc.nextDouble();
        System.out.println("\n");

        // Cálculos que envolvem o terreno

        double areaTerreno = larguraTerreno * comprimentoTerreno;
        double precoTerreno = metroQuadrado * areaTerreno;

        // Mensagens que apresentam os resultados dos cálculos que envolvem o terreno

        System.out.printf("A área do terreno é: %.2f metros². %n", areaTerreno);
        System.out.printf("O valor do terreno é: %.2f.", precoTerreno);

        sc.close();
    }
}
