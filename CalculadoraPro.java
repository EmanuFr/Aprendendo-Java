import java.util.ArrayList;
import java.util.List;

public class CalculadoraPro {

    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            int resultado;

            switch (args[1]) {
                case "x":
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "+":
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "/":
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                    break;
            }
            ArrayList<String> historico = new ArrayList<>();
            historico.add(args[0] + " " + args[1] + " " + args[2]);
            for (String r : historico) {
                System.out.println(r);
            }

        } catch (Exception e) {
            System.out.println("Infelizmente nao foi seguido o modelo de args. Ex: 10 + 5");
        }
    }
}
