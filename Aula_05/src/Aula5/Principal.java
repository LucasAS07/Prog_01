package Aula5;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		TextFieldFrame textFieldFrame = new TextFieldFrame();
		textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textFieldFrame.setSize(540,320); // largura e altura
		textFieldFrame.setVisible(false);
		
		CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
		checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkBoxFrame.setSize(540,320); // largura e altura
		checkBoxFrame.setVisible(false);
		
		RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
		radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		radioButtonFrame.setSize( 300, 100 ); // largura e altura
		radioButtonFrame.setVisible( true ); 
		
			

	}

	
}
