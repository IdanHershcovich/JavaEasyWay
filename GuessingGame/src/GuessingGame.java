import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessingGame extends JFrame {
	private JTextField textField;
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Idan's HiLo Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(203, 256, 22, 45);
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Idan's HiLo Guessing Game");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 438, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Guess a number between 1 and 100");
		lblNewLabel_1.setBounds(19, 57, 233, 16);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(248, 52, 61, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(316, 52, 117, 29);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Enter a number above and click Guess!\n\n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(96, 113, 259, 16);
		getContentPane().add(lblNewLabel_2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
