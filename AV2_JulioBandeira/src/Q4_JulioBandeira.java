import java.util.Scanner;
public class Q4_JulioBandeira{
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		String frase = entrada.nextLine();
		String[] tokens = frase.split(" ");
		for (String token : tokens) {
            if (token.startsWith("s") || token.startsWith("S")) {
                System.out.print(token + " ");
            }
        }
		
		
		
	}
}