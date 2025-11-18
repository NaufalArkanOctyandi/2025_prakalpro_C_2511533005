package pekan8_2511533005;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533005 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void PesanEror(String pesan) {
		JOptionPane.showMessageDialog(this,pesan, "Kesalahan",JOptionPane.ERROR_MESSAGE);
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533005 frame = new OperatorAritmatikaGUI_2511533005();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511533005() {
		setTitle("OperatorAritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 10, 208, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(26, 69, 74, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setBounds(26, 94, 74, 12);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setBounds(26, 146, 74, 12);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setBounds(26, 185, 44, 12);
		contentPane.add(lblNewLabel_4);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(90, 66, 80, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setBounds(90, 91, 80, 18);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "_", "*", "\\", "%"}));
		comboBox.setBounds(89, 142, 81, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText ().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				} else if (txtBil2.getText().trim ().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				} else
				{
					try {
				int a=Integer.valueOf(txtBil1.getText ());
				int b=Integer.valueOf(txtBil2.getText ());
				int c=comboBox.getSelectedIndex();
				if (c==0) {
					hasil=a+b;
			}
				if (c==1) {
					hasil= a-b;
					
				}
				if (c==2) {
					hasil= a*b;
				}
				if (c==3) {
					hasil= a/b;
			}
				if (c==4) {
				hasil= a%b;
			}
				txtHasil.setText(String.valueOf(hasil));
			} catch(NumberFormatException ex) {
				PesanEror("Bilangan 1 dan bilangan 2 harus angka");
			}
				}
			}
			});
		
		btnNewButton.setBounds(202, 142, 84, 20);
		contentPane.add(btnNewButton);
		
		txtHasil = new JTextField();
		txtHasil.setBounds(90, 182, 80, 18);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		}
	}

	

