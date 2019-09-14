import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os três digitos: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int digMaior = max(a, b, c);
		mostraTela(digMaior);
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;

		}
		return aux;
	}

	public static void mostraTela(int valor) {
		System.out.println("Maior: " + valor);
	}
}
