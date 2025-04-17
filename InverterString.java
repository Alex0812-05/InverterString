import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine(); // Lê a string digitada pelo usuário

        // Cria um objeto StringBuilder para inverter a string
        StringBuilder stringInvertida = new StringBuilder(input);

        // Inverte a string usando o método reverse()
        stringInvertida.reverse();

        // Exibe a string invertida
        System.out.println("String invertida: " + stringInvertida.toString());

        scanner.close(); // Fecha o scanner
    }
}
