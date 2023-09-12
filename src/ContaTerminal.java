

public class ContaTerminal {

	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println("Ola! Seja bem-vindo ao Santander. Vamos cadastrar sua conta agora.");
		conta.setNomeCliente(Teclado.lerString("Digite o nome completo do cliente"));
		conta.setAgencia(Teclado.lerString("Digite a agencia"));
		conta.setNumero(Teclado.lerInteiro("Digite o numero da conta"));
		conta.setSaldo(Teclado.lerBigDecimal("Digite o saldo da conta"));
		System.out.println(conta);
		System.out.println("Ate logo! ");

	}
}
