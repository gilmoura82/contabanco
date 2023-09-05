import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Olá, informa seus dados bancários: " + "\n" + "Informe o nº da sua conta: ");
		int numConta = terminal.nextInt();
		System.out.print("Nº da agência: ");
		String agencia = terminal.next();
		System.out.print("Nome do Titular: ");
		String nomeCliente = terminal.next();
		System.out.print("Sobrenome do Titular: ");
		String sobrenomeCliente = terminal.next();
		double saldo = 237.48; 		
		
		System.out.println("Olá ["+ nomeCliente +" " + sobrenomeCliente + "]" + " obrigado por criar uma conta em nosso banco" + "\n" + 
		"Sua agência é [" + agencia +"]" + ", conta [" + numConta + "]" + " e seu saldo [" + saldo + "]" + " já está disponível para saque!!!"  );
				
	}

}
