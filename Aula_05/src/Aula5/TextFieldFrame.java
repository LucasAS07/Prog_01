package Aula5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
	
	// Argumentos 
	private JTextField 		txtField1;
	private JTextField 		txtField2;
	private JTextField 		txtField3;
	private JPasswordField 	txtPassword;
	private JButton 	 	btnEntrar;
	private JButton			btnOk;
	private JButton 		btnSair;
	
	
	// Construtor
	public TextFieldFrame() {
		super("Teste de Formulario"); 		// Titulo do Farame
		setLayout(new FlowLayout()); 		// setando o layout do frame
		
	// ADICIONANDO COMPONETES AO FRAME
		
		txtField1 = new JTextField(10); 	// criando o objeto
		add(txtField1);						//Colocando o objeto no frame
		
		txtField2 = new JTextField("Entre com seu Texto!");
		add(txtField2);
		
		txtField3 = new JTextField("Campo Desabilitado",21);
		txtField3.setEnabled(false);
		add(txtField3);
		
		txtPassword = new JPasswordField("Minha Senha");
		add(txtPassword);
		
		btnEntrar = new JButton("Entrar");
		add(btnEntrar);
		
		btnOk = new JButton("OK?");
		add(btnOk);
		
		btnSair = new JButton("Sair");
		add(btnSair);
		
		// ADICIONANDO EVENTOS AOS COMPONENTES
		
		btnEntrar.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Mensagem");
					}
				});
		
		txtField1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = String.format("txtField1: %s", txtField1.getText());
				JOptionPane.showMessageDialog(null, "O texto do txtField é: " + texto);
				
			}
		});
		
		txtPassword.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = String.format("%s", txtPassword.getText());
				JOptionPane.showMessageDialog(null, "Sua Senha é: " + texto);
				
			}
		});
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(
					JOptionPane.showConfirmDialog(null, "Não esta ok?","Titulo da mensagem", 
							JOptionPane.YES_NO_OPTION, 
							JOptionPane.QUESTION_MESSAGE
							) == 0
					) {
					JOptionPane.showMessageDialog(null, "Não Está OK!");
				}else {
					JOptionPane.showMessageDialog(null, "Esta ok?");
				}
					
					
					
				
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
	}
}
