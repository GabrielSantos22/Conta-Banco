import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome completo:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo em conta:");
        Double saldo = scanner.nextDouble();

        //System.out.println("Olá, + nomeCliente +, obrigado por criar uma conta em nosso banco, sua agência é + agencia +, conta + conta + e seu saldo + saldo + já está disponível para saque.");

        //int conta = Integer.parseInt(args[0]); //exemplo: 1021
        //int agencia = Integer.parseInt(args [1]); //exemplo: 067-8
        //String nomeCliente = args [2]; // exemplo: GABRIEL SANTOS
       // Double saldo = Double.valueOf(args [3]); // exemplo: 237.48




    }


}
