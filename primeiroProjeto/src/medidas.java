import java.util.Scanner;

public class medidas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa 

        System.out.println("- Cálculo de medidas -\n");

        // Dados das medidas

        System.out.print("Digite a medida A: ");
        double a = sc.nextDouble();

        System.out.print("\nDigite a medida B: ");
        double b = sc.nextDouble();

        System.out.print("\nDigite a medida C: ");
        double c = sc.nextDouble();

        // Cálculos das medidas

        double areaQuadrado = Math.pow(a, 2);
        double areaTrianguloRetangulo = (a*b)/2;
        double areaTrapezio = ((a + b) * c)/2;

        // Mensagem informando o resultado dos cálculos das medidas

        System.out.println("\n- Quadrado de lado " + a + " -");
        System.out.printf("Resultado da área do quadrado é: %.4f. %n", areaQuadrado);

        System.out.println("\n- Triângulo retângulo de base " + a + " e altura " + b + " -");
        System.out.printf("Resultado da área do triângulo retângulo é: %.4f. %n", areaTrianguloRetangulo);

        System.out.println("\n- Trapézio de bases " + a + " e "+ b + ", e altura " + c + " -");
        System.out.printf("Resultado da área do trapézio é: %.4f. %n", areaTrapezio);

        sc.close();
    }
}
