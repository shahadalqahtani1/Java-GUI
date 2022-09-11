package Shahad_1911093;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class pickABook_1911093 {

	public static java.util.Formatter output;
	public static Color color;
	public static double p1, p2, p3;
	public static String nnameT,llastT,pphoneT,eemailT;

	public static void main(String[] args) throws IOException {

		 JFrame f = new JFrame("<PICK A BOOK>"); // Create a frame
		 f.setSize(600,600); // Set the frame size
		 f.setLocationRelativeTo(null); // Center the frame
		 f.setLayout(null); //set it to flowlayout
		 f.getContentPane().setBackground(new Color(216, 191, 216));
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //f.setVisible(true); // Display the frame

	     Font fnt = new Font("Georgia", Font.PLAIN, 18);// setting type 1 of font
	     Font fnt2 = new Font("Georgia", Font.PLAIN, 12);
	     Font fnt3 = new Font("Georgia", Font.PLAIN, 13);
	     Font fnt4 = new Font("Georgia", Font.PLAIN, 9);

	        //Personalize background
	        JButton chng = new JButton("Change Color");
	        chng.setForeground(new Color(216, 191, 216));
	        chng.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	color =  JColorChooser.showDialog(null, "Select a color",
	                        new Color (255,228,220));
	            	f.getContentPane().setBackground(color); }});
	        chng.setFont(fnt2);
	        chng.setBounds(455, 30, 100, 30);
	        f.add(chng);

	     //WELCOME LABEL
		 JLabel wel = new JLabel("Welcome to <PICK A BOOK>");
		 wel.setBounds(170, 10, 250, 90);
		 wel.setForeground(Color.darkGray);
		 f.add(wel); wel.setFont(fnt);

		 //CONTACT INFORMATION
		 JLabel m1 = new JLabel("❁Please Enter your Contact Info. ");
		 m1.setBounds(60, 50, 220, 90);
		 m1.setForeground(Color.DARK_GRAY);
		 //Name Label
		 JLabel name = new JLabel("First Name: ");
		 name.setBounds(70, 80, 150, 90);
		 JLabel lastname = new JLabel("Last Name: ");
		 lastname.setBounds(70, 110, 150, 90);
		 //Email Label
		 JLabel email = new JLabel("E-mail: ");
		 email.setBounds(70, 140, 150, 90);
		 //Phone Label
		 JLabel phone = new JLabel("Phone Number: ");
		 phone.setBounds(70, 170, 150, 90);
		 //setting the font
		 name.setFont(fnt2); email.setFont(fnt2);
		 phone.setFont(fnt2); m1.setFont(fnt3);
		//adding it to the frame
		 f.add(m1); f.add(name); f.add(email);
		 f.add(phone); f.add(lastname); lastname.setFont(fnt2);

		 //user input
		 JTextField nameT = new JTextField("");
		 nameT.setColumns(10);
		 nameT.setBounds(167, 115, 150, 25);

		 JTextField lastT = new JTextField("");
		 lastT.setColumns(10);
		 lastT.setBounds(167, 143, 150, 25);

		 JTextField emailT = new JTextField("");
		 emailT.setColumns(50);
		 emailT.setBounds(167, 173, 150, 25);

		 JTextField phoneT = new JTextField("");
		 phoneT.setColumns(10);
		 phoneT.setBounds(167, 202, 150, 25);

		 f.add(nameT); f.add(lastT); f.add(emailT); f.add(phoneT);
		 nameT.setFont(fnt2); lastT.setFont(fnt2); emailT.setFont(fnt2);
		 phoneT.setFont(fnt2);

		 //choosing the rented book
		 JLabel m2 = new JLabel("❁Choose the book you would like to rent: ");
		 m2.setBounds(60, 250, 270, 90);
		 m2.setForeground(Color.DARK_GRAY);
		 f.add(m2); m2.setFont(fnt3);

		 JList<String> bookJList;
			String[] bookNames = {"Uprooted","It Ends with Us" ,"Normal People", "Little Women",
					 "Damien", "Salt", "Pride & Prejudice", "Animal Farm",
					 "White Nights", "The Alchemist", "Lovely War", "Circe", "Heartless"};
			bookJList = new JList<String>(bookNames);

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setViewportView(bookJList);
			bookJList.setLayoutOrientation(JList.VERTICAL);
			scrollPane.setBounds(100, 315, 120, 70);
			bookJList.setFont(fnt2); f.add(scrollPane);

		 //period of renting
			 JLabel m3 = new JLabel("❁Pick the period of renting: ");
			 m3.setBounds(60, 365, 250, 90);
			 m3.setForeground(Color.DARK_GRAY);
			 f.add(m3); m3.setFont(fnt3);

			 JRadioButton w1 = new JRadioButton("1 Week: 10sar");
			 JRadioButton w2 = new JRadioButton("2 Weeks: 13sar");
			 JRadioButton w3 = new JRadioButton("3 Weeks: 18sar");
     		 w1.setFont(fnt2); w2.setFont(fnt2); w3.setFont(fnt2);

			 Box bx;
			 bx = Box.createVerticalBox();
		     bx.add(w1);
		     bx.add(w2);
		     bx.add(w3);

			 Component radioc[]=bx.getComponents();
			 ButtonGroup radiobutton=new ButtonGroup();
		     for (int i=0; i<radioc.length; i++)
		     radiobutton.add((AbstractButton)(radioc[i]));
		     bx.setBounds(100, 425, 200, 200);
		     f.add(bx);

		     //total price + 15% tax
		     JLabel totallabel = new JLabel("Total: ");
		     totallabel.setBounds(390, 415, 100, 90);
		     //totaltext is where we will derrive the price from
		     JTextField totaltext = new JTextField("");
		     totaltext.setBounds(425, 447, 120, 25);
		     f.add(totallabel); f.add(totaltext);
		     totallabel.setFont(fnt2); totaltext.setFont(fnt2);

		     JLabel additional = new JLabel("*Additional 15% tax on the price.");
		     additional.setBounds(390, 430, 180, 90);
		     additional.setForeground(Color.red);
		     additional.setFont(fnt4); f.add(additional);

		     JButton pay = new JButton ("Pay");
		     pay.setBounds(210, 520, 85, 30); f.add(pay); pay.setFont(fnt2);

		     JButton submit = new JButton ("Submit");
		     submit.setBounds(110, 520, 85, 30); f.add(submit); submit.setFont(fnt2);

		     JButton reciept = new JButton ("Your Reciept>>");
		     reciept.setBounds(310, 520, 110, 30); f.add(reciept); reciept.setFont(fnt2);


		     //
		     //
		     //SECOND FRAME and the SUBMIT BUTTON
		     //
		     //

        	 JFrame f2 = new JFrame("Your Reciept");
		     f2.setSize(500,500); // Set the frame size
			 f2.setLocationRelativeTo(null); // Center the frame
			 f2.setLayout(null); //set it to flowlayout
			 f2.getContentPane().setBackground(new Color(216, 191, 216));
			 f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 //
			 //
			 //
			 //BARCODE
			 //
			 //

			 ImageIcon image = new ImageIcon("qr-code.png");
		        JLabel label = new JLabel(image);
		        label.setBounds(300, 50, 200, 200);
		        label.setIcon(image);
		        f2.add(label);

			 //submitting your info +choice
			 submit.addActionListener(new ActionListener(){
		            public void actionPerformed(ActionEvent e){

		            	//variables
		            	String nnameT = nameT.getText();
		            	String llastT = lastT.getText();
		            	String pphoneT = phoneT.getText();
		            	String eemailT = emailT.getText();

		            	//Validating user inputs
		            	if (! nnameT.matches("[A-Za-z]+")) {//number, symbols
		                    JOptionPane.showMessageDialog(null, "Invalid Name! please Try again!",
		                    		"Error!!", JOptionPane.ERROR_MESSAGE);
		                }

		            	if (! llastT.matches("[A-Za-z]+")) {//number, symbols
		                    JOptionPane.showMessageDialog(null, "Invalid Last Name! please Try again!",
		                    		"Error!!", JOptionPane.ERROR_MESSAGE);
		                }

		            	if (! pphoneT.matches("05[0-90]{8}")) {//doesn't starts with 05, or less than 10 digits
		                    JOptionPane.showMessageDialog(null, "Invalid Phone Number! please Try again!",
		                    		"Error!!", JOptionPane.ERROR_MESSAGE);
		                }

		            	if (!eemailT.matches("[A-Za-z0-9]+@[A-Za-z]+.com")) {//email contains @ and ends with .com
		                    JOptionPane.showMessageDialog(null, "invalid Email please Try again!",
		                    		"Error!!", JOptionPane.ERROR_MESSAGE);
		                }

		            	 if (nnameT.matches("[A-Za-z]+") && llastT.matches("[A-Za-z]+")
		            			 && eemailT.matches("[A-Za-z0-9]+@[A-Za-z]+.com")
		            			 && pphoneT.matches("05[0-90]{8}")) {}///////////end IFFFFF

		            		 //calculating total

		            		 if (w1.isSelected() == false && w2.isSelected() == false && w3.isSelected() == false ) {
		            			 JOptionPane.showMessageDialog(null, "You must Select a period of Renting!",
				                    		"Error!!", JOptionPane.ERROR_MESSAGE);
		            		 } else {
		        			 if (w1.isSelected()) {
		        				 p1=10+(10*0.15);
		        				 totaltext.setText("One Week, "+p1+"sar");
		        			 } if (w2.isSelected()) {
		        				 p2=13+(13*0.15);
		        				 totaltext.setText("Two Weeks, "+p2+"sar");
		        			 } if (w3.isSelected()) {
		        				 p3=18+(18*0.15);
		        				 totaltext.setText("Three Weeks, "+p3+"sar");
		        			 }

		        			 JOptionPane.showMessageDialog(null, "Your total is calculated. You may proceed to Reciept.",
			            				 " ", JOptionPane.INFORMATION_MESSAGE);

		            		 }//end else

		            		 if (bookJList.isSelectionEmpty()) {
		            			 JOptionPane.showMessageDialog(null, "You must Select a Book!",
				                    		"Error!!", JOptionPane.ERROR_MESSAGE);
		            		 }

		            	//new frame

		    			 JLabel nameR = new JLabel("First Name: "+nnameT);
		    			 nameR.setBounds(60, 60, 150, 100);

		    			 JLabel lastR = new JLabel("Last Name: "+llastT);
		    			 lastR.setBounds(60, 100, 150, 100);

		    			 JLabel emaill = new JLabel("E-mail Address: "+eemailT);
		    			 emaill.setBounds(60, 140, 300, 100);

		    			 JLabel phoneR = new JLabel("Phone Number: "+pphoneT);
		    			 phoneR.setBounds(60, 180, 200, 100);

		    			 JLabel totalR = new JLabel("Renting Info: "+totaltext.getText());
		    			 totalR.setBounds(60, 260, 200, 100);

		    			 JLabel bookR = new JLabel("Book: "+bookJList.getSelectedValue());
		    			 bookR.setBounds(60, 220, 200, 100);

		    			 JLabel thanku = new JLabel("✶Thank You for Using Pick A Book!✶");
		    			 thanku.setBounds(110, 350, 400, 100);

		    			 f2.add(nameR); f2.add(lastR); f2.add(emaill); f2.add(phoneR);
		    			 nameR.setFont(fnt2); lastR.setFont(fnt2); emaill.setFont(fnt2);
		    			 phoneR.setFont(fnt2); f2.add(thanku); thanku.setFont(fnt);
		    			 thanku.setForeground(Color.WHITE); f2.add(totalR);
		    			 totalR.setFont(fnt2); f2.add(bookR); bookR.setFont(fnt2);

		            	 //
		    			 //
		    			 //

		    			 reciept.addActionListener(new ActionListener(){
		 		            public void actionPerformed(ActionEvent e){

		 		    			 f.setVisible(false);
		 	 			         f2.setVisible(true);

		 			            }
		 			        });//button proceeds to the next frame (reciept) !!!!
		    			 //
		    			 //
		    			 //
		    	  			//pressing proceed to move to frame 2
		    			 pay.addActionListener(new ActionListener(){
		    	            public void actionPerformed(ActionEvent e){

		    		               try {
		          				 FileWriter file = new FileWriter("book.txt", true);
		          				 BufferedWriter bfw = new BufferedWriter(file);

		          				 bfw.write("\nFirst Name: "+nameT.getText()+" \nLast Name: "+lastT.getText()
		          				 +" \nPhone: "+phoneT.getText()+" \nE-mail: "+emailT.getText()
		          				 +" \nBook Selected: "+bookJList.getSelectedValue()
		          				 +" \nTotal Price and Period: "+totaltext.getText()+"\n");

		          				 bfw.close();

		          			 } catch (IOException ex) {
		          				 ex.printStackTrace();
		          			 }//end of catch

		    		              JOptionPane.showMessageDialog(null, "Your info has been added to our records!"
		    		            		  ,"Files", JOptionPane.INFORMATION_MESSAGE);

		    		            }
		    		        });//button proceeds to the next frame !!!!
		    	               //design an error for proceeding without submitting
		    			 //
		    			 //
		    			 //

			            }//end of action performed
			      });//submit

		f.setVisible(true); // Display the frame

	}//END OF MAIN

}//END OF CLASS
