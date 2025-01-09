import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        // Introdução do programa

        System.out.println("- Informe a base e a altura de um retângulo. Iremos informar sua área, seu perímetro e sua diagonal. - \n");

        // Dados do retângulo

        System.out.print("Base: ");
        double baseRetangulo = sc.nextDouble();

        System.out.print("Altura: ");
        double alturaRetangulo = sc.nextDouble();

        // Cálculos que envolvem o retângulo

        double areaRetangulo = baseRetangulo * alturaRetangulo;
        double perimetroRetangulo = (2 * baseRetangulo) + (2 * alturaRetangulo);
        double diagonalRetangulo = Math.sqrt(Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2));

        // Mensagens que contêm os resultados dos cálculos que envolvem o retângulo

        System.out.printf("Área do Retângulo: %.4f metros². %n", areaRetangulo);
        System.out.printf("Perímetro do Retângulo: %.4f metros. %n", perimetroRetangulo);
        System.out.printf("Diagonal do Retângulo: %.4f metros.", diagonalRetangulo);

        sc.close();
    }
}
