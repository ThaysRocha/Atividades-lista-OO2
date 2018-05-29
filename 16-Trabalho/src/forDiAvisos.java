import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;

public class forDiAvisos extends JFrame {

	private JPanel contentPane;

	
	public forDiAvisos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Avisos");
		lblNewLabel.setBounds(153, 11, 105, 31);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(304, 89, 146, 25);
		contentPane.add(progressBar);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Todos");
		tglbtnNewToggleButton.setBounds(153, 89, 121, 25);
		contentPane.add(tglbtnNewToggleButton);
	}
}
