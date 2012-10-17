/***********************
 ******RICHARD LUU******
 ***********************/

package code.richard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class WindowDesign extends JFrame {
////////DATA VARIABLE
		JPanel blankPanel; 
		JPanel centerPanel, eastPanel;
		JLabel fName, lName, acc, add, add2, city,
			   bal, state, zip, regStatus;
		JTextField fNameText, accText, addText, add2Text, cityText,
			       lNameText, balText, stateText, zipText;
		JButton findS, newS, deleteS, updateS; 
		JComboBox<String> diplomas;
		JRadioButton stoppedButton, clearButton;
		JScrollPane resize;
		String [] degrees = {"Non-Matriculated" , "Undergraduate",
				"Graduate", "Postgraduate"};
		
////////CODE
	public WindowDesign()
	{
		super("Student Records");
		
		BufferedImage image = null; //Importing and setting window icon
		try {
			image = ImageIO.read(getClass().getResource("/cuny.gif"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		setIconImage(image);
		setLayout(new BorderLayout());
		///////CONFIGURING CENTER PANEL USING GRIDBAGLAYOUT
		centerPanel = new JPanel(new GridBagLayout());
		centerPanel.setBackground(Color.WHITE);
		
		//WEST LABELS
		fName = new JLabel ("First Name: ");
		acc = new JLabel ("Account #: ");
		add = new JLabel ("Address: ");
		add2 = new JLabel ("Address (cont): ");
		city = new JLabel ("City: ");
		
		GridBagConstraints a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 0;
		a.gridy = 0;
		a.ipady = 10;
		a.gridwidth = 1;
		centerPanel.add(fName, a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 0;
		a.gridy = 1;
		a.ipady = 10;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(acc,a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 0;
		a.gridy = 2;
		a.ipady = 10;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(add,a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 0;
		a.gridy = 3;
		a.ipady = 10;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(add2,a);

		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 0;
		a.gridy = 4;
		a.ipady = 10;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(city,a);
		
		//WEST TEXTFIELD
		fNameText = new JTextField(25);
		accText = new JTextField(10);
		addText = new JTextField(25);
		add2Text = new JTextField(25);
		cityText = new JTextField(25);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 1;
		a.gridy = 0;
		a.ipady = 10;
		a.gridwidth = 2;
		a.weightx = 0.5;
		centerPanel.add(fNameText,a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 1;
		a.gridy = 1;
		a.ipady = 10;
		a.gridwidth = 1;
		centerPanel.add(accText,a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 1;
		a.gridy = 2;
		a.ipady = 10;
		a.gridwidth = 2;
		a.weightx = 0.5;
		centerPanel.add(addText,a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 1;
		a.gridy = 3;
		a.ipady = 10;
		a.gridwidth = 2;
		a.weightx = 0.5;
		centerPanel.add(add2Text,a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 1;
		a.gridy = 4;
		a.ipady = 10;
		a.ipadx = 10;
		a.gridwidth = 2;
		a.weightx = 0.5;
		centerPanel.add(cityText,a);
		
		//CENTER LABELS
		lName = new JLabel ("Last Name: ");
		bal = new JLabel ("Balance: ");
		state = new JLabel ("State: ");
		zip = new JLabel ("Zip Code: ");
		
		a = new GridBagConstraints();
		a.insets = new Insets(0, 30, 0, 0);
		a.gridx = 3;
		a.gridy = 0;
		a.ipady = 10;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(lName, a);
		
		a = new GridBagConstraints();
		a.insets = new Insets(0, 30, 0, 0);
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 3;
		a.gridy = 1;
		a.ipady = 10;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(bal, a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.WEST;
		a.insets = new Insets(0, 30, 0, 0);
		a.gridx = 3;
		a.gridy = 4;
		a.ipady = 10;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(state, a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 5;
		a.gridy = 4;
		a.ipady = 10;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(zip, a);
		
		//CENTER TEXTFIELDS
		lNameText = new JTextField(25);
		balText = new JTextField(12);
		stateText = new JTextField(3);
		zipText = new JTextField(12);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 4;
		a.gridy = 0;
		a.ipady = 10;
		a.gridwidth = 3;
		a.weightx = 0.5;
		centerPanel.add(lNameText,a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 4;
		a.gridy = 1;
		a.ipady = 10;
		a.gridwidth = 1;
		balText.setEditable(false);
		centerPanel.add(balText,a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 4;
		a.gridy = 4;
		a.ipady = 10;
		a.gridwidth = 1;
		centerPanel.add(stateText,a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 6;
		a.gridy = 4;
		a.ipady = 10;
		centerPanel.add(zipText,a);
		
		//////CONFIGURING EAST PANEL USING GRIDBAGLAYOUT
		eastPanel = new JPanel(new GridBagLayout());
		eastPanel.setBackground(Color.WHITE);
		
		diplomas = new JComboBox<String> (degrees);
		findS = new JButton("Find Student ");
		newS = new JButton("New Student ");
		updateS = new JButton("Update Student ");
		deleteS = new JButton("Delete Student ");
		stoppedButton = new JRadioButton("Stopped ");
		clearButton = new JRadioButton("Clear ");
		regStatus = new JLabel("Registration Status");
		///CONFIGURING RADIO BUTTONS & ADDING TO BUTTONGROUP
		stoppedButton.setSelected(true);
		stoppedButton.setBackground(Color.WHITE);
		clearButton.setBackground(Color.WHITE);
		
		ButtonGroup group = new ButtonGroup();
		group.add(stoppedButton);
		group.add(clearButton);
		
		a = new GridBagConstraints();
		a.insets = new Insets(10, 0, 0 , 0);
		a.gridx = 0;
		a.gridy = 0;
		eastPanel.add(diplomas, a);
		
		a = new GridBagConstraints();
		a.insets = new Insets(10, 0, 0 , 0);
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 0;
		a.gridy = 1;
		eastPanel.add(regStatus, a);
		
		a = new GridBagConstraints();
		a.insets = new Insets(10, 0, 0 , 0);
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 0;
		a.gridy = 2;
		eastPanel.add(stoppedButton, a);
		
		a = new GridBagConstraints();
		a.insets = new Insets(10, 0, 0 , 0);
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 0;
		a.gridy = 3;
		eastPanel.add(clearButton, a);
		
		a = new GridBagConstraints();
		a.insets = new Insets(10, 0, 0 , 0);
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 0;
		a.gridy = 4;
		eastPanel.add(findS, a);
		
		a = new GridBagConstraints();
		a.insets = new Insets(10, 0, 0 , 0);
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 0;
		a.gridy = 5;
		eastPanel.add(newS, a);
		
		a = new GridBagConstraints();
		a.insets = new Insets(10, 0, 0 , 0);
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 0;
		a.gridy = 6;
		eastPanel.add(deleteS, a);
		
		a = new GridBagConstraints();
		a.insets = new Insets(10, 0, 0 , 0);
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 0;
		a.gridy = 7;
		eastPanel.add(updateS, a);
		
		//ADDING CENTER AND EAST PANEL TO BLANKPANEL
	    blankPanel = new JPanel( new BorderLayout());
		blankPanel.setBackground(Color.WHITE);
		blankPanel.add(centerPanel);
		blankPanel.add(eastPanel, BorderLayout.EAST);
		
		resize = new JScrollPane(blankPanel);
		add(resize, BorderLayout.CENTER);
		
		repaint();
		validate();
	}
}
