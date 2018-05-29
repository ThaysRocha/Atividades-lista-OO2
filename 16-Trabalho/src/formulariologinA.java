import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;

public class formulariologinA extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public formulariologinA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ol\u00E1!");
		lblNewLabel.setBounds(45, 11, 378, 24);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma m\u00E1teria", "Ingl\u00EAs", "Protugu\u00EAs", "Alem\u00E3o", "Criolo", "Italiano", "Mandarim", "Todas"}));
		comboBox.setBounds(359, 125, 193, 30);
		contentPane.add(comboBox);
		
		table = new JTable();
		table.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		table.setBounds(23, 192, 542, 290);
		contentPane.add(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(125, 182, -55, -27);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(563, 496, -540, 10);
		contentPane.add(scrollPane);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Avisos");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 16));
		chckbxNewCheckBox.setBounds(45, 505, 88, 23);
		contentPane.add(chckbxNewCheckBox);
	}
}
