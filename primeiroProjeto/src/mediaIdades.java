import java.util.Scanner;

public class mediaIdades {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução do programa
        
        System.out.println("- Calcule a média das idades entre duas pessoas. - \n");

        // Informações sobre a primeira pessoa

        System.out.print("Digite o nome da primeira pessoa: ");
        String primeiroNome = sc.nextLine();
        System.out.print("Informe sua idade: ");
        int primeiraIdade = sc.nextInt();
        sc.nextLine(); 

        // Informações sobre a segunda pessoa

        System.out.print("\nDigite o nome da segunda pessoa: ");
        String segundoNome = sc.nextLine();
        System.out.print("Informe sua idade: ");
        int segundaIdade = sc.nextInt();

        // Média das idades

        double mediaIdades = (double) (primeiraIdade + segundaIdade)/2;

        // Mensagem informando a média das idades das duas pessoas

        System.out.println("\nA média das idades entre " + primeiroNome + " e " + segundoNome + " é: " + mediaIdades);

        sc.close();
    }
}
