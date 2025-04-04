import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o valor em saldo: ");
        double saldo = scanner.nextDouble();

        String nomeCliente = nome + ( sobrenome);

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque");

    }
    
    }


