import javax.swing.JFrame;

public class WindowDesignRun {

	public static void main(String[] args) {

		WindowDesign buttonFrame = new WindowDesign();
		buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		buttonFrame.setSize( 850,300  ); // set frame size
		buttonFrame.setVisible( true ); // display frame

	}
}