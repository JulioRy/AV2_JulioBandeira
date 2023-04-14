import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q5_JulioBandeira{
    public static void main(String[] args) {
        String caminhoDoArquivo = "C:\\Users\\Julio\\Desktop\\ativ\\teste.txt";
        String palavraBuscada = "link";
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha = br.readLine();

            while (linha != null) {
                String[] palavras = linha.split("\\s+");
                for (String palavra : palavras) {
                    if (palavra.equalsIgnoreCase(palavraBuscada)) {
                        contador++;
                    }
                }
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        System.out.println("A palavra \"" + palavraBuscada + "\" aparece " + contador + " vezes no arquivo.");
    }
}
