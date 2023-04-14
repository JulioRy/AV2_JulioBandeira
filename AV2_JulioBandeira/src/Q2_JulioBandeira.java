import java.util.Scanner;
public class Q2_JulioBandeira{
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int valor = 0;
		
		for(int i = 0; i < n;i++) {
		int num = entrada.nextInt();
		valor += num;
		
		}
		
		System.out.println(valor);
		
	}
}