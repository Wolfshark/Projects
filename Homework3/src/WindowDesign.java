import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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

		JPanel blankPanel;
		JPanel centerPanel, eastPanel;
		JLabel fName, lName, acc, add, add2, city,
			   bal, state, zip;
		JTextField fNameText, accText, addText, add2Text, cityText,
			       lNameText, balText, stateText, zipText;
		JButton findS, newS, deleteS, updateS; 
		JComboBox diplomas;
		JRadioButton registration;
		
		
	public WindowDesign()
	{
		super("Student Records");
		
		
		
	    blankPanel = new JPanel();
		blankPanel.setBackground(Color.WHITE);
		add(blankPanel);
		blankPanel.setPreferredSize(new Dimension(500,500));
		
		setLayout(new GridBagLayout());
		
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
		a.ipady = 15;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(fName, a );
		
		a = new GridBagConstraints();
		a.gridx = 0;
		a.gridy = 1;
		a.ipady = 15;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(acc, a );
		
		a = new GridBagConstraints();
		a.gridx = 0;
		a.gridy = 2;
		a.ipady = 15;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(add, a );
		
		a = new GridBagConstraints();
		a.gridx = 0;
		a.gridy = 3;
		a.ipady = 15;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(add2, a );
		
		a = new GridBagConstraints();
		a.gridx = 0;
		a.gridy = 4;
		a.ipady = 15;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(city, a );
		
		//WEST TEXTFIELD
		fNameText = new JTextField(25);
		accText = new JTextField(10);
		addText = new JTextField(25);
		add2Text = new JTextField(25);
		cityText = new JTextField(25);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.ipady = 11;
		a.gridx = 1;
		a.gridy = 0;
		a.gridwidth = 1;
		centerPanel.add(fNameText, a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.WEST;
		a.ipady = 11;
		a.gridx = 1;
		a.gridy = 1;
		a.gridwidth = 1;
		centerPanel.add(accText, a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.ipady = 11;
		a.gridx = 1;
		a.gridy = 2;
		a.gridwidth = 1;
		centerPanel.add(addText, a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.ipady = 11;
		a.gridx = 1;
		a.gridy = 3;
		a.gridwidth = 1;
		centerPanel.add(add2Text, a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.ipady = 11;
		a.gridx = 1;
		a.gridy = 4;
		a.gridwidth = 1;
		centerPanel.add(cityText, a);
		
		//CENTER LABELS
		lName = new JLabel ("Last Name: ");
		bal = new JLabel ("Balance: ");
		state = new JLabel ("State: ");
		zip = new JLabel ("Zip Code: ");
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.insets = new Insets(0,30,0,0);
		a.gridx = 2;
		a.gridy = 0;
		a.ipady = 15;
		a.ipadx = 10;
		a.gridwidth = 1;
		centerPanel.add(lName, a );
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.insets = new Insets(0,30,0,0);
		a.ipady = 15;
		a.ipadx = 10;
		a.gridx = 2;
		a.gridy = 1;
		a.gridwidth = 1;
		centerPanel.add(bal, a);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.insets = new Insets(0,30,0,0);
		a.ipady = 15;
		a.ipadx = 10;
		a.gridx = 2;
		a.gridy = 4;
		a.gridwidth = 1;
		centerPanel.add(state,a);
		
		a = new GridBagConstraints();
		a.ipady = 15;
		a.ipadx = 0;
		a.gridx = 3;
		a.gridy = 4;
		a.gridwidth = 1;
		centerPanel.add(zip,a);
		
		//CENTER TEXTFIELDS
		lNameText = new JTextField(30);
		balText = new JTextField(10);
		stateText = new JTextField(3);
		zipText = new JTextField(10);
		
		a = new GridBagConstraints();
		a.fill = GridBagConstraints.HORIZONTAL;
		a.gridx = 3;
		a.gridy = 0;
		a.ipady = 11;
		a.gridwidth = 1;
		centerPanel.add(lNameText, a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 3;
		a.gridy = 1;
		a.ipady = 11;
		a.gridwidth = 1;
		balText.setEditable(false);
		centerPanel.add(balText, a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.WEST;
		a.gridx = 3;
		a.gridy = 4;
		a.ipady = 11;
		a.gridwidth = 1;
		centerPanel.add(stateText, a);
		
		a = new GridBagConstraints();
		a.anchor = GridBagConstraints.EAST;
		a.gridx = 3;
		a.gridy = 4;
		a.ipady = 11;
		a.gridwidth = 1;
		centerPanel.add(zipText, a);
		
		add(centerPanel, a);
		
		//EAST PANEL
		eastPanel = new JPanel(new GridBagLayout());
		eastPanel.setBackground(Color.WHITE);
		
		findS = new JButton("Find Student ");
		newS = new JButton("New Student ");
		updateS = new JButton("Update Student ");
		deleteS = new JButton("Delete Student ");

		

	}
}
