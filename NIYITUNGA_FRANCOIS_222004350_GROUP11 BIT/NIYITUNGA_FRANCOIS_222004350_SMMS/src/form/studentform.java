package form;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.EventQueue;


import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class studentform extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	 private JTextField textField;
	Connection con;
	PreparedStatement pet;
    ResultSet res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentform frame = new studentform();
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
	public studentform() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(107, 77, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contact");
		lblNewLabel_3.setBounds(92, 121, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date of Birth");
		lblNewLabel_4.setBounds(87, 175, 66, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setBounds(107, 222, 52, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(107, 261, 46, 14);
		getContentPane().add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 71, 252, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 118, 252, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(205, 169, 252, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(205, 219, 252, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(205, 258, 252, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("REMOVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	                //Creating Connection Object
	                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smms","root","");
	                String sql="DELETE FROM student WHERE ID=1";
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
		btnNewButton.setBounds(220, 357, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            //Creating Connection Object
		            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smms","root","");
		            //Prepared Statement
		            PreparedStatement pet=con.prepareStatement("insert into student(Name,Contact,Date,Gender,Address,Password) values(?,?,?,?,?,?)");
		            //Specifying the values of it's parameter
		            pet.setString(1,textField_1.getText());
		            pet.setString(2,textField_2.getText());
		            pet.setString(3,textField_3.getText());
		            pet.setString(4,textField_4.getText());
		            pet.setString(5,textField_5.getText()); 
		            pet.setString(6,textField.getText());
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
		btnNewButton_1.setBounds(113, 357, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(205, 294, 252, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(107, 297, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("student");
		lblNewLabel.setBounds(247, 31, 46, 14);
		getContentPane().add(lblNewLabel);
	}
}
