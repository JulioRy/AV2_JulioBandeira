import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Random;

public class Q8_JulioBandeira extends JFrame implements ActionListener {
    
    JButton jogar;
    JButton[] botoes;
    int numGuess;
    int tentativas;
    int choice = -1;

    public Q8_JulioBandeira() {
        super();
        
        this.botoes = new JButton[20];
        for (int i = 0; i < 20; i++) {
            botoes[i] = new JButton(String.valueOf(i+1));
            botoes[i].addActionListener(this);
            this.add(botoes[i]);
        }
        
        this.jogar = new JButton("jogar");
        this.jogar.addActionListener(this);
        this.add(this.jogar);
        
        this.setLayout(new FlowLayout());
        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public int gerarnumero() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(20) + 1;
        System.out.println(" ");
        return numeroAleatorio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("jogar")) {
            int cn = gerarnumero();
            System.out.println("jogando... Numero Sorteado " + cn);
            if (cn == this.choice) {
                System.out.print("Parabens voce acertou");
                cn = gerarnumero();
                System.out.println("Gerando outro Numero...");
            } else {
                System.out.print("Perdeu");
                cn = gerarnumero();
                System.out.println("Gerando outro Numero...");
            }
        } else {
            for (int i = 0; i < 20; i++) {
                if (e.getSource() == botoes[i]) {
                    this.choice = i+1;
                    System.out.println("numero escolhido " + this.choice);
                }
            }
        }
    }

    public static void main(String[] args) {
    	Q8_JulioBandeira j = new Q8_JulioBandeira();
    }
}
