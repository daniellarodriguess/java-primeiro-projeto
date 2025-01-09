import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("- Iremos informar o pagamento que o funcionário precisa receber -\n");

        // Dados para o pagamento

        System.out.print("Nome do funcionário: ");
        String nomeFuncionario = sc.nextLine();

        System.out.print("\nValor por hora trabalhada: ");
        double valorHora = sc.nextDouble();

        System.out.print("\nQuantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        // Cálculo do pagamento

        double calculoPagamento = valorHora * (double) horasTrabalhadas;

        // Mensagem informando o pagamento do funcionário

        System.out.println("\nO pagamento a ser realizado para " + nomeFuncionario + " deve ser de " + calculoPagamento);

        sc.close();
    }
}
