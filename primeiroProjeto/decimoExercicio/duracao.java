import java.util.Scanner;

public class duracao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução do programa

        System.out.println("- Informe o tempo, em segundos, e o programa irá retornar para você o tempo de duração em horas, minutos e segundos. -\n");

        // Dados do tempo

        System.out.print("Digite o tempo, em segundos: ");
        int tempo = sc.nextInt();

        // Cálculos de duração 

        int tempoHora = tempo / 3600;

        int restoMinuto = tempo % 3600;
        int tempoMinuto = restoMinuto / 60;

        int tempoSegundo = restoMinuto % 60;
        
        // Mensagem informando a duração

        System.out.println("\n" + tempoHora + ":" + tempoMinuto + ":" + tempoSegundo);

        sc.close();
    }
}
