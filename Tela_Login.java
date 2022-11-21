import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Login extends JFrame {

	private JPanel contentPane;
	private JTextField Usuario_texto;
	private JPasswordField Senha_texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Login frame = new Tela_Login();
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
	public Tela_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				test frame = new test();
				frame.setVisible(true);
			}
		});
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		btnCadastrar.setBounds(28, 455, 128, 30);
		getContentPane().add(btnCadastrar);
		
		JLabel Senha = new JLabel("Senha");
		Senha.setForeground(new Color(255, 255, 255));
		Senha.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Senha.setBounds(197, 360, 64, 23);
		getContentPane().add(Senha);
		
		Usuario_texto = new JTextField();
		Usuario_texto.setForeground(new Color(0, 0, 0));
		Usuario_texto.setBounds(107, 307, 275, 42);
		getContentPane().add(Usuario_texto);
		Usuario_texto.setColumns(10);
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Tela_Agendamento frame = new Tela_Agendamento();
				frame.setVisible(true);
			}
		});
		Entrar.setForeground(UIManager.getColor("Button.disabledShadow"));
		Entrar.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Entrar.setBounds(374, 455, 95, 30);
		getContentPane().add(Entrar);
		
		Senha_texto = new JPasswordField();
		Senha_texto.setBounds(107, 385, 275, 42);
		getContentPane().add(Senha_texto);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		lblNewLabel.setBounds(197, 278, 79, 30);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bodoni MT", Font.BOLD, 25));
		lblNewLabel_1.setBounds(28, 240, 114, 30);
		getContentPane().add(lblNewLabel_1);
		
		JLabel Imagem_Fundo = new JLabel("");
		Imagem_Fundo.setIcon(new ImageIcon("C:\\Academy Fit\\Academy Fit2.png"));
		Imagem_Fundo.setBounds(0, -3, 550, 511);
		getContentPane().add(Imagem_Fundo);

	
	}

}
