package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class aluno2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	public aluno2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(58, 47, 282, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("##/##/####");
		formattedTextField.setBounds(139, 79, 78, 20);
		contentPane.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setText("##-#####-####");
		formattedTextField_1.setBounds(276, 118, 102, 20);
		contentPane.add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setText("##-####-####");
		formattedTextField_2.setBounds(71, 118, 102, 20);
		contentPane.add(formattedTextField_2);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setText("###.###.###-##");
		formattedTextField_3.setBounds(375, 79, 106, 20);
		contentPane.add(formattedTextField_3);
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		formattedTextField_4.setText("#####-###");
		formattedTextField_4.setBounds(398, 208, 81, 20);
		contentPane.add(formattedTextField_4);
		
		JCheckBox chckbxFem = new JCheckBox("Fem");
		chckbxFem.setBounds(346, 46, 50, 23);
		contentPane.add(chckbxFem);
		
		JCheckBox chckbxMasc = new JCheckBox("Masc");
		chckbxMasc.setBounds(398, 46, 58, 23);
		contentPane.add(chckbxMasc);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 50, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(320, 82, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(20, 82, 107, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(23, 121, 46, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(220, 121, 46, 14);
		contentPane.add(lblCelular);
		
		JLabel lblEmail = new JLabel("e-mail");
		lblEmail.setBounds(20, 286, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(342, 211, 46, 14);
		contentPane.add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(20, 211, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(20, 173, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(23, 239, 46, 14);
		contentPane.add(lblRua);
		
		JLabel lblN = new JLabel("N\u00BA");
		lblN.setBounds(350, 239, 31, 14);
		contentPane.add(lblN);
		
		textField_1 = new JTextField();
		textField_1.setBounds(75, 170, 130, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JList list = new JList();
		list.setBounds(359, 183, -49, -10);
		contentPane.add(list);
		
		JSpinner spinner = new JSpinner();
		spinner.setToolTipText("Estado\r\nAC\t \r\nAL\t \r\nAP\t \r\nAM\t \r\nBA\t \r\nCE\t \r\nDF\t \r\nES\t \r\nGO\t \r\nMA\t \r\nMT\t \r\nMS\t \r\nMG\t \r\nPA\t \r\nPB\t \r\nPR\t \r\nPE\t \r\nPI\t \r\nRJ\t \r\nRN\t \r\nRS\t \r\nRO\t \r\nRR\t \r\nSC\t \r\nSP\t \r\nSE\t \r\nTO");
		spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		spinner.setBounds(276, 170, 102, 20);
		contentPane.add(spinner);
		
		textField_2 = new JTextField();
		textField_2.setBounds(71, 208, 210, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(79, 236, 245, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(395, 236, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(58, 283, 282, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(199, 354, 89, 23);
		contentPane.add(btnCadastrar);
	}
}
