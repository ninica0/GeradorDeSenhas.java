import java.util.Random;

import javax.swing.JOptionPane;

public class GeradorDeSenhas {

	public static void main(String[] args) {
		
		Random random = new Random();
		int senha = random.nextInt(999999)+1;
		int converter;
		
		converter = Integer.parseInt( JOptionPane.showInputDialog(null,"Deseja gerar nova senha?\n" + "1 - Sim\n"+"2 - Não" ));
		
		
	if (converter == 1) {
		JOptionPane.showInputDialog(null, "Você tem certeza?\n"+"1 - Sim\n"+"2 - Não");
			JOptionPane.showMessageDialog(null, "Esta é sua nova senha: "+ senha);
	}else {
		JOptionPane.showMessageDialog(null, "Painel em fechamento.");


	}
	
		

		}
	
	
	}
