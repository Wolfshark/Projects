/*******************
 ****RICHARD LUU ***
 *******************/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton; 
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StatisticsCalculator extends JFrame
{
		private JPanel  buttonPanel, blankPanel, displayPanel; // VARIABLE DECLARATION
		private JButton submit;
		private JButton	getStats;
		private JTextField entryField;
		private JLabel text;
		
		private JLabel minLabel, maxLabel, meanLabel, geoLabel;
		private double temp = 0, min = 0, max = 0, mean = 0, geo = 1, count = 0;

	public StatisticsCalculator()
	{
		super("Simple Statistics"); //super class constructor call
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground( Color.WHITE);
		blankPanel = new JPanel();
		blankPanel.setBackground(Color.WHITE);
		blankPanel.setPreferredSize(new Dimension(400,400));
		
		submit = new JButton ( "Submit" );
		getStats = new JButton ( "Get Stats" );
		entryField = new JTextField(16);

		setLayout( new BorderLayout() );

		buttonPanel.add(text = new JLabel("Enter some number "));
		buttonPanel.add(entryField);
		buttonPanel.add(submit);
		buttonPanel.add(getStats);

		ButtonHandler handler = new ButtonHandler();
		submit.addActionListener( handler );
		getStats.addActionListener( handler );
		entryField.addActionListener( handler );

		add(blankPanel);
		add(buttonPanel, BorderLayout.SOUTH);
	}
	public void clearVar()
	{
		temp = 0; min = 0; max = 0; mean = 0; geo = 1; count = 0;
		
	}
	public class ButtonHandler implements ActionListener
	{	
		public void actionPerformed(ActionEvent event)
		{
			try
			{
				if (event.getSource() == submit
						|| event.getSource() == entryField) //Checks the condition of pressing submit or enter
				{
					if(displayPanel != null) //refreshes the screen
					{remove(displayPanel);
					add(blankPanel);
					validate();
					repaint();
					}
					
					temp = Double.parseDouble(entryField.getText()); //converts string to double
					
					if (count == 0) { min = temp; max = temp;} //Setting variables to appropriate values
					if (temp > max) { max = temp;}
					if (temp < min) { min = temp;} 
					mean += temp;
					geo *= temp; 
					
					JOptionPane.showMessageDialog(blankPanel, temp + " Entered"); //Displays dialog after pressing submit
					count++;
					
					entryField.setText("");
				}
					
				if (event.getSource() == getStats && count != 0) // compares that getStats is pressed and not for first time
				{
						remove(blankPanel); 
						displayPanel = new JPanel();
						displayPanel.setLayout(new GridLayout(4,0));
						displayPanel.setBackground(Color.WHITE);
						
						displayPanel.add(minLabel = new JLabel("The Minimum is " + min));
						displayPanel.add(maxLabel = new JLabel(("The Maximum is " + max)));
						displayPanel.add(meanLabel = new JLabel("The Mean is " + (mean/count)));
						if (geo < 0) // case of negative under radical
							{displayPanel.add(geoLabel = 
								new JLabel("The Geometrical Mean is undefined. "));
						}
						else
							displayPanel.add(geoLabel = 
								new JLabel("The Geometrical Mean is " + (Math.pow(geo, 1/count))));
			
						add(displayPanel);
						validate();
						repaint();
						
						clearVar(); // resets all variables
						
				}
			}
			catch(NumberFormatException e) //Exception is  thrown for invalid entry
			{
				JOptionPane.showMessageDialog(blankPanel, "You have entered an invalid number!");
			}
			
		}
	}
}
