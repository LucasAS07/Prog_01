package Aula5;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class CheckBoxFrame extends JFrame {
	private JTextField textField; 		// EXIBIÇÃO DO TEXTO
	private JCheckBox boldJCheckBox; 	// MODO NEGRITO
	private JCheckBox italicJCheckBox; 	// MODO ITALICO
	
	// CONSTRUTOR
	
	public CheckBoxFrame() {
		super("Atividade Aula 5"); // TITULO DO FRAME
		setLayout(new FlowLayout());
		
	// ADICIONANDO COMPONETES AO FRAME
		
		textField = new JTextField("Mudança no estilo da fonte",20);
		textField.setFont(new Font("Serif",Font.PLAIN, 14));
		add(textField);
		
		boldJCheckBox = new JCheckBox("Bold"); 		// CRIA CAIXA NEGRITO
		italicJCheckBox = new JCheckBox("Italic"); 	// CRIA CAIXA ITALICO
		add(italicJCheckBox);
		add(boldJCheckBox);
		
		CheckBoxHandler handler = new CheckBoxHandler();
		boldJCheckBox.addItemListener(handler);
		italicJCheckBox.addItemListener(handler);
		
	}
	
	private class CheckBoxHandler implements ItemListener{
		
		public void itemStateChanged(ItemEvent event) {
			
			Font font = null; //GUARDA A FONTE
			
			if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC,14);
			else if(boldJCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD, 14);
			else if(italicJCheckBox.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else
				font = new Font("Serif", Font.PLAIN, 14);
			
			textField.setFont(font);
		}
	}
	
	
}
