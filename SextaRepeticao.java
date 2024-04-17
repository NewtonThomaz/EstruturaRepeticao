package estruturaRepeticao1;
import java.util.Scanner;

public class SextaRepeticao {

	public static void main(String[] args) {
		int fun;
		double s, st = 0, ms;

		Scanner ler = new Scanner (System.in);
		System.out.println("Quanros funcionarios sua empresa tem?");
		fun = ler.nextInt();
		for (int i= fun; i>=1; i--) {
			System.out.println("Quanto é o salario?");
			s = ler.nextDouble();
			st += s;
		}
		ms = st / fun;
		System.out.println("A média salarial de sua empresa é " + ms);
		ler.close();
	}
}