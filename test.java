import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;


/*Tela_Cadastro*/

public class test extends JFrame {

	private JPanel contentPane;
	private JTextField Texto_Nome;
	private JTextField Texto_Nascimento;
	private JTextField Texto_Telefone;
	private JTextField Texto_CPF;
	private JTextField Texto_Usuario;
	private JPasswordField Texto_Senha;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*test frame = new test();
					frame.setVisible(true);*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

	
				try {
					FileWriter salvar = new FileWriter("C:\\dados projeto\\dados_cadastro.txt",true);
					PrintWriter salve = new PrintWriter(salvar);
					salve.append("Nome:"+Texto_Nome.getText() + " | " +"CPF:"+ Texto_CPF.getText() + " | "+"Data de Nascimento:"+ Texto_Nascimento.getText()
							+ " | " +"Telefone:"+ Texto_Telefone.getText() + " | "+"Usuario:"+ Texto_Usuario.getText() + " | "+"Senha:"
							+ Texto_Senha.getText()+"\n");
					salve.flush();
					
					salve.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				

			}

		});

		JButton Novo = new JButton("Novo");
		Novo.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Texto_Nome.setText("");
				Texto_CPF.setText("");
				Texto_Nascimento.setText("");
				Texto_Telefone.setText("");
				Texto_Usuario.setText("");
				Texto_Senha.setText("");
			}
		});
		contentPane.setLayout(null);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Login frame = new Tela_Login();
				frame.setVisible(true);
			}
		});
		voltar.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		voltar.setBounds(383, 28, 89, 23);
		contentPane.add(voltar);
		
		Texto_Usuario = new JTextField();
		Texto_Usuario.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		Texto_Usuario.setColumns(10);
		Texto_Usuario.setBounds(129, 377, 126, 20);
		contentPane.add(Texto_Usuario);
		
		Texto_Telefone = new JTextField();
		Texto_Telefone.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		Texto_Telefone.setColumns(10);
		Texto_Telefone.setBounds(129, 343, 121, 20);
		contentPane.add(Texto_Telefone);
		
		Texto_Nascimento = new JTextField();
		Texto_Nascimento.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		Texto_Nascimento.setColumns(10);
		Texto_Nascimento.setBounds(238, 309, 234, 25);
		contentPane.add(Texto_Nascimento);
		
		Texto_Nome = new JTextField();
		Texto_Nome.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		Texto_Nome.setBounds(134, 273, 338, 25);
		contentPane.add(Texto_Nome);
		Texto_Nome.setColumns(10);
		Novo.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Novo.setBounds(54, 440, 105, 25);
		getContentPane().add(Novo);

		Cadastrar.setHorizontalAlignment(SwingConstants.LEFT);
		Cadastrar.setForeground(new Color(0, 0, 0));
		Cadastrar.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Cadastrar.setBounds(316, 440, 124, 25);
		getContentPane().add(Cadastrar);

		Texto_Senha = new JPasswordField();
		Texto_Senha.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		Texto_Senha.setBounds(323, 376, 149, 22);
		getContentPane().add(Texto_Senha);

		JLabel Senha = new JLabel("Senha:");
		Senha.setForeground(Color.WHITE);
		Senha.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Senha.setBounds(259, 369, 77, 30);
		getContentPane().add(Senha);

		JLabel Usuario = new JLabel("Usu\u00E1rio:");
		Usuario.setForeground(Color.WHITE);
		Usuario.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Usuario.setBounds(54, 369, 77, 30);
		getContentPane().add(Usuario);

		Texto_CPF = new JTextField();
		Texto_CPF.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		Texto_CPF.setColumns(10);
		Texto_CPF.setBounds(313, 342, 159, 22);
		getContentPane().add(Texto_CPF);

		JLabel CPF = new JLabel("CPF:");
		CPF.setForeground(Color.WHITE);
		CPF.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		CPF.setBounds(265, 335, 56, 30);
		getContentPane().add(CPF);

		JLabel Telefone = new JLabel("Telefone:");
		Telefone.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Telefone.setForeground(new Color(255, 255, 255));
		Telefone.setBounds(54, 343, 85, 15);
		getContentPane().add(Telefone);


		JLabel Data_Nascimento = new JLabel("Data de Nascimento:");
		Data_Nascimento.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Data_Nascimento.setForeground(new Color(255, 255, 255));
		Data_Nascimento.setBounds(54, 309, 180, 25);
		getContentPane().add(Data_Nascimento);


		JLabel Nome = new JLabel("Nome:");
		Nome.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Nome.setForeground(new Color(255, 255, 255));
		Nome.setBounds(54, 268, 77, 30);
		getContentPane().add(Nome);

		JLabel Cadastro = new JLabel("Cadastro");
		Cadastro.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		Cadastro.setForeground(new Color(255, 255, 255));
		Cadastro.setBounds(31, 226, 100, 25);
		getContentPane().add(Cadastro);

		JLabel Fundo_Cadastro = new JLabel("");
		Fundo_Cadastro.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		Fundo_Cadastro.setIcon(new ImageIcon("C:\\Academy Fit\\Academy Fit2.png"));
		Fundo_Cadastro.setBounds(5, 5, 478, 474);
		getContentPane().add(Fundo_Cadastro);

	}
	}


