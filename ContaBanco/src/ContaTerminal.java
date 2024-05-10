import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, Digite o numero da conta:");
        int numeroConta = scan.nextInt();
        scan.nextLine(); // usado para limpar o cache do enter

        System.out.print("Digite o  numero da sua agencia: ");
        String numeroAgencia = scan.nextLine();

        System.out.print("Digite o  seu nome: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Digite o  seu saldo: ");
        double saldo = scan.nextDouble();


    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia  + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");  

    }
}
