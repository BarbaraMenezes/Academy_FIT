import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.List;
import javax.swing.JButton;

public class Tela_Agendamento extends JFrame {

	private JPanel contentPane;
	private JTextField Texto_Nome;
	private JTextField Texto_CPF;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	private final ButtonGroup buttonGroup3 = new ButtonGroup();
	private JTextField Texto_gp_risco;
	private JTextField Texto_foco;
	private JTextField Texto_horario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Agendamento frame = new Tela_Agendamento();
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
	public Tela_Agendamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton fim = new JButton("Finalizar");
		fim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					FileWriter salvar = new FileWriter("C:\\dados projeto\\dados_agendamento.txt", true);
					PrintWriter salve = new PrintWriter(salvar);
					salve.append("Grupo de Risco:" + Texto_gp_risco.getText() +"|"+ "Treino:" + Texto_foco.getText()
							+"|"+ "Horário:" + Texto_horario.getText() + "\n");
					salve.flush();

					salve.close();
				} catch (IOException evt) {

					evt.printStackTrace();
				}
				Tela_Agendamento frame = new Tela_Agendamento();
				frame.setVisible(false);
				Tela_Login frame1 = new Tela_Login();
				frame1.setVisible(true);

			}
		});

		Texto_horario = new JTextField();
		Texto_horario.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		Texto_horario.setColumns(10);
		Texto_horario.setBounds(340, 369, 117, 20);
		contentPane.add(Texto_horario);

		Texto_foco = new JTextField();
		Texto_foco.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		Texto_foco.setColumns(10);
		Texto_foco.setBounds(43, 325, 414, 23);
		contentPane.add(Texto_foco);

		Texto_gp_risco = new JTextField();
		Texto_gp_risco.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
		Texto_gp_risco.setBounds(340, 254, 117, 20);
		contentPane.add(Texto_gp_risco);
		Texto_gp_risco.setColumns(10);
		fim.setFont(new Font("Bodoni MT", Font.PLAIN, 19));
		fim.setBounds(184, 417, 129, 28);
		contentPane.add(fim);

		JLabel horario = new JLabel("Escolha o hor\u00E1rio (Manh\u00E3,Tarde ou Noite):");
		horario.setForeground(Color.WHITE);
		horario.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
		horario.setBounds(42, 359, 312, 36);
		contentPane.add(horario);

		JLabel foco_treino = new JLabel("Escolha o foco do treino\r\n(Membros Superiores ou Inferiores):");
		foco_treino.setForeground(Color.WHITE);
		foco_treino.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
		foco_treino.setBounds(43, 289, 432, 36);
		contentPane.add(foco_treino);

		JLabel Grupo_risco = new JLabel("Faz parte do grupo de risco (Sim ou N\u00E3o)?");
		Grupo_risco.setForeground(Color.WHITE);
		Grupo_risco.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
		Grupo_risco.setBounds(45, 241, 341, 45);
		contentPane.add(Grupo_risco);

		JLabel Bem_vindo = new JLabel("Seja Bem-Vindo!");
		Bem_vindo.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		Bem_vindo.setForeground(Color.WHITE);
		Bem_vindo.setBounds(43, 181, 186, 53);
		contentPane.add(Bem_vindo);

		JLabel Plano_Fundo = new JLabel("");
		Plano_Fundo.setIcon(new ImageIcon("C:\\Academy Fit\\Academy Fit2.png"));
		Plano_Fundo.setBounds(5, 0, 500, 478);
		contentPane.add(Plano_Fundo);
	}
}
