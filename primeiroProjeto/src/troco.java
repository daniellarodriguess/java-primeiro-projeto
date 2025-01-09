import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("- Cálculo do troco de uma mercearia. -\n");

        // Dados do cálculo do troco

        System.out.print("Informe o valor, sendo ele preço unitário, do produto que a pessoa deseja comprar: ");
        double precoUnitario = sc.nextDouble();

        System.out.print("\nInforme a quantidade, desse produto, comprada: ");
        int quantidadeProduto = sc.nextInt();

        System.out.print("\nInforme o dinheiro recebido pelo cliente: ");
        double valorRecebido = sc.nextDouble();

        // Cálculo do troco 

        double valorTotal = precoUnitario * (double) quantidadeProduto;
        double troco = valorRecebido - valorTotal;

        // Mensagem informando o troco

        System.out.println("\nO valor do troco é: " + troco);

        sc.close();
    }
}
