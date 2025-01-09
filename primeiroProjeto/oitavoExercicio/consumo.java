import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Informações sobre o programa

        System.out.println("Cálculo do consumo médio de um carro. \n");

        // Dados sobre o carro

        System.out.print("Informe a distância percorrida pelo carro, em quilômetros: ");
        double distanciaCarro = sc.nextDouble();
        System.out.print("\nInforme o combustível gasto pelo carro, em litros, ao percorrer " + distanciaCarro +": ");
        double combustivelGastoCarro = sc.nextDouble();

        // Cálculo do consumo médio de um carro

        double consumoMedioCarro = distanciaCarro / combustivelGastoCarro;

        // Mensagem informando o consumo médio gasto

        System.out.printf("\nO consumo médio desse carro é: %.3f km/L. %n", consumoMedioCarro);

        sc.close();
    }
}
