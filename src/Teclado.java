

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

	private static Scanner scanner = new Scanner(System.in);

	public static String lerString(String texto) {
		System.out.println(texto);
		return scanner.nextLine();
	}

    public static int lerInteiro(String texto) {
        int valor;
        try {
            System.out.println(texto);
            valor = scanner.nextInt();
        } catch (InputMismatchException ex) {
            scanner.next(); // Consumir entrada inválida
            valor = lerInteiro("Por favor, digite um numero inteiro."); // Chamada recursiva após consumir a entrada inválida
        }
        return valor;
    }
	public static BigDecimal lerBigDecimal(String texto) {
        BigDecimal valor;
        try {
            System.out.println(texto);
            valor = scanner.nextBigDecimal();
        } catch (InputMismatchException ex) {
            scanner.next(); // Consumir entrada inválida
            valor = lerBigDecimal("Por favor, digite um numero inteiro."); // Chamada recursiva após consumir a entrada inválida
        }
        return valor;
	}

}
