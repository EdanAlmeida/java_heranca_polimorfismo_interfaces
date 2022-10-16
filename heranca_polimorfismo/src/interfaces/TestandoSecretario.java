package interfaces;

import javax.swing.JOptionPane;

import classes.Secretario;

/*Testando autenticação do Secretário*/
public class TestandoSecretario {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		if (permitirAcesso.autenticar()) {
			JOptionPane.showMessageDialog(null, "Acesso permitido!");
			JOptionPane.showMessageDialog(null, "Escolha uma das opções abaixo:");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Acesso negado!");
		}
	}

}
