package code.richard;
import javax.swing.JFrame;


public class WindowDesignRun {

	public static void main(String[] args) {

		WindowDesign buttonFrame = new WindowDesign();
		buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		buttonFrame.pack();
		buttonFrame.setVisible(true);
	}
}