import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q7_JulioBandeira {
    public static void main(String[] args) {
        String nomeArquivo = "C:\\Users\\Julio\\Desktop\\ativ\\teste.txt"; 
        int soma = 0; 
        
   
        try {
            File arquivo = new File(nomeArquivo);
            Scanner leitor = new Scanner(arquivo);
            
           
            while (leitor.hasNextInt()) {
                int numero = leitor.nextInt();
                soma += numero;
            }
            
       
            leitor.close();
            
            System.out.println("A soma dos números do arquivo " + nomeArquivo + " é: " + soma);
            
        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não encontrado.");
            e.printStackTrace();
        }
    }
}
