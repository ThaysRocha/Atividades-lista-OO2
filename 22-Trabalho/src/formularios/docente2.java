package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class docente2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	
	public docente2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Professor");
		lblNewLabel.setBounds(94, 11, 133, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(104, 46, 283, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo");
		lblNomeCompleto.setBounds(23, 49, 99, 14);
		contentPane.add(lblNomeCompleto);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("##/##/####");
		formattedTextField.setBounds(134, 77, 90, 20);
		contentPane.add(formattedTextField);
		
		JLabel lblDataDeNascimento = new JLabel("data de Nascimento");
		lblDataDeNascimento.setBounds(23, 82, 99, 14);
		contentPane.add(lblDataDeNascimento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(322, 197, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Cidade");
		lblEndereo.setBounds(252, 200, 60, 14);
		contentPane.add(lblEndereo);
		
		JCheckBox chckbxMasculino = new JCheckBox("Masculino");
		chckbxMasculino.setBounds(235, 73, 79, 23);
		contentPane.add(chckbxMasculino);
		
		JCheckBox chckbxFeminino = new JCheckBox("Feminino");
		chckbxFeminino.setBounds(322, 73, 70, 23);
		contentPane.add(chckbxFeminino);
		
		JSpinner spinner = new JSpinner();
		spinner.setToolTipText("Estado\r\nAC\t \r\nAL\t \r\nAP\t \r\nAM\t \r\nBA\t \r\nCE\t \r\nDF\t \r\nES\t \r\nGO\t \r\nMA\t \r\nMT\t \r\nMS\t \r\nMG\t \r\nPA\t \r\nPB\t \r\nPR\t \r\nPE\t \r\nPI\t \r\nRJ\t \r\nRN\t \r\nRS\t \r\nRO\t \r\nRR\t \r\nSC\t \r\nSP\t \r\nSE\t \r\nTO");
		spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(0)));
		spinner.setBounds(120, 197, 88, 20);
		contentPane.add(spinner);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(10, 249, 46, 14);
		contentPane.add(lblBairro);
		
		textField_2 = new JTextField();
		textField_2.setBounds(63, 277, 232, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(37, 280, 32, 14);
		contentPane.add(lblRua);
		
		textField_3 = new JTextField();
		textField_3.setBounds(53, 246, 264, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00BA");
		lblN.setBounds(324, 280, 32, 14);
		contentPane.add(lblN);
		
		textField_4 = new JTextField();
		textField_4.setBounds(366, 277, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setText("###.###.###-##");
		formattedTextField_1.setBounds(88, 124, 113, 20);
		contentPane.add(formattedTextField_1);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(37, 127, 32, 14);
		contentPane.add(lblCpf);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(340, 249, 32, 14);
		contentPane.add(lblCep);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setText("#####-###");
		formattedTextField_2.setBounds(382, 246, 79, 20);
		contentPane.add(formattedTextField_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 347, 344, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(39, 350, 46, 14);
		contentPane.add(lblEmail);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(183, 393, 89, 23);
		contentPane.add(btnCadastrar);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setText("##- #####-####");
		formattedTextField_3.setBounds(340, 124, 112, 20);
		contentPane.add(formattedTextField_3);
		
		JLabel lblCelular = new JLabel("celular");
		lblCelular.setBounds(284, 127, 46, 14);
		contentPane.add(lblCelular);
		
		JLabel lblTelefone = new JLabel("telefone");
		lblTelefone.setBounds(266, 152, 46, 14);
		contentPane.add(lblTelefone);
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		formattedTextField_4.setText("##-####-####");
		formattedTextField_4.setBounds(340, 155, 112, 20);
		contentPane.add(formattedTextField_4);
	}
}
