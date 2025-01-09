import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Informações do programa

        System.out.println("- Cálculo da área do círculo -\n");

        // Dados do área do círculo

        double pi = 3.1415926;

        System.out.print("Informe o raio do círculo: ");
        double raioCirculo = sc.nextDouble();

        // Cálculo da área do círculo 

        double areaCirculo = pi * Math.pow(raioCirculo, 2);

        System.out.printf("\nO valor da área é: %.3f metros². %n", areaCirculo);

        sc.close();
    }

}
