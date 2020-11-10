package vehicularCloud;
/**
 * If anyone updates anything just add a comment up top here with your name so we know what to do or where you left off before we even look at the code so its easier.
 * -Michael **/
		 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;  
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane; 
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
	
	final int FrameWidth = 600;
	final int FrameHeight = 300;
	JLabel question;
	JButton ownerButton;
	JButton clientButton;
	
	public MainFrame()
	{
		question = new JLabel("Are you a Client who wants to submit a job? OR an Owner who wants to rent out her/his car?");
		createOwnerButton();
		createClientButton();
		createPanel();
		
		setSize(FrameWidth, FrameHeight);		
	}


	private void createOwnerButton() 
	{
		ownerButton = new JButton("Owner");
		ownerButton.setBounds(10, 100, 180, 125);
		ActionListener ownerButtonListener = new ownerButtonListener();
		ownerButton.addActionListener(ownerButtonListener);
	}
	
	class ownerButtonListener implements ActionListener
	{
		JTextField ID = new JTextField(20);
		JTextField Model = new JTextField(20);
		JTextField licenseNumber = new JTextField(20);
		JTextField residencyTime = new JTextField(20);
		JLabel ownerID = new JLabel("Owner ID: ");
		JLabel vehicleModel = new JLabel("Vehicle Model: ");
		JLabel vehicleLicenseNumber = new JLabel("License Plate Number: ") ;
		JLabel vehicleResidencyTime= new JLabel("Approximate Residency Time: ");
		JLabel directions = new JLabel("Please enter the following information");
		JLabel minutes = new JLabel(" Minutes");
		JButton enterButton;
		/* This is where a panel will open up asking the customer/owner the information that will need to be put into the code. */
		
		
		public void actionPerformed(ActionEvent e) 
		{
			
			JPanel ownerPanel = new JPanel();
			JFrame ownerFrame = new JFrame();
			ownerFrame.setTitle("Vehicle Owner");
			ownerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ownerFrame.setVisible(true);
			ownerFrame.setSize(FrameWidth, FrameHeight);
			ownerFrame.add(ownerPanel);
			createOwnerEnterButton();
			
			ownerPanel.setLayout(null);
			directions.setBounds(20, 20, 500, 25);
			
			ownerID.setBounds(20, 50, 80, 25);
			vehicleModel.setBounds(20, 80, 200, 25);
			vehicleLicenseNumber.setBounds(20, 110, 300, 25);
			vehicleResidencyTime.setBounds(20, 140, 330, 25);
			minutes.setBounds(250, 140, 100, 25);
			
			
			ID.setBounds(80, 50, 165, 25);
			Model.setBounds(120, 80, 200, 25);
			licenseNumber.setBounds(165, 110, 200, 25);
			residencyTime.setBounds(200, 140, 50, 25);
			
			
			ownerPanel.add(directions);
			ownerPanel.add(ownerID);
			ownerPanel.add(vehicleModel);
			ownerPanel.add(vehicleLicenseNumber);
			ownerPanel.add(vehicleResidencyTime);
			ownerPanel.add(ID);
			ownerPanel.add(Model);
			ownerPanel.add(licenseNumber);
			ownerPanel.add(residencyTime);
			ownerPanel.add(minutes);
			ownerPanel.add(enterButton);	
		/*This is where the buttons are created on the panel of the program. User inputs information within the text boxes provided within the program */
		}
		
		
		private void createOwnerEnterButton() 
		{
			enterButton = new JButton("Enter");
			enterButton.setBounds(20, 190, 80, 25);
			ActionListener ownerEnterButtonListener = new ownerEnterButtonListener();
			enterButton.addActionListener(ownerEnterButtonListener);
		}
		
		class ownerEnterButtonListener implements ActionListener 
		{
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("MM-DD-YYYY HH:mm:ss");
			
			public void actionPerformed(ActionEvent ae) 
			{
				if(ae.getActionCommand()== enterButton.getActionCommand()) 
				{
					try 
					{	
						PrintStream output = new PrintStream(new FileOutputStream("Vehicle Owner Information.txt", true));
						
						output.println("*****************************************");
						output.println(ownerID.getText() + " " + ID.getText());
						output.println(vehicleModel.getText() + " " + Model.getText());
						output.println(vehicleLicenseNumber.getText() + " " + licenseNumber.getText());
						output.println(vehicleResidencyTime.getText() + " " + residencyTime.getText() + minutes.getText());
						output.println("TimeStamp: " + formatter.format(date));
						output.println("*****************************************");
						output.println(" ");
						output.close();
						JOptionPane.showMessageDialog(null, "Information Successfully Stored!");
						
					} catch(Exception e){JOptionPane.showMessageDialog(null, e);}				
				}
			}
		}
	}

	
	private void createClientButton() 
	{
		clientButton = new JButton("Client");
		clientButton.setBounds(10, 125, 80, 25);
		ActionListener clientButtonListener = new clientButtonListener();
		clientButton.addActionListener(clientButtonListener);
	}
	
	class clientButtonListener implements ActionListener
	{

		JLabel clientFirstName = new JLabel("First Name: "); 
		JLabel clientLastName = new JLabel("Last Name: ");    
		JLabel clientID = new JLabel("Client ID:  ");
		JLabel approximateJobDuration = new JLabel("Approximate Job Duration:  ");
		JLabel jobDeadline = new JLabel("Job Deadline: ");
		JLabel directions = new JLabel("Please Enter the Following Information:  ");
		JLabel jobDurationMinutes = new JLabel("   Minutes"); // This label could be renamed to 'minutes' so we don't need a duplicate label and to avoid confusion.
		JLabel jobDeadlineMinutes = new JLabel("   Minutes");

	
		JTextField firstName = new JTextField(20);  
		JTextField lastName = new JTextField(20);    
		JTextField ID = new JTextField(20);
		JTextField jobDuration = new JTextField(20);
		JTextField deadline = new JTextField(20);
		
		JButton enterButton;
		
		public void actionPerformed(ActionEvent e) 
		{
			JPanel clientPanel = new JPanel();
			JFrame clientFrame = new JFrame();
			clientFrame.setTitle("Job Owner");
			clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			clientFrame.setVisible(true);
			clientFrame.setSize(FrameWidth, FrameHeight);
			clientFrame.add(clientPanel);
			
			createClientEnterButton();
			
			clientPanel.setLayout(null);
			directions.setBounds(20, 20, 500, 25);
			
			clientFirstName.setBounds(20, 50, 80, 25 ); 
			clientLastName.setBounds(20, 80, 80, 25); 
			clientID.setBounds(20, 110, 80, 25);
			approximateJobDuration.setBounds(20, 140, 400, 25);
			jobDeadline.setBounds(20, 170, 80, 25);
	
			firstName.setBounds(89, 50, 200, 25);    
			lastName.setBounds(89, 80, 200 , 25);        
			ID.setBounds(73, 110, 165, 25);
			jobDuration.setBounds(180, 140, 50, 25);
			deadline.setBounds(100, 170, 50, 25);
			jobDurationMinutes.setBounds(225, 140, 100, 25);
			jobDeadlineMinutes.setBounds(145, 170, 100, 25);
			
			clientPanel.add(clientFirstName); 
			clientPanel.add(clientLastName);
			clientPanel.add(firstName);      
			clientPanel.add(lastName);      
			clientPanel.add(directions);
			clientPanel.add(clientID);
			clientPanel.add(approximateJobDuration);
			clientPanel.add(jobDeadline);	
			clientPanel.add(ID);
			clientPanel.add(jobDuration);
			clientPanel.add(deadline);
			clientPanel.add(jobDurationMinutes);
			clientPanel.add(jobDeadlineMinutes);
			clientPanel.add(enterButton);
		}		
		
		private void createClientEnterButton() 
		{
			enterButton = new JButton("Enter");
			enterButton.setBounds(20, 200, 80, 25);
			ActionListener clientEnterButtonListener = new clientEnterButtonListener();
			enterButton.addActionListener(clientEnterButtonListener);
		}
		
		class clientEnterButtonListener implements ActionListener
		{
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
			
			public void actionPerformed(ActionEvent ae) 
			{
				String jDuration = jobDuration.getText();
				String jDeadline = deadline.getText();   
				int duration = Integer.parseInt(jDuration);
				int deadline = Integer.parseInt(jDeadline); 
				
				if(ae.getActionCommand()== enterButton.getActionCommand()) 
				{
					try 
					{
						PrintStream output = new PrintStream(new FileOutputStream("Job Owner Information.txt", true));
						output.println("*****************************************");
						output.println("Name: " + firstName.getText() + " " + lastName.getText());
						output.println(clientID.getText() + " " + ID.getText());
						output.println(approximateJobDuration.getText() + " " + duration + " " + jobDurationMinutes.getText());
						output.println(jobDeadline.getText() + " " + deadline + " " + jobDeadlineMinutes.getText());
						output.println("TimeStamp: " + formatter.format(date));
						output.println("*****************************************");
						output.println(" ");
						output.close();
						JOptionPane.showMessageDialog(null, "Information Successfully Stored!");
					
					} catch(Exception e){JOptionPane.showMessageDialog(null, e);}
				}
			}
		}	
	
}
	
	private void createPanel() 
	{
		JPanel panel = new JPanel();
		panel.add(question);
		panel.add(ownerButton);
		panel.add(clientButton);
		add(panel);
	}
	


}