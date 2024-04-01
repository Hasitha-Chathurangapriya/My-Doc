/*========================================================================================
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
__________________________________________________________________________________________
____________________________________2019/20 BATCH_________________________________________
___________________________RAJARATA UNIVERSITY OF SRI LANKA_______________________________
____________________________FACULTY OF MANAGEMENT STUDIES_________________________________
____________________________INFORMATION SYSTEMS DEPARTMENT________________________________
******************************************************************************************
++++++++++++++++++++++++++++++___P.H.H.C JAYASOORIYA___+++++++++++++++++++++++++++++++++++
******************************************************************************************
__________________________________________________________________________________________
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
==========================================================================================
__________________________________________________________________________________#HASITHA
*/


import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

class MyDoc extends JFrame
{
	JFrame frame1   = new JFrame();
	JLabel L1       = new JLabel();
	JLabel P2L1     = new JLabel("BMI");
	JLabel P2L2		= new JLabel("Enter your weight");
	JLabel P2L3		= new JLabel("Enter your Height");
	JLabel P2L4		= new JLabel("Kg");
	JLabel P2L5		= new JLabel("Cm");
	JLabel P2L6     = new JLabel("BMI =");
	JLabel P2L7     = new JLabel("");
	JLabel Q1       = new JLabel("");
	JLabel Q2       = new JLabel("");
	JLabel Q3       = new JLabel("");
	JLabel I1       = new JLabel("");
	JLabel I2       = new JLabel("");
	JLabel I3       = new JLabel("");
	JLabel P5L1     = new JLabel("1");
	JLabel P5L2     = new JLabel("2");
	JLabel P5L3     = new JLabel("3");
	JLabel P5L4     = new JLabel("4");
	JLabel P5L5     = new JLabel("Color Blindness Text");
	JLabel P5L6     = new JLabel("1");
	JLabel P5L7     = new JLabel("2");
	JLabel P5L8     = new JLabel("3");
	JLabel P5L9     = new JLabel("4");
	JLabel P5L10    = new JLabel("Answer");
	JLabel P5L11    = new JLabel("2.");
	JLabel P5L12    = new JLabel("3.");
	JLabel P5L13    = new JLabel("4.");
	JLabel P5L14    = new JLabel("Good");
	JLabel P3L1     = new JLabel("Result =");
	JLabel PL1      = new JLabel("");
	JLabel PL2      = new JLabel("");
	JLabel PL3      = new JLabel("Gain From Investment");
	JLabel PL4      = new JLabel("Cost Of Investment");
	JLabel PL5      = new JLabel("Loan Amount (Rs.) :");
	JLabel PL6      = new JLabel("Interest Rate :");
	JLabel PL7      = new JLabel("Months :");
	JLabel PL8      = new JLabel("Monthly Payment =");
	JLabel PL9      = new JLabel("Initial/Net Investment :");
	JLabel PL10     = new JLabel("Annual Net Chash Flow :");
	JLabel PL11     = new JLabel("Amount :");
	JLabel PL12     = new JLabel("Percentage :");
	JLabel PL13     = new JLabel("ROI =");
	JLabel PL14     = new JLabel("Pay Back Period =");
	JLabel PL15     = new JLabel("Answer =");
	JLabel PL16     = new JLabel("");
	JLabel PLM1     = new JLabel("Nathing happens by chance,by fate.");
	JLabel PLM2     = new JLabel("You create your own fate by your actions.");
	JLabel PLM3     = new JLabel("That't KARMA !");
	JLabel PLM4     = new JLabel(" If your BMI is less than 18.5 or above 23, seek medical advice.");
	JLabel PLM5     = new JLabel("How many liters of water did you drink today ?");
	JLabel PLM6     = new JLabel("Value 1");
	JLabel PLM7     = new JLabel("Value 2");
	JLabel PLM8     = new JLabel("Answer =");
	JLabel PLM9     = new JLabel("Male");
	JLabel PLM10    = new JLabel("Female");
	JLabel PLM11    = new JLabel("Return On Investment (ROI)");
	JLabel PLM12    = new JLabel("Bank Loan Monthly Payment");
	JLabel PLM13    = new JLabel("Pay Back Period");
	JLabel PLM14    = new JLabel("Percentage Calculator");
	JLabel PLM15    = new JLabel("Mini Calculator");
	JLabel PLM16    = new JLabel("MyDoc");
	JLabel PLM17    = new JLabel("Money is as important as physical health in");
	JLabel PLM18    = new JLabel("everyday life.To be Successful,");
	JLabel PLM19    = new JLabel("You need to balance both Health and Finances.");
	JLabel PLM20    = new JLabel("Return on Investment is a key business metric that measures the profitability of investment or marketing");
	JLabel PLM21    = new JLabel("activities by weighing the size of the upfront cost against the net profits in produced.");
	JLabel PLM22    = new JLabel("SYSTOLIC mm Hg");
	JLabel PLM23    = new JLabel("DIASTOLIC mm Hg");
	JLabel PLM24    = new JLabel("Answer");
	JLabel PLM25    = new JLabel("Blood Pressure");
	JLabel PLM26    = new JLabel("");
	JLabel PLM27    = new JLabel("The project with the lowest payback period is the most suitable project.");
	ImageIcon image = new ImageIcon("image/1.jpg");
	ImageIcon image1= new ImageIcon("image/4.PNG");
	ImageIcon image2= new ImageIcon("image/P6.PNG");
	ImageIcon image3= new ImageIcon("image/P4.PNG");
	ImageIcon image4= new ImageIcon("image/B1.PNG");
	ImageIcon image5= new ImageIcon("image/B2.1.jpg");
	ImageIcon image6= new ImageIcon("image/B3.jpg");
	ImageIcon image7= new ImageIcon("image/B4.jpg");
	ImageIcon image8= new ImageIcon("image/M.JPG");
	ImageIcon image9= new ImageIcon("image/S.JPG");
	ImageIcon imageA= new ImageIcon("image/123.JPG");
	ImageIcon imageB= new ImageIcon("image/P1.JPG");
	JButton B1      = new JButton("BMI");
	JButton B2      = new JButton("Water Drinking");
	JButton B3      = new JButton("Blood Pressure");
	JButton B4      = new JButton("Color Blindness Text");
	JButton P2B1    = new JButton("BACK");
	JButton P2B2    = new JButton("BACK");
	JButton P2B3	= new JButton("BACK");
	JButton P2B4	= new JButton("BACK");
	JButton P5B1    = new JButton("Enter");
	JButton P3B1    = new JButton("Calculate BMI");
	JButton PB1     = new JButton("Enter");
	JButton PB2     = new JButton("Enter");
	JButton PMB1    = new JButton("Health");
	JButton P1B1	= new JButton("BACK");
	JButton PMB2    = new JButton("Financial");
	JButton PMB3	= new JButton("BACK");
	JButton PMB4    = new JButton("ROI");
	JButton PMB5    = new JButton("Bank Loan Monthly Payment");
	JButton PMB6    = new JButton("Pay Back Period");
	JButton PMB7    = new JButton("Percentage Calculator");
	JButton PMB8    = new JButton("Calculator");
	JButton PMB9	= new JButton("BACK");
	JButton PMB10	= new JButton("Calculate");
	JButton PMB11	= new JButton("BACK");
	JButton PMB12	= new JButton("Calculate");
	JButton PMB13	= new JButton("BACK");
	JButton PMB14	= new JButton("Calculate");
	JButton PMB15	= new JButton("BACK");
	JButton PMB16	= new JButton("Calculate");
	JButton PMB17	= new JButton("BACK");
	JButton PMB18	= new JButton("+");
	JButton PMB19	= new JButton("-");
	JButton PMB20	= new JButton("*");
	JButton PMB21	= new JButton("/");
	JButton PMB22	= new JButton("Enter");
	JButton PMB23	= new JButton("Enter");
	JPanel P1       = new JPanel();
	JPanel P2       = new JPanel();
	JPanel P3       = new JPanel();
	JPanel P4       = new JPanel();
	JPanel P5       = new JPanel();
	JPanel PM1      = new JPanel();
	JPanel PM2      = new JPanel();
	JPanel PM3      = new JPanel();
	JPanel PM4      = new JPanel();
	JPanel PM5      = new JPanel();
	JPanel PM6      = new JPanel();
	JPanel PM7      = new JPanel();
	Font   fnt 		= new Font("Arial",Font.BOLD,36);
	Font   fnt1     = new Font("Time New Romn",Font.BOLD,40);
	Font   fnt2     = new Font("Time New Romn",Font.BOLD,13);
	Font   fnt3     = new Font("Time New Romn",Font.BOLD,16);
	Font   fnt4     = new Font("Forte",Font.BOLD,52);
	Font   fnt5     = new Font("Time New Romn",Font.BOLD,14);
	Font   fnt6     = new Font("Time New Romn",Font.BOLD,22);
	Font   fnt7     = new Font("Time New Romn",Font.BOLD,12);
	JTextArea P2T1  = new JTextArea();
	JTextArea P2T2  = new JTextArea();
	JTextArea P5T1  = new JTextArea();
	JTextArea P5T2  = new JTextArea();
	JTextArea P5T3  = new JTextArea();
	JTextArea P5T4  = new JTextArea();
	JTextArea P3T1  = new JTextArea();
	JTextArea P3T2  = new JTextArea();
	JTextArea PBT1  = new JTextArea();
	JTextArea PBT2  = new JTextArea();
	JTextArea PBT3  = new JTextArea();
	JTextArea PBT4  = new JTextArea();
	JTextArea PBT5  = new JTextArea();
	JTextArea PBT6  = new JTextArea();
	JTextArea PBT7  = new JTextArea();
	JTextArea PBT8  = new JTextArea();
	JTextArea PBT9  = new JTextArea();
	JTextArea PBT10 = new JTextArea();
	JTextArea PBT11 = new JTextArea();
	JTextArea PBT12 = new JTextArea();
	JTextArea PBT13 = new JTextArea();
	JRadioButton A  = new JRadioButton("16,9,74,12");
	JRadioButton B  = new JRadioButton("17,80,14,12");
	JRadioButton C  = new JRadioButton("1,9,7,1");
	JRadioButton D  = new JRadioButton("1,69,84,2");
	
	
	
	public MyDoc()
	
	{
		frame1.setTitle("MyDoc");
		frame1.setSize(700,500);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame1.setVisible(true);
		frame1.setResizable(false);
		frame1.setLocationRelativeTo(null);
		frame1.setLayout(null);
		
	//==============================================Main============================================================================
	    L1.setSize(450,500);
		L1.setLocation(0,0);
		L1.setIcon(image);
		L1.setVerticalAlignment(L1.CENTER);
		L1.setHorizontalAlignment(L1.CENTER);
		P1.add(L1);
		
		P2L7.setSize(600,240);
		P2L7.setLocation(50,150);
		P2L7.setIcon(image1);
		P2L7.setVerticalAlignment(P2L7.CENTER);
		P2L7.setHorizontalAlignment(P2L7.CENTER);
		P2.add(P2L7);
		
		Q1.setSize(240,250);
		Q1.setLocation(-20,-8);
		Q1.setIcon(image2);
		Q1.setVerticalAlignment(Q1.CENTER);
		Q1.setHorizontalAlignment(Q1.CENTER);
		P3.add(Q1);
		
		Q2.setSize(280,230);
		Q2.setLocation(-32,233);
		Q2.setIcon(image3);
		Q2.setVerticalAlignment(Q2.CENTER);
		Q2.setHorizontalAlignment(Q2.CENTER);
		P3.add(Q2);
		
		I1.setSize(550,400);
		I1.setLocation(-20,20);
		I1.setIcon(image5);
		I1.setVerticalAlignment(I1.CENTER);
		I1.setHorizontalAlignment(I1.CENTER);
		P5.add(I1);
		
		PL1.setSize(550,500);
		PL1.setLocation(-50,-15);
		PL1.setIcon(image8);
		PL1.setVerticalAlignment(PL1.CENTER);
		PL1.setHorizontalAlignment(PL1.CENTER);
		PM1.add(PL1);
		
		PL2.setSize(400,500);
		PL2.setLocation(-32,0);
		PL2.setIcon(image9);
		PL2.setVerticalAlignment(PL2.CENTER);
		PL2.setHorizontalAlignment(PL2.CENTER);
		PM2.add(PL2);
		
		
		PLM26.setSize(300,300);
		PLM26.setLocation(200,180);
		PLM26.setIcon(imageB);
		PLM26.setVerticalAlignment(PL2.CENTER);
		PLM26.setHorizontalAlignment(PL2.CENTER);
		P4.add(PLM26);
	
	//=============================================Button===========================================================================	
	
	//Panel_PM1_Main
	
		PLM16.setSize(500,50);
		PLM16.setLocation(450,20);
		PM1.add(PLM16);
		PLM16.setFont(fnt4);
		
		
		PMB1.setSize(155,50);
		PMB1.setLocation(470,260);
		PM1.add(PMB1);
		PMB1.setFont(fnt6);
	
		PMB2.setSize(155,50);
		PMB2.setLocation(470,340);
		PM1.add(PMB2);
		PMB2.setFont(fnt6);
		
		PLM1.setSize(500,50);
		PLM1.setLocation(410,70);
		PM1.add(PLM1);
		PLM1.setFont(fnt2);
		PLM1.setForeground(Color.BLACK);
		
		PLM2.setSize(500,50);
		PLM2.setLocation(410,90);
		PM1.add(PLM2);
		PLM2.setFont(fnt2);
		PLM2.setForeground(Color.BLACK);
		
		PLM3.setSize(500,50);
		PLM3.setLocation(410,110);
		PM1.add(PLM3);
		PLM3.setFont(fnt2);
		PLM3.setForeground(Color.BLACK);
		
		PLM17.setSize(500,50);
		PLM17.setLocation(410,140);
		PM1.add(PLM17);
		PLM18.setFont(fnt2);
		
		PLM18.setSize(500,50);
		PLM18.setLocation(410,160);
		PM1.add(PLM18);
		PLM18.setFont(fnt2);
		
		PLM19.setSize(500,50);
		PLM19.setLocation(410,180);
		PM1.add(PLM19);
		PLM18.setFont(fnt2);
		
		
	//Panel_PM2_Financial
		PMB3.setSize(100,30);
		PMB3.setLocation(550,400);
		PM2.add(PMB3);
		
		PMB4.setSize(250,50);
		PMB4.setLocation(390,70);
		PM2.add(PMB4);
		PMB4.setFont(fnt5);
		
		PMB5.setSize(250,50);
		PMB5.setLocation(390,130);
		PM2.add(PMB5);
		PMB5.setFont(fnt5);
		
		PMB6.setSize(250,50);
		PMB6.setLocation(390,190);
		PM2.add(PMB6);
		PMB6.setFont(fnt5);
		
		PMB7.setSize(250,50);
		PMB7.setLocation(390,250);
		PM2.add(PMB7);
		PMB7.setFont(fnt5);
		
		PMB8.setSize(250,50);
		PMB8.setLocation(390,310);
		PM2.add(PMB8);
		PMB8.setFont(fnt5);
	
	//Panel_PM3_ROI
	
		PLM11.setSize(700,30);
		PLM11.setLocation(80,30);
		PM3.add(PLM11);
		PLM11.setFont(fnt1);
		
		PL3.setSize(250,30);
		PL3.setLocation(100,100);
		PM3.add(PL3);
		
		PL4.setSize(250,30);
		PL4.setLocation(100,150);
		PM3.add(PL4);
		
		PMB9.setSize(100,30);
		PMB9.setLocation(550,400);
		PM3.add(PMB9);
		
		PBT1.setSize(200,30);
		PBT1.setLocation(250,100);
		PM3.add(PBT1);
		
		PBT2.setSize(200,30);
		PBT2.setLocation(250,150);
		PM3.add(PBT2);
		
		PMB10.setSize(200,30);
		PMB10.setLocation(250,200);
		PM3.add(PMB10);
		
		PL13.setSize(250,30);
		PL13.setLocation(250,260);
		PM3.add(PL13);
		
		PLM20.setSize(700,30);
		PLM20.setLocation(40,320);
		PM3.add(PLM20);
		
		PLM21.setSize(700,30);
		PLM21.setLocation(40,340);
		PM3.add(PLM21);
		
	//Panel_PM4_Bank Loan Monthly Payment
	
		PLM12.setSize(700,50);
		PLM12.setLocation(80,30);
		PM4.add(PLM12);
		PLM12.setFont(fnt1);
	
		PL5.setSize(250,30);
		PL5.setLocation(100,100);
		PM4.add(PL5);
		
		PL6.setSize(250,30);
		PL6.setLocation(100,150);
		PM4.add(PL6);
		
		PL7.setSize(250,30);
		PL7.setLocation(100,200);
		PM4.add(PL7);
	
		PL8.setSize(250,30);
		PL8.setLocation(100,300);
		PM4.add(PL8);
		
		PMB11.setSize(100,30);
		PMB11.setLocation(550,400);
		PM4.add(PMB11);
		
		PBT3.setSize(200,30);
		PBT3.setLocation(240,100);
		PM4.add(PBT3);
	
		PBT4.setSize(30,30);
		PBT4.setLocation(240,150);
		PM4.add(PBT4);
		
		PBT5.setSize(30,30);
		PBT5.setLocation(240,200);
		PM4.add(PBT5);
		
		PMB12.setSize(100,30);
		PMB12.setLocation(240,250);
		PM4.add(PMB12);
		
	//Panel_PM5_Pay Back Period
	
		PLM13.setSize(700,50);
		PLM13.setLocation(180,30);
		PM5.add(PLM13);
		PLM13.setFont(fnt1);
	
		PMB13.setSize(100,30);
		PMB13.setLocation(550,400);
		PM5.add(PMB13);
		
		PL9.setSize(250,30);
		PL9.setLocation(100,100);
		PM5.add(PL9);
		
		PL10.setSize(250,30);
		PL10.setLocation(100,150);
		PM5.add(PL10);
		
		PBT6.setSize(150,30);
		PBT6.setLocation(250,100);
		PM5.add(PBT6);
		
		PBT7.setSize(150,30);
		PBT7.setLocation(250,150);
		PM5.add(PBT7);
		
		PMB14.setSize(100,30);
		PMB14.setLocation(270,250);
		PM5.add(PMB14);
		
		PL14.setSize(300,30);
		PL14.setLocation(100,300);
		PM5.add(PL14);
		
		PLM27.setSize(500,30);
		PLM27.setLocation(100,350);
		PM5.add(PLM27);
		PLM27.setForeground(Color.BLACK);
		
	//Panel_PM6_Percentage Cal
	
		PLM14.setSize(700,50);
		PLM14.setLocation(130,30);
		PM6.add(PLM14);
		PLM14.setFont(fnt1);
	
		PMB15.setSize(100,30);
		PMB15.setLocation(550,400);
		PM6.add(PMB15);
		
		PL11.setSize(250,30);
		PL11.setLocation(100,100);
		PM6.add(PL11);
		
		PL12.setSize(250,30);
		PL12.setLocation(100,150);
		PM6.add(PL12);
		
		PBT8.setSize(150,30);
		PBT8.setLocation(250,100);
		PM6.add(PBT8);
		
		PBT9.setSize(150,30);
		PBT9.setLocation(250,150);
		PM6.add(PBT9);
		
		PMB16.setSize(100,30);
		PMB16.setLocation(270,250);
		PM6.add(PMB16);
		
		PL15.setSize(250,30);
		PL15.setLocation(100,300);
		PM6.add(PL15);
		
	//Panel_PM7_CAL
	
		PLM15.setSize(700,50);
		PLM15.setLocation(200,30);
		PM7.add(PLM15);
		PLM15.setFont(fnt1);
	
		PBT10.setSize(150,30);
		PBT10.setLocation(300,100);
		PM7.add(PBT10);
		
		PBT11.setSize(150,30);
		PBT11.setLocation(300,150);
		PM7.add(PBT11);
		
		PLM6.setSize(150,30);
		PLM6.setLocation(220,100);
		PM7.add(PLM6);
		
		PLM7.setSize(150,30);
		PLM7.setLocation(220,150);
		PM7.add(PLM7);
		
		PLM8.setSize(150,30);
		PLM8.setLocation(260,250);
		PM7.add(PLM8);
		
		PMB17.setSize(100,30);
		PMB17.setLocation(550,400);
		PM7.add(PMB17);
		
		PMB18.setSize(100,30);
		PMB18.setLocation(150,300);
		PM7.add(PMB18);
		PMB18.setFont(fnt6);
		
		PMB19.setSize(100,30);
		PMB19.setLocation(250,300);
		PM7.add(PMB19);
		PMB19.setFont(fnt6);
		
		PMB20.setSize(100,30);
		PMB20.setLocation(350,300);
		PM7.add(PMB20);
		PMB20.setFont(fnt6);
		
		PMB21.setSize(100,30);
		PMB21.setLocation(450,300);
		PM7.add(PMB21);
		PMB21.setFont(fnt6);
		
		
		
	//Panel_1
		B1.setSize(155,50);
		B1.setLocation(	490,100);
		P1.add(B1);
		B1.setFont(fnt7);
		
		B2.setSize(155,50);
		B2.setLocation(490,170);
		P1.add(B2);
		B2.setFont(fnt7);
		
		B3.setSize(155,50);
		B3.setLocation(490,240);
		P1.add(B3);
		B3.setFont(fnt7);
		
		B4.setSize(155,50);
		B4.setLocation(490,310);
		P1.add(B4);
		B4.setFont(fnt7);
		
		P1B1.setSize(100,30);
		P1B1.setLocation(550,400);
		P1.add(P1B1);
		
		
		
	//Panel_2
	
		P2B1.setSize(100,30);
		P2B1.setLocation(550,400);
		P2.add(P2B1);
		
		P2L1.setSize(200,30);
		P2L1.setLocation(300,20);
		P2.add(P2L1);
		P2L1.setFont(fnt1);
		
		P2L2.setSize(100,30);
		P2L2.setLocation(40,80);
		P2.add(P2L2);
		
		P2L3.setSize(100,30);
		P2L3.setLocation(40,120);
		P2.add(P2L3);
		
		P2T1.setSize(30,20);
		P2T1.setLocation(200,85);
		P2.add(P2T1);
		
		P2T2.setSize(30,20);
		P2T2.setLocation(200,125);
		P2.add(P2T2);
		
		P2L4.setSize(100,30);
		P2L4.setLocation(240,80);
		P2.add(P2L4);
		
		P2L5.setSize(100,20);
		P2L5.setLocation(240,120);
		P2.add(P2L5);
		
		P3B1.setSize(150,40);
		P3B1.setLocation(450,100);
		P2.add(P3B1);
		
		P2L6.setSize(80,50);
		P2L6.setLocation(310,100);
		P2.add(P2L6);
		
		PLM4.setSize(500,30);
		PLM4.setLocation(60,400);
		P2.add(PLM4);
		PLM4.setFont(fnt3);
		PLM4.setForeground(Color.RED);
		
		
		
		
		
	//Panel_3
	
		PLM5.setSize(500,30);
		PLM5.setLocation(250,10);
		P3.add(PLM5);
		PLM5.setFont(fnt3);
	
		PLM9.setSize(500,30);
		PLM9.setLocation(250,72);
		P3.add(PLM9);
	
		PLM10.setSize(500,30);
		PLM10.setLocation(250,320);
		P3.add(PLM10);
	
		P2B2.setSize(100,30);
		P2B2.setLocation(550,400);
		P3.add(P2B2);
		
		P3T1.setSize(30,30);
		P3T1.setLocation(300,75);
		P3.add(P3T1);
		
		P3T2.setSize(30,30);
		P3T2.setLocation(300,320);
		P3.add(P3T2);
		
		PB1.setSize(100,30);
		PB1.setLocation(270,130);
		P3.add(PB1);
		
		PB2.setSize(100,30);
		PB2.setLocation(270,375);
		P3.add(PB2);
		
		P3L1.setSize(500,30);
		P3L1.setLocation(260,220);
		P3.add(P3L1);
		
		
	//Panel_4
		
		P2B3.setSize(100,30);
		P2B3.setLocation(550,400);
		P4.add(P2B3);
		
		PBT12.setSize(50,30);
		PBT12.setLocation(250,100);
		P4.add(PBT12);
		
		PBT13.setSize(50,30);
		PBT13.setLocation(500,100);
		P4.add(PBT13);
		
		PLM22.setSize(200,30);
		PLM22.setLocation(130,100);
		P4.add(PLM22);
		
		PLM23.setSize(200,30);
		PLM23.setLocation(370,100);
		P4.add(PLM23);
		
		PMB22.setSize(100,30);
		PMB22.setLocation(200,150);
		P4.add(PMB22);
		
		PMB23.setSize(100,30);
		PMB23.setLocation(450,150);
		P4.add(PMB23);
		
		PLM24.setSize(200,40);
		PLM24.setLocation(300,200);
		P4.add(PLM24);
		
		PLM25.setSize(500,30);
		PLM25.setLocation(200,20);
		P4.add(PLM25);
		PLM25.setFont(fnt1);
		
	//Panel_5
		
		P2B4.setSize(100,30);
		P2B4.setLocation(550,400);
		P5.add(P2B4);
		
		P5L1.setSize(100,30);
		P5L1.setLocation(80,1);
		I1.add(P5L1);
		
		P5L2.setSize(100,30);
		P5L2.setLocation(300,1);
		I1.add(P5L2);
		
		P5L3.setSize(100,30);
		P5L3.setLocation(80,200);
		I1.add(P5L3);
		
		P5L4.setSize(100,30);
		P5L4.setLocation(300,200);
		I1.add(P5L4);
		
		P5L5.setSize(500,30);
		P5L5.setLocation(500,40);
		P5.add(P5L5);
		P5L5.setFont(fnt3);
		
		P5B1.setSize(150,30);
		P5B1.setLocation(500,250);
		P5.add(P5B1);
		
		P5L10.setSize(500,30);
		P5L10.setLocation(510,310);
		P5.add(P5L10);
		
		
		
		A.setSize(100,40);
		A.setLocation(520,100);
		P5.add(A);
		
		B.setSize(100,40);
		B.setLocation(520,130);
		P5.add(B);
		
		C.setSize(100,40);
		C.setLocation(520,160);
		P5.add(C);
		
		D.setSize(100,40);
		D.setLocation(520,190);
		P5.add(D);
		
		ButtonGroup group = new ButtonGroup();
		group.add(A);
		group.add(B);
		group.add(C);
		group.add(D);
		

	//==========================================JPanel===================================================================================
		PM1.setSize(700,500);
		PM1.setLayout(null);
		PM1.setVisible(true);
		frame1.add(PM1);
		
		PM2.setSize(700,500);
		PM2.setLayout(null);
		PM2.setVisible(false);
		frame1.add(PM2);
		
		PM3.setSize(700,500);
		PM3.setLayout(null);
		PM3.setVisible(false);
		frame1.add(PM3);
		
		PM4.setSize(700,500);
		PM4.setLayout(null);
		PM4.setVisible(false);
		frame1.add(PM4);
		
		PM5.setSize(700,500);
		PM5.setLayout(null);
		PM5.setVisible(false);
		frame1.add(PM5);
		
		PM6.setSize(700,500);
		PM6.setLayout(null);
		PM6.setVisible(false);
		frame1.add(PM6);
		
		PM7.setSize(700,500);
		PM7.setLayout(null);
		PM7.setVisible(false);
		frame1.add(PM7);
		
		P1.setSize(700,500);
		P1.setLayout(null);
		P1.setVisible(false);
		frame1.add(P1);
		
		P2.setSize(700,500);
		P2.setLayout(null);
		P2.setVisible(false);
		frame1.add(P2);
		
		P3.setSize(700,500);
		P3.setLayout(null);
		P3.setVisible(false);
		frame1.add(P3);
		
		P4.setSize(700,500);
		P4.setLayout(null);
		P4.setVisible(false);
		frame1.add(P4);
		
		P5.setSize(700,500);
		P5.setLayout(null);
		P5.setVisible(false);
		frame1.add(P5);
		
	//++++++++++++++++++++++++++++++++++++++++Color++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		P1.setBackground(Color.CYAN);
		P2.setBackground(Color.CYAN);
		P3.setBackground(Color.CYAN);
		P4.setBackground(Color.CYAN);
		P5.setBackground(Color.WHITE);
		PM1.setBackground(Color.CYAN);    
		PM2.setBackground(Color.CYAN);      
		PM3.setBackground(Color.CYAN);    
		PM4.setBackground(Color.CYAN);      
		PM5.setBackground(Color.CYAN);     
		PM6.setBackground(Color.CYAN);      
		PM7.setBackground(Color.CYAN);
		
	


    //----------------------------------Action_Button----------------------------------------------------------------------------------	
		PMB1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM1.setVisible(false);
				P1.setVisible(true);
			}
		}
		
		);
		
		
		PMB2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM1.setVisible(false);
				PM2.setVisible(true);
			}
		}
		
		);
		
		PMB4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM2.setVisible(false);
				PM3.setVisible(true);
			}
		}
		
		);
		
		PMB5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM2.setVisible(false);
				PM4.setVisible(true);
			}
		}
		
		);
		
		PMB6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM2.setVisible(false);
				PM5.setVisible(true);
			}
		}
		
		);
		
		PMB7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM2.setVisible(false);
				PM6.setVisible(true);
			}
		}
		
		);
		
		PMB8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM2.setVisible(false);
				PM7.setVisible(true);
			}
		}
		
		);
		
		
		
		B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				P1.setVisible(false);
				P2.setVisible(true);
			}
		}
		
		);
		
		
		B2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				P1.setVisible(false);
				P3.setVisible(true);
			}
		}
		
		);
		
		B3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				P1.setVisible(false);
				P4.setVisible(true);
			}
		}
		);
		
		B4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				P1.setVisible(false);
				P5.setVisible(true);
			}
		}
		);
	//'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''	
		P3B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (e.getSource()==P3B1)
					{	
						
						double A       = Double.parseDouble(P2T1.getText());
						double B      = Double.parseDouble(P2T2.getText());
						double V      = B/100;
						double S      = V*V;
						double BMI    = A/S ;
						
						
						
						P2L6.setText("BMI = "+ BMI);
						
					}
						
					
				}
				
				catch (NumberFormatException e1)
				{
					P2L6.setText("Error");
				}
			}
		}
		);
	//'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
		P5B1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			if(A.isSelected()==true)
			{
				P5L10.setText("Your answer is Correct");
			}
			else if(B.isSelected()==true)
			{
				P5L10.setText("Your answer is Wrrong ");
			}
			else if(C.isSelected()==true)
			{
				P5L10.setText("Your answer is Wrrong");
			}
			else if(D.isSelected()==true)
			{
				P5L10.setText("Your answer is Wrrong");
			}
		}
		});
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
		PB1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			try{
				if(e.getSource()==PB1)
					{
						
						double B   = Double.parseDouble(P3T1.getText());
					
							
							if(B<3.7)
								{
								P3L1.setText("The amount of water you drink today is NOT GOOD for your HEALTH ?");
								}
							else
								{
								P3L1.setText("You have drunk enough water for your body.But do not Give Up !");
								}
			            
					}
			}
			catch (NumberFormatException e1)
				{
					P3L1.setText("Error");
				}
		    }   
		});
		
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		PB2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			try{
				if(e.getSource()==PB2)
					{
						double O = Double.parseDouble(P3T2.getText());
					
							
							if(O<2.7)
								{
								P3L1.setText("The amount of water you drink today is NOT GOOD for your HEALTH ?");
								}
							else
								{
								P3L1.setText("You have drunk enough water for your body.But do not Give Up !");
								}
			            
					}
			}
			catch (NumberFormatException e1)
				{
					P3L1.setText("Error");
				}
		    }   
		});
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		PMB10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (e.getSource()==PMB10)
					{	
						double A      = Double.parseDouble(PBT1.getText());
						double B      = Double.parseDouble(PBT2.getText());
						double V      = A-B;
						double ROI    = V/B *100;
						
						
						
						PL13.setText("ROI =" + ROI +"%");
						
					}
						
					
				}
				
				catch (NumberFormatException e1)
				{
					PL13.setText("Error");
				}
			}
		}
		); 
	
	
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
		PMB12.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (e.getSource()==PMB12)
					{	
						
						double A            = Double.parseDouble(PBT3.getText());
						double B            = Double.parseDouble(PBT4.getText());
						double C            = Double.parseDouble(PBT5.getText());
						
						double V  = (A*B)/100;
						double R  = V+A;
						double MP = R/C;
						
						
						
						PL8.setText("Monthly Payment = Rs."+ MP );
						
					}
						
					
				}
				
				catch (NumberFormatException e1)
				{
					PL8.setText("Error");
				}
			}
		}
		); 
	
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
		PMB14.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (e.getSource()==PMB14)
					{	
						double A      = Double.parseDouble(PBT6.getText());
						double B      = Double.parseDouble(PBT7.getText());
						double Yaer    = A/B ;
						
						
						
						PL14.setText("Pay Back Period = " + Yaer +" Yaers");
						
					}
						
					
				}
				
				catch (NumberFormatException e1)
				{
					PL14.setText("Error");
				}
			}
		}
		); 
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
		PMB16.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (e.getSource()==PMB16)
					{	
						double A      = Double.parseDouble(PBT8.getText());
						double P      = Double.parseDouble(PBT9.getText());
						double B      = A*P ;
						double Answer = B/100;
						
						
						
						PL15.setText("Answer = " + Answer );
						
					}
						
					
				}
				
				catch (NumberFormatException e1)
				{
					PL15.setText("Error");
				}
			}
		}
		); 
		
	//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	
		PMB18.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (e.getSource()==PMB18)
					{	
						double A      = Double.parseDouble(PBT10.getText());
						double P      = Double.parseDouble(PBT11.getText());
						double B      = A+P ;
						
						
						
						
						PLM8.setText("Answer = " + B );
						
					}
						
					
				}
				
				catch (NumberFormatException e1)
				{
					PLM8.setText("Error");
				}
			}
		}
		); 
		
		
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
		
		PMB19.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (e.getSource()==PMB19)
					{	
						double A      = Double.parseDouble(PBT10.getText());
						double P      = Double.parseDouble(PBT11.getText());
						double B      = A-P ;
						
						
						
						
						PLM8.setText("Answer = " + B );
						
					}
						
					
				}
				
				catch (NumberFormatException e1)
				{
					PLM8.setText("Error");
				}
			}
		}
		); 
	//####################################################################################################################################
	
		
		PMB20.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (e.getSource()==PMB20)
					{	
						double A      = Double.parseDouble(PBT10.getText());
						double P      = Double.parseDouble(PBT11.getText());
						double B      = A*P ;
						
						
						
						
						PLM8.setText("Answer = " + B );
						
					}
						
					
				}
				
				catch (NumberFormatException e1)
				{
					PLM8.setText("Error");
				}
			}
		}
		); 
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
		
		PMB21.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (e.getSource()==PMB21)
					{	
						double A      = Double.parseDouble(PBT10.getText());
						double P      = Double.parseDouble(PBT11.getText());
						double B      = A/P ;
						
						
						
						
						PLM8.setText("Answer =  " + B );
						
					}
						
					
				}
				
				catch (NumberFormatException e1)
				{
					PLM8.setText("Error");
				}
			}
		}
		); 
	//"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
		PMB22.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
						if (e.getSource()==PMB22)
						{
					    double O  = Double.parseDouble(PBT12.getText());
					
							
							if(O>180)
								{
								PLM24.setText("HYPERTENSIVE CRISIS");
								}
							else if(O>140)
								{
								PLM24.setText("HIGH BLOOD PRESSURE-2");
								}	
							else if(O>130)
								{
								PLM24.setText("HIGH BLOOD PRESSURE-1 ");
								}
							else if(O>120)
								{
								PLM24.setText("ELEVATED");
								}	
							else
								{
								PLM24.setText("NORMAL");
								}
						}
				}
				catch (NumberFormatException e1)
					{
						PLM24.setText("Error");
					}
			
		    }
		}); 
	
	//#####################################################################################################################################
		
		PMB23.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
						if (e.getSource()==PMB23)
						{
					    double O  = Double.parseDouble(PBT13.getText());
					
							
							if(O>120)
								{
								PLM24.setText("HYPERTENSIVE CRISIS");
								}
							else if(O>90)
								{
								PLM24.setText("HIGH BLOOD PRESSURE-2");
								}	
							else if(O>80)
								{
								PLM24.setText("HIGH BLOOD PRESSURE-1 ");
								}
							else if(O>80)
								{
								PLM24.setText("ELEVATED");
								}	
							else
								{
								PLM24.setText("NORMAL");
								}
						}
				}
				catch (NumberFormatException e1)
					{
						PLM24.setText("Error");
					}
			
		    }
		});
	
	
		
	//----------------------------------------------------BACK-----------------------------------------------------------------------------	
		
		P1B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				P1.setVisible(false);
				PM1.setVisible(true);
			}
		}
		);
			
		PMB3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM2.setVisible(false);
				PM1.setVisible(true);
			}
		}
		);	
			
		
		P2B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				P2.setVisible(false);
				P1.setVisible(true);
			}
		}
		);
	
		
		P2B2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				P3.setVisible(false);
				P1.setVisible(true);
			}
		}
		);
		
		
		P2B3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				P4.setVisible(false);
				P1.setVisible(true);
			}
		}
		);
		
		P2B4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				P5.setVisible(false);
				P1.setVisible(true);
			}
		}
		);
		
		PMB9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM3.setVisible(false);
				PM2.setVisible(true);
			}
		}
		);
		
		PMB11.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM4.setVisible(false);
				PM2.setVisible(true);
			}
		}
		);
		
		
		PMB13.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM5.setVisible(false);
				PM2.setVisible(true);
			}
		}
		);
		
		PMB15.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM6.setVisible(false);
				PM2.setVisible(true);
			}
		}
		);
		
		
		PMB17.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				PM7.setVisible(false);
				PM2.setVisible(true);
			}
		}
		);
		
		
	//----------------------------------------------------------------------------------------------------------------------------------
	
		
	}
	
	
	
	public static void main(String[]args)
	{
		MyDoc obj = new MyDoc();
	}
	
}
//_____________________________________________________________________________________________________________________________________THE END




/*********************************************************************************************************************************************
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                                                        __ACKNOWLEDGEMENT__
										   
										   
I would like to express my special thanks of gratitude to 
                                               my Computer Programing lecturer Mr. Udesh S. Senarath 
                                                                             for their able guidence and support in completing my JAVA project.



<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
***********************************************************************************************************************************************/
