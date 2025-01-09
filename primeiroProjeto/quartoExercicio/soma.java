import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Informações do programa
        
        System.out.println("- Soma das variáveis, de valor inteiro, X e Y - \n");

        // Dados de X e Y 

        System.out.print("Informe o valor de X: ");
        int x = sc.nextInt();

        System.out.print("\nInforme o valor de Y: ");
        int y = sc.nextInt();

        // Soma das variáveis 

        int soma = x + y;

        // Mensagem mostrando o resultado

        System.out.println("\nO resultado da soma é: " + soma);

        sc.close();
    }
}
