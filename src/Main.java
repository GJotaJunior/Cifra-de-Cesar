import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String cifra = "";
			char aux;

			System.out.print("Informe a mensagem: ");
			String message = sc.nextLine();

			System.out.print("Informe a chave: ");
			int key = sc.nextInt();

			for (int i = 0; i < message.length(); i++) {
				// LETRAS MAIUSCULAS
				if (message.charAt(i) >= 65 && message.charAt(i) <= 90) {
					if (message.charAt(i) + key > 90) {
						aux = (char) (message.charAt(i) + key - 90);
						cifra += (char) (64 + aux);
					} else {
						cifra += (char) (message.charAt(i) + key);
					}
				} // LETRAS MINUSCULAS
				else if (message.charAt(i) >= 97 && message.charAt(i) <= 122) {
					if ((int) (message.charAt(i) + key) > 122) {
						aux = (char) (message.charAt(i) + key - 122);
						cifra += (char) (96 + aux);
					} else {
						cifra += (char) (message.charAt(i) + key);
					}
				} // OUTROS CARACTERES
				else {
					cifra += message.charAt(i);
				}
			}
			System.out.printf("Cifra de César: %s\n", cifra);
		}
	}
}
