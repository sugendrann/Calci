
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField txtRmas;
	private JButton button_2;
	private JButton button_3;
	private JButton button;
	private JButton button_1;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	

	/**
	 * Launch the application. Ram
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClickMe = new JButton("=");
		btnClickMe.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ScriptEngineManager m = new ScriptEngineManager();
				ScriptEngine s = m.getEngineByName("js");
				Object result = "error";
				
				String a = txtRmas.getText();
				
				
				try {
					result = s.eval(a);
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				txtRmas.setText(result.toString());
				
			
			}
		
		});
		btnClickMe.setBounds(311, 184, 89, 67);
		contentPane.add(btnClickMe);
		
		txtRmas = new JTextField();
		txtRmas.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		txtRmas.setBounds(22, 11, 378, 65);
		contentPane.add(txtRmas);
		txtRmas.setColumns(10);
		
		button_2 = new JButton("2");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"2");
			}
		});
		button_2.setBounds(109, 86, 89, 49);
		contentPane.add(button_2);
		
		button_3 = new JButton("+");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 35));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+ "+");
			}
		});
		button_3.setBounds(311, 87, 89, 40);
		contentPane.add(button_3);
		
		button = new JButton("1");
		button.setFont(new Font("Tahoma", Font.BOLD, 35));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"1");
			}
		});
		button.setBounds(10, 86, 89, 49);
		contentPane.add(button);
		
		button_1 = new JButton("-");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"-");
			}
		});
		
		button_1.setBounds(311, 131, 89, 42);
		contentPane.add(button_1);
		
		JButton button_4 = new JButton("3");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 35));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"3");
			}
		});
		button_4.setBounds(207, 87, 85, 48);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 35));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"4");
			}
		});
		button_5.setBounds(10, 146, 85, 40);
		contentPane.add(button_5);
		
		button_6 = new JButton("5");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 35));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"5");
			}
		});
		button_6.setBounds(109, 145, 89, 41);
		contentPane.add(button_6);
		
		button_7 = new JButton("6");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 35));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"6");
			}
		});
		button_7.setBounds(207, 146, 85, 40);
		contentPane.add(button_7);
		

		button_9 = new JButton("9");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 35));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"9");
			}
		});
		
		
		button_9.setBounds(207, 197, 85, 45);
		contentPane.add(button_9);

		button_8 = new JButton("7");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 35));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"7");
			}
		});
		button_8.setBounds(10, 195, 89, 45);

		contentPane.add(button_8);
		
		JButton btn_8 = new JButton("8");
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 35));
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtRmas.getText();
				txtRmas.setText(a+"8");
			}
		});
		btn_8.setBounds(109, 195, 89, 45);
		contentPane.add(btn_8);
		

	}
}
