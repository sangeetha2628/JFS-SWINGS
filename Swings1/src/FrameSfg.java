import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameSfg extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6008875722793198261L;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextArea textArea1;
	private JRadioButton rb1,rb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSfg frame = new FrameSfg();
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
	public FrameSfg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 343);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Application Form");
		lblNewLabel.setBounds(183, 11, 162, 14);
		getContentPane().add(lblNewLabel);
		
		JButton click = new JButton("Click me");
		click.addActionListener(new ActionListener() {
			//private AbstractButton rb1;

			public void actionPerformed(ActionEvent arg0) 
			{
				String gender;
				if(rb1.isSelected())
					gender="Male";
				else
					gender="Female";
					
		       
		    	   
		
				textArea1.setText("First name :\t "+t1.getText()+"\nLast Name :\t"+t2.getText()+"\nDOB: \t"+t3.getText()+"\nGender :\t"+gender+"\nEmail :\t"+t4.getText());
				
				
			}
			
		});
		click.setBounds(232, 66, 89, 70);
		getContentPane().add(click);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 49, 162, 14);
		getContentPane().add(label);
		
		JLabel lblFirstAnme = new JLabel("First name");
		lblFirstAnme.setBounds(10, 70, 89, 14);
		getContentPane().add(lblFirstAnme);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 94, 79, 14);
		getContentPane().add(lblLastName);
		
		JLabel lblOfBirh = new JLabel("Date of Birth");
		lblOfBirh.setBounds(10, 122, 79, 14);
		getContentPane().add(lblOfBirh);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 147, 79, 14);
		getContentPane().add(lblGender);
		
		JLabel lblMailId = new JLabel("Mail ID");
		lblMailId.setBounds(10, 172, 79, 14);
		getContentPane().add(lblMailId);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(367, 117, -36, 22);
		getContentPane().add(textArea);
		
		t1 = new JTextField();
		t1.setBounds(109, 66, 86, 20);
		getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(108, 91, 86, 20);
		getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(108, 119, 86, 20);
		getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(108, 172, 86, 20);
		getContentPane().add(t4);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(109, 143, 72, 23);
		getContentPane().add(rb1);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(190, 143, 109, 23);
		getContentPane().add(rb2);
		
	     textArea1 = new JTextArea();
		textArea1.setBounds(10, 197, 380, 84);
		getContentPane().add(textArea1);
	}
}
