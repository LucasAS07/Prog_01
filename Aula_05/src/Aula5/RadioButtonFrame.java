package Aula5;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame {
	
	private JTextField textField; 
	private Font plainFont; 						//  TEXTO COM FONTE SIMPLES
	private Font boldFont; 							// FONTE EM NEGRITO
	private Font italicFont; 						// FONTE EM ITALICO
	private Font boldItalicFont; 					// FOTNE NEGRITO E ITALICO
	private JRadioButton plainJRadioButton; 		// SELECIONA TEXTO SIMPLES 
	private JRadioButton boldJRadioButton;  		// SELECIONA TEXTO NEGRITO 
	private JRadioButton italicJRadioButton;      	// SELECIONA TEXTO ITALICO 
	private JRadioButton boldItalicJRadioButton;  	// NEGRITO E ITALICO
	private ButtonGroup radioGroup;

// CONSTRUTOR
	
	public RadioButtonFrame() {
	 super( "ATIVIDADE AULA 5" ); // TITULO DO FRAME
	 setLayout( new FlowLayout() ); 
	 
// ADICIONANDO COMPONETES AO FRAME
	
	 textField = new JTextField( "Mudança no estilo da fonte", 25 );
	 add( textField ); 
	
	 // BOTÕES PARA OPÇÕES
	 
	 plainJRadioButton = new JRadioButton( "Plain", true ); 
	 boldJRadioButton = new JRadioButton( "Bold", false ); 
	 italicJRadioButton = new JRadioButton( "Italic", false ); 
	 boldItalicJRadioButton = new JRadioButton( "Bold/Italic", false );
	 add( plainJRadioButton ); 
	 add( boldJRadioButton ); 
	 add( italicJRadioButton ); 
	 add( boldItalicJRadioButton ); 
	
	 // CRIA RELACIONAMENTO LOGICO ENTRE JRADIOBUTTONS
	 
	 radioGroup = new ButtonGroup(); 
	 radioGroup.add( plainJRadioButton ); 
	 radioGroup.add( boldJRadioButton ); 
	 radioGroup.add( italicJRadioButton ); 
	 radioGroup.add( boldItalicJRadioButton );
	
	 // CRIA FONTE OBJETOS
	 
	 plainFont = new Font( "Serif", Font.PLAIN, 14 );
	 boldFont = new Font( "Serif", Font.BOLD, 14 );
	 italicFont = new Font( "Serif", Font.ITALIC, 14 );
	 boldItalicFont = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
	 textField.setFont( plainFont ); 
	 
	
	 plainJRadioButton.addItemListener( 
	 new RadioButtonHandler( plainFont ) ); 
	 boldJRadioButton.addItemListener( 
	 new RadioButtonHandler( boldFont ) ); 
	 italicJRadioButton.addItemListener( 
	 new RadioButtonHandler( italicFont ) ); 
	 boldItalicJRadioButton.addItemListener( 
	 new RadioButtonHandler( boldItalicFont ) );
	 } 
	
	private class RadioButtonHandler implements ItemListener{
	 private Font font; 
	
	 public RadioButtonHandler( Font f ){
	 font = f; 
	 } 
	 
	 // TRATA EVENTOS DO BOTÃO OPÇÃO 
	 public void itemStateChanged( ItemEvent event ){
	 textField.setFont( font ); 
	 } 
   }
}

