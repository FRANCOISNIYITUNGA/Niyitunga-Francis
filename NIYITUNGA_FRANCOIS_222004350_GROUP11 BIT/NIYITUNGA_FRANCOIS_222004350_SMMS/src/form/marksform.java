package form;
import java.sql.Connection;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class marksform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					marksform frame = new marksform();
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
	public marksform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("marks");
		lblNewLabel.setBounds(193, 103, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("courses");
		lblNewLabel_2.setBounds(35, 148, 55, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("lecturers");
		lblNewLabel_3.setBounds(35, 173, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 145, 265, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(117, 176, 265, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            //Creating Connection Object
		            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smms","root","");
		            //Prepared Statement
		            PreparedStatement pet=con.prepareStatement("insert into marks(courses,lecturers) values(?,?)");
		            //Specifying the values of it's parameter
		        
		            pet.setString(1,textField_1.getText());
		            pet.setString(2,textField_2.getText());
		           
		            
		            //Checking for the Password match
		        
		            {
		                //Executing query
		                pet.executeUpdate();
		                JOptionPane.showMessageDialog(null,"Data Registered Successfully");
		            }
		         

		        } catch (SQLException e1) {
		            e1.printStackTrace();
		        }
			}
		});
		btnNewButton.setBounds(136, 243, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("REMOVE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	                //Creating Connection Object
	                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smms","root","");
	                String sql="DELETE FROM marks WHERE ID=1";
	                //Prepared Statement
	              PreparedStatement pet=(PreparedStatement) con.prepareStatement(sql);
	                
	                
	                //Checking for the Password match
	            
	                {
	                    //Executing query
	                    pet.executeUpdate();
	                    JOptionPane.showMessageDialog(null,"Data Removed Successfully");
	                }
	             
	 
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
			}
		});
		btnNewButton_1.setBounds(241, 243, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
