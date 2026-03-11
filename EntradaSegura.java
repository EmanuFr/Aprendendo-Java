import java.util.Scanner;

public class EntradaSegura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o ano em que voce nasceu");
            int ano = leitor.nextInt();

            System.out.println("Voce com certeza viveu incriveis " + (2026 - ano) + " anos intensamente");
        } catch (Exception e) {
            System.out.println("Infelizmente voce colocou um tipo de variavel que nao é aceito!");
        }
        leitor.close();
    }
}
