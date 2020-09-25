 

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RigoTechnology implements ActionListener{

    CardLayout cl = new CardLayout(0,0);
    
    //object initilizing
    JFrame frame;
    JPanel pnlButton,pnlcont= new JPanel(),pnlMain1 = new JPanel(), pnlMain2= new JPanel(), pnlMain3 = new JPanel(), pnlMain4 = new JPanel();
    
    JLabel lblPlatform , lblAppointedBy , lblInterviewerName , lblTerminationDate , lblWorkingHours , lblSalary, lblDevName, lblJoiningDate, lblSpecialization, lblTerminateDate,
    lblSenPlatform,lblSenWorkingHours,lblSenContractPeriod,lblSenInterviewerName,lblSenSalary,
    lblSenName, lblSenJoiningDate, lblSenDevName, lblSenRoomNo,lblSenPlatformNo,lblSenAdvanceSalary;
    
    JTextField txtPlatform, txtAppointedBy , txtInterviewerName , txtTerminationDate , txtWorkingHours , txtSalary, txtDevName, txtJoiningDate, txtSpecialization, txtTerminateDate, txtSenPlatform, txtSenWorkingHours, txtSenContractPeriod,
    txtSenInterviewerName, txtSenSalary, txtSenName,txtSenJoiningDate, txtSenDevName,txtSenRoomNo,txtSenPlatformNo,txtSenAdvanceSalary, txtPlatformNo;
    
    
    JButton btnaddJuniorDeveloper, btnaddSeniorDeveloper, btnhireSeniorDeveloper, btnterminateSeniorDeveloper, btnhireJuniorDeveloper, btnClear,btnDisplay;
    
    //ArrayList
    ArrayList <Developer> list=new ArrayList<Developer>();
    ArrayList<SeniorDeveloper>listofSD=new ArrayList<SeniorDeveloper>();
    ArrayList<JuniorDeveloper>listofJD=new ArrayList<JuniorDeveloper>();
    ArrayList<SeniorDeveloper>listofHSD=new ArrayList<SeniorDeveloper>();
    ArrayList<JuniorDeveloper>listofHJD=new ArrayList<JuniorDeveloper>();
    
    //object of classes
    Developer Dev;
    SeniorDeveloper SDev;
    JuniorDeveloper JDev;
    SeniorDeveloper HSD;
    
    public  void gui() {

   
        // frame creating
        frame = new JFrame("Rigo Technology");
        frame.setSize(900,800);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        //pnlbutton JPanel
        pnlButton = new JPanel();
        pnlButton.setLayout(null);
        pnlButton.setBounds(10,10,250,740);
        pnlButton.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
        frame.add(pnlButton);
        
        //pnlbutton JButton
        btnClear = new JButton("Clear");
        Font f70 =new Font("Arial",Font.PLAIN,20);
        btnClear.setFont(f70);
        pnlButton.add(btnClear);
        btnClear.setBounds(40,400,150,50);
        btnClear.addActionListener(this);
        
       
        btnDisplay = new JButton("Display");
        Font f71 = new Font("Arial",Font.PLAIN,20);
        btnDisplay.setFont(f71);
        pnlButton.add(btnDisplay);
        btnDisplay.setBounds(40,500,150,50);
        btnDisplay.addActionListener(this);
        
       
        //pnlmain1 JPanel
        pnlMain1 = new JPanel();
        pnlMain1.setLayout(null);
        pnlMain1.setBounds(280,10,600,740);
        pnlMain1.setBackground(Color.LIGHT_GRAY);
        pnlMain1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
        frame.add(pnlMain1);

        //pnlMain1 JLabel elements
        lblPlatform = new JLabel("Platform :");
        Font f1 = new Font("Arial", Font.PLAIN,20);
        lblPlatform.setFont(f1);
        pnlMain1.add(lblPlatform);
        lblPlatform.setBounds(20,50,90,50);
        
        lblAppointedBy = new JLabel("Appointed By :");
        Font f2 =  new Font("Arial", Font.PLAIN,20);
        lblAppointedBy.setFont(f2);
        pnlMain1.add(lblAppointedBy);
        lblAppointedBy.setBounds(20,120,150,50);
        
        lblInterviewerName = new JLabel("Interviewer Name :");
        Font f5 = new Font("Arial",Font.PLAIN,20);
        lblInterviewerName.setFont(f5);
        pnlMain1.add(lblInterviewerName);
        lblInterviewerName.setBounds(20,190,200,50);
        
        lblTerminationDate = new JLabel("Termination Date :");
        Font f7 = new Font("Arial",Font.PLAIN,20);
        lblTerminationDate.setFont(f7);
        pnlMain1.add(lblTerminationDate);
        lblTerminationDate.setBounds(20,260,200,50);
        
        lblWorkingHours = new JLabel("Working Hours :");
        Font f8 = new Font("Arial",Font.PLAIN,20);
        lblWorkingHours.setFont(f8);
        pnlMain1.add(lblWorkingHours);
        lblWorkingHours.setBounds(20,330,200,50);
        
        lblSalary = new JLabel("Salary :");
        Font f9 = new Font("Arial",Font.PLAIN,20);
        lblSalary.setFont(f9);
        pnlMain1.add(lblSalary);
        lblSalary.setBounds(20,400,200,50);
        
        //pnlMain1 textbox
        txtPlatform = new JTextField();
        Font f3 = new Font("Arial", Font.PLAIN,15);
        txtPlatform.setFont(f3);
        pnlMain1.add(txtPlatform);
        txtPlatform.setBounds(220,60,250,30);
        
        txtAppointedBy = new JTextField();
        Font f4 = new Font("Arial", Font.PLAIN,15);
        txtAppointedBy.setFont(f4);
        pnlMain1.add(txtAppointedBy);
        txtAppointedBy.setBounds(220,130,250,30);
        
        txtInterviewerName = new JTextField();
        Font f6 = new Font("Arial",Font.PLAIN,15);
        txtInterviewerName.setFont(f6);
        pnlMain1.add(txtInterviewerName);
        txtInterviewerName.setBounds(220,200,250,30);
        
        txtTerminationDate = new JTextField();
        Font f10 = new Font("Arial",Font.PLAIN,15);
        txtTerminationDate.setFont(f10);
        pnlMain1.add(txtTerminationDate);
        txtTerminationDate.setBounds(220,270,250,30);
        
        txtWorkingHours = new JTextField();
        Font f11 = new Font("Arial", Font.PLAIN,15);
        txtWorkingHours.setFont(f11);
        pnlMain1.add(txtWorkingHours);
        txtWorkingHours.setBounds(220,340,250,30);
        
        txtSalary = new JTextField();
        Font f12 = new Font("Arial",Font.PLAIN,15);
        txtSalary.setFont(f12);
        pnlMain1.add(txtSalary);
        txtSalary.setBounds(220,410,250,30);
        
        //pnlMain1 Jbutton
        btnaddJuniorDeveloper = new JButton("Add");
        Font f13 = new Font("Arial",Font.PLAIN,20);
        btnaddJuniorDeveloper.setFont(f13);
        btnaddJuniorDeveloper.setBounds(250,500,150,50);
        pnlMain1.add(btnaddJuniorDeveloper);
        btnaddJuniorDeveloper.addActionListener(this);


        //pnlmain2 JPanel
        pnlMain2 = new JPanel();
        pnlMain2.setLayout(null);
        pnlMain2.setBounds(280,10,600,740);
        pnlMain2.setBackground(Color.LIGHT_GRAY);
        pnlMain2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
        frame.add(pnlMain2);
        
         //pnlMain2 JLabel elements
         JLabel lblDevName = new JLabel("Dev.Name :");
         Font fDevName = new Font("Arial",Font.PLAIN,20);
         lblDevName.setFont(fDevName);
         pnlMain2.add(lblDevName);
         lblDevName.setBounds(20,50,120,50);
         
         JLabel lblJoiningDate = new JLabel("Joining Date :");
         Font fJoiningDate = new Font("Arial",Font.PLAIN,20);
         lblJoiningDate.setFont(fJoiningDate);
         pnlMain2.add(lblJoiningDate);
         lblJoiningDate.setBounds(20,150,120,50);
         
         JLabel lblSpecialization = new JLabel("Specialization :");
         Font fSpecialization = new Font("Arial",Font.PLAIN,20);
         lblSpecialization.setFont(fSpecialization);
         pnlMain2.add(lblSpecialization);
         lblSpecialization.setBounds(20,250,150,50);
         
         JLabel lblTerminateDate = new JLabel("Terminate Date :");
         Font fTerminateDate = new Font("Arial",Font.PLAIN,20);
         lblTerminateDate.setFont(fTerminateDate);
         pnlMain2.add(lblTerminateDate);
         lblTerminateDate.setBounds(20,350,150,50);
         
         JLabel lblPlatformNo = new JLabel("Platform No :");
         Font f98 = new Font("Arial",Font.PLAIN,20);
         lblPlatformNo.setFont(f98);
         pnlMain2.add(lblPlatformNo);
         lblPlatformNo.setBounds(20,450,150,50);
         
        //pnlMain2 JTextField;
        txtDevName = new JTextField();
        Font ftxtDevName = new Font("Arial",Font.PLAIN,15);
        txtDevName.setFont(ftxtDevName);
        pnlMain2.add(txtDevName);
        txtDevName.setBounds(220,60,250,30);
        
        txtJoiningDate = new JTextField();
        Font ftxtJoiningDate = new Font("Arial", Font.PLAIN,15);
        txtJoiningDate.setFont(ftxtJoiningDate);
        pnlMain2.add(txtJoiningDate);
        txtJoiningDate.setBounds(220,160,250,30);
        
        txtSpecialization = new JTextField();
        Font ftxtSpecialization = new Font("Arial",Font.PLAIN,15);
        txtSpecialization.setFont(ftxtSpecialization);
        pnlMain2.add(txtSpecialization);
        txtSpecialization.setBounds(220,260,250,30);
        
        txtTerminateDate = new JTextField();
        Font ftxtTerminateDate = new Font("Arial",Font.PLAIN,15);
        txtTerminateDate.setFont(ftxtTerminateDate);
        pnlMain2.add(txtTerminateDate);
        txtTerminateDate.setBounds(220,360,250,30);
        
        txtPlatformNo = new JTextField();
        Font f99 = new Font("Arial",Font.PLAIN,15);
        txtPlatformNo.setFont(f99);
        txtPlatformNo.setBounds(220,460,250,30);
        pnlMain2.add(txtPlatformNo);
        
        //pnlMain2 JButton
        btnhireJuniorDeveloper  = new JButton("Hire");
        Font fbtnhireJuniorDeveloper = new Font("Arial", Font.PLAIN,20);
        btnhireJuniorDeveloper.setFont(fbtnhireJuniorDeveloper);
        pnlMain2.add(btnhireJuniorDeveloper);
        btnhireJuniorDeveloper.setBounds(250,530,150,50);
        btnhireJuniorDeveloper.addActionListener(this);
       
        
        //pnlmain3 JPanel
        pnlMain3 = new JPanel();
        pnlMain3.setLayout(null);
        pnlMain3.setBounds(280,10,600,740);
        pnlMain3.setBackground(Color.LIGHT_GRAY);
        pnlMain3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
        frame.add(pnlMain3);
        
        //pnlMain3 JLabel
        lblSenPlatform = new JLabel("Platform :");
        Font f30 = new Font("Arial",Font.PLAIN,20);
        lblSenPlatform.setFont(f30);
        pnlMain3.add(lblSenPlatform);
        lblSenPlatform.setBounds(20,50,120,50);
        
        lblSenWorkingHours = new JLabel("Working Hours :");
        Font f31 = new Font("Arial",Font.PLAIN,20);
        lblSenWorkingHours.setFont(f31);
        pnlMain3.add(lblSenWorkingHours);
        lblSenWorkingHours.setBounds(20,140,200,50);
        
        lblSenContractPeriod = new JLabel("Contract Period :");
        Font f32 = new Font("Arial",Font.PLAIN,20);
        lblSenContractPeriod.setFont(f32);
        pnlMain3.add(lblSenContractPeriod);
        lblSenContractPeriod.setBounds(20,230,200,50);
        
        lblSenInterviewerName = new JLabel("Interviewer Name :");
        Font f33 = new Font("Arial",Font.PLAIN,20);
        lblSenInterviewerName.setFont(f33);
        pnlMain3.add(lblSenInterviewerName);
        lblSenInterviewerName.setBounds(20,330,200,50);
        
        lblSenSalary = new JLabel("Salary :");
        Font f34 = new Font("Arial",Font.PLAIN,20);
        lblSenSalary.setFont(f34);
        pnlMain3.add(lblSenSalary);
        lblSenSalary.setBounds(20,420,200,50);
        
        //pnlMain3 JTextField
        txtSenPlatform = new JTextField();
        Font f40 = new Font("Arial",Font.PLAIN,15);
        txtSenPlatform.setFont(f40);
        pnlMain3.add(txtSenPlatform);
        txtSenPlatform.setBounds(220,60,250,30);
        
        txtSenWorkingHours = new JTextField();
        Font f41 = new Font("Arial", Font.PLAIN,15);
        txtSenWorkingHours.setFont(f41);
        pnlMain3.add(txtSenWorkingHours);
        txtSenWorkingHours.setBounds(220,150,250,30);
        
        txtSenContractPeriod = new JTextField();
        Font f42 = new Font("Arial",Font.PLAIN,15);
        txtSenContractPeriod.setFont(f42);
        pnlMain3.add(txtSenContractPeriod);
        txtSenContractPeriod.setBounds(220,250,250,30);
        
        txtSenInterviewerName = new JTextField();
        Font f43 = new Font("Arial",Font.PLAIN,15);
        txtSenInterviewerName.setFont(f43);
        pnlMain3.add(txtSenInterviewerName);
        txtSenInterviewerName.setBounds(220,340,250,30);
        
        txtSenSalary = new JTextField();
        Font f44 = new Font("Arial",Font.PLAIN,15);
        txtSenSalary.setFont(f44);
        pnlMain3.add(txtSenSalary);
        txtSenSalary.setBounds(220,430,250,30);
        
        //pnlMain3 JButton
        btnaddSeniorDeveloper = new JButton("Add");
        Font f45 = new Font("Arial",Font.PLAIN,20);
        btnaddSeniorDeveloper.setFont(f45);
        pnlMain3.add(btnaddSeniorDeveloper);
        btnaddSeniorDeveloper.setBounds(250,520 ,150, 50);
        btnaddSeniorDeveloper.addActionListener(this);
        
        
        //pnlmain4 JPanel
        pnlMain4 = new JPanel();
        pnlMain4.setLayout(null);
        pnlMain4.setBounds(280,10,600,740);
        pnlMain4.setBackground(Color.LIGHT_GRAY);
        pnlMain4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
        frame.add(pnlMain4);
        
        //pnlMain4 JLabel
        lblSenDevName = new JLabel("Developer Name :");
        Font f50 = new Font("Arial",Font.PLAIN,20);
        lblSenDevName.setFont(f50);
        pnlMain4.add(lblSenDevName);
        lblSenDevName.setBounds(20,50,180,50);
        
        lblSenJoiningDate = new JLabel("Joining Date :");
        Font f51 = new Font("Arial",Font.PLAIN,20);
        lblSenJoiningDate.setFont(f51);
        pnlMain4.add(lblSenJoiningDate);
        lblSenJoiningDate.setBounds(20,140,120,50);
        
        lblSenAdvanceSalary = new JLabel("Advance Salary :");
        Font f52 = new Font("Arial",Font.PLAIN,20);
        lblSenAdvanceSalary.setFont(f52);
        pnlMain4.add(lblSenAdvanceSalary);
        lblSenAdvanceSalary.setBounds(20,230,180,50);
        
        lblSenRoomNo = new JLabel("Room No :");
        Font f53 = new Font("Arial",Font.PLAIN,20);
        lblSenRoomNo.setFont(f53);
        pnlMain4.add(lblSenRoomNo);
        lblSenRoomNo.setBounds(20,320,180,50);
        
        lblSenPlatformNo = new JLabel("Platform No :");
        Font f54 = new Font("Arial",Font.PLAIN,20);
        lblSenPlatformNo.setFont(f54);
        pnlMain4.add(lblSenPlatformNo);
        lblSenPlatformNo.setBounds(20,410,180,50);
        
        
        
        //pnlMain4 JPanel JTextField
        txtSenDevName = new JTextField();
        Font f60 = new Font("Arial",Font.PLAIN,15);
        txtSenDevName.setFont(f60);
        pnlMain4.add(txtSenDevName);
        txtSenDevName.setBounds(220,60,250,30);
        
        txtSenJoiningDate = new JTextField();
        Font f61 = new Font("Arial",Font.PLAIN,15);
        txtSenJoiningDate.setFont(f61);
        pnlMain4.add(txtSenJoiningDate);
        txtSenJoiningDate.setBounds(220,150,250,30);
        
        txtSenAdvanceSalary = new JTextField();
        Font f999 = new Font("Arial", Font.PLAIN,15);
        txtSenAdvanceSalary.setFont(f999);
        pnlMain4.add(txtSenAdvanceSalary);
        txtSenAdvanceSalary.setBounds(220,240,250,30);
        
        txtSenRoomNo = new JTextField();
        Font f63 = new Font("Arial",Font.PLAIN,15);
        txtSenRoomNo.setFont(f61);
        pnlMain4.add(txtSenRoomNo);
        txtSenRoomNo.setBounds(220,330,250,30);
        
        txtSenPlatformNo = new JTextField();
        Font f64 = new Font("Arial",Font.PLAIN,15);
        txtSenPlatformNo.setFont(f64);
        pnlMain4.add(txtSenPlatformNo);
        txtSenPlatformNo.setBounds(220,420,250,30);
        
        
        //pnlMain4 JButton
        
        btnhireSeniorDeveloper = new JButton("Hire");
        Font f67 = new Font("Arial",Font.PLAIN,20);
        btnhireSeniorDeveloper.setFont(f67);
        pnlMain4.add(btnhireSeniorDeveloper);
        btnhireSeniorDeveloper.setBounds(100,500,150,50);
        btnhireSeniorDeveloper.addActionListener(this);
        
        btnterminateSeniorDeveloper = new JButton("Terminate");
        Font f68 = new Font("Arial",Font.PLAIN,20);
        btnterminateSeniorDeveloper.setFont(f68);
        pnlMain4.add(btnterminateSeniorDeveloper);
        btnterminateSeniorDeveloper.setBounds(300,500,150,50);
        btnterminateSeniorDeveloper.addActionListener(this);
        
        
        
        
        //JPanel pnlcont
        pnlcont.setLayout(cl);
        pnlcont.setBounds(280,10,600,740); 
        pnlcont.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
        pnlcont.add(pnlMain1, "first");
        pnlcont.add(pnlMain2, "second");
        pnlcont.add(pnlMain3, "Third");
        pnlcont.add(pnlMain4, "Fourth");
        frame.add(pnlcont);
        
       
        //Combo box 
        String staffs[] = {"Add Junior Developer", "Hire Junior Developer","Add Senior Developer","Hire/Terminate Senior Developer"};
        Font f = new Font("Arial", Font.BOLD,18);
        JComboBox combo = new JComboBox(staffs);
        combo.setFont(f);
        combo.setBounds(20,250,220,50);
        pnlButton.add(combo);
        
        combo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(combo.getSelectedItem()=="Add Junior Developer"){

                    cl.show(pnlcont, "first");
                    
                }

                else if(combo.getSelectedItem()=="Hire Junior Developer"){

                   
                    cl.show(pnlcont,"second");

                }
                
                else if(combo.getSelectedItem()=="Add Senior Developer"){

                   
                    cl.show(pnlcont,"Third");

                }
                
                 else if(combo.getSelectedItem()=="Hire/Terminate Senior Developer"){

                   
                    cl.show(pnlcont,"Fourth");

                }
            }
        });
        
        

       


    }
    
     public void actionPerformed(ActionEvent e){
        
            if(e.getSource() == btnClear){
            
                clearAll();
            }
            
            if(e.getSource()==btnaddSeniorDeveloper){
            addToSeniorDeveloper();
        }

       if (e.getSource()== btnaddJuniorDeveloper){
            addToJuniorDeveloper();
        }

        if(e.getSource()==btnhireSeniorDeveloper){
            HireSeniorDeveloper();
        }

        if(e.getSource()==btnhireJuniorDeveloper){
            HireJuniorDeveloper();
        } 

        if(e.getSource()==btnterminateSeniorDeveloper){
            terminate();

        }
        if(e.getSource() == btnDisplay){
            displayAll();
        }
            
        
        }
        
        public void clearAll() {

        txtPlatform.setText("");
        txtAppointedBy.setText("");
        txtInterviewerName.setText("");
        txtTerminationDate.setText("");
        txtWorkingHours.setText("");
        txtSalary.setText("");
        txtDevName.setText("");
        txtJoiningDate.setText("");
        txtSpecialization.setText("");
        txtTerminateDate.setText("");
        txtSenPlatform.setText("");
        txtSenWorkingHours.setText("");
        txtSenContractPeriod.setText("");
        txtSenInterviewerName.setText("");
        txtSenSalary.setText("");
        txtSenName.setText("");
        txtSenJoiningDate.setText("");
        txtSenDevName.setText("");
        txtSenRoomNo.setText("");
        txtSenPlatformNo.setText("");
        txtSenAdvanceSalary.setText("");
        
      
    }
    
    public void addToSeniorDeveloper(){
    
        
        try{
                String SPlatform = txtSenPlatform.getText();
                String SWorkingHour = txtSenWorkingHours.getText();
                String SSalary = txtSenSalary.getText();
                String SContractPeriod = txtSenContractPeriod.getText();
                String SInterviewerName = txtSenInterviewerName.getText();
                
           
            if(SPlatform.equals("") || SInterviewerName.equals("") || SWorkingHour.equals("") || SSalary.equals("") || SContractPeriod.equals("")){
                JOptionPane.showMessageDialog(pnlcont,"Don't leave the field empty","Error",JOptionPane.ERROR_MESSAGE);
                
            } else { 
            
                int Working_hour = Integer.parseInt(SWorkingHour);
                int Salary_Senior = Integer.parseInt(SSalary);
                int Contract_Period = Integer.parseInt(SContractPeriod);
                
                SeniorDeveloper SDev = new SeniorDeveloper(SPlatform,SInterviewerName,Working_hour,Salary_Senior,Contract_Period);
                list.add(SDev);
                JOptionPane.showMessageDialog(pnlcont,"Successful");
            
            
            }
            
           
        }  catch (Exception c){
            System.out.println("Exception thrown:"+ c);
            JOptionPane.showMessageDialog(pnlcont,"Some error Occured"+ c.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    
    } 
    
  public void addToJuniorDeveloper(){
    
        try{
            
           String JPlatform = txtPlatform.getText();
           String JInterviewerName = txtInterviewerName.getText();
           String JWorkingHours = txtWorkingHours.getText();
           String JSalary = txtSalary.getText();
           String JAppointedBy = txtAppointedBy.getText();
           String JTerminateDate = txtTerminationDate.getText();
           
           
           
           if(JPlatform.isEmpty() || JInterviewerName.isEmpty() || JWorkingHours.isEmpty() || JAppointedBy.isEmpty() || JTerminateDate.isEmpty() || JSalary.isEmpty()){
               JOptionPane.showMessageDialog(pnlMain1,"Don't leave the field empty","Error",JOptionPane.ERROR_MESSAGE);
               
            }else {
            
                int Working_Hours = Integer.parseInt(JWorkingHours);
                int Salary_Junior = Integer.parseInt(JSalary);
                JuniorDeveloper JDev = new JuniorDeveloper(JPlatform, JInterviewerName, Working_Hours, Salary_Junior, JAppointedBy, JTerminateDate);
                list.add(JDev);
                JOptionPane.showMessageDialog(pnlMain1,"Successfull ");
            }
            
        }  catch (NullPointerException c) {
            System.out.println("Exception thrown: " + c);
            JOptionPane.showMessageDialog(pnlcont, "Some error Occured", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (NumberFormatException c) {
            System.out.println("Exception thrown: " + c);
            JOptionPane.showMessageDialog(pnlcont, "Some error occured", "Error", JOptionPane.ERROR_MESSAGE);

            JOptionPane.showMessageDialog(pnlcont, "Error"+c , "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException c) {
            System.out.println("Exception thrown: " + c);
            JOptionPane.showMessageDialog(pnlcont, "Some error Occured", "Error", JOptionPane.ERROR_MESSAGE);

        }
        catch (Exception c){
        
            JOptionPane.showMessageDialog(pnlcont,"Some error Occured","Error",JOptionPane.ERROR_MESSAGE); 
        }
    
    
    }
    
    public void HireSeniorDeveloper(){
    
        try{
        
            String HDevName = txtSenDevName.getText();
            int HPlatformNo = Integer.parseInt(txtSenPlatformNo.getText());
            String HJoiningDate = txtSenJoiningDate.getText();
            String HRoomNo = txtSenRoomNo.getText();
            int HSalary = Integer.parseInt(txtSenAdvanceSalary.getText());
            int i = HPlatformNo - 1;
            
  
            if(list.get(i) instanceof SeniorDeveloper){
                SeniorDeveloper SD = (SeniorDeveloper) list.get(i);
                SD.hireDeveloper(HDevName, HJoiningDate, HSalary, HRoomNo);
                
                if(SD.getAppointed()){
                    JOptionPane.showMessageDialog(pnlcont,"The Senior Developer has succesfully been hired.");
            }
            else{
                JOptionPane.showMessageDialog(pnlcont,"The Senior Developer has not been hired.");
            }
        }
            else
            {
            
                JOptionPane.showMessageDialog(pnlcont,"Senior Developer not found");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }catch (NumberFormatException e) {
            System.out.println("Exception thrown:"+ e);
        }catch (Exception e){
            JOptionPane.showMessageDialog(pnlcont,"Some error occured");
        }
    
    }
    
    public void terminate(){
    
        try{
            String number = txtSenPlatformNo.getText();
            int PNumberOne = Integer.parseInt(number);
            int PNumber = PNumberOne - 1;
            if(txtSenPlatformNo.getText().isEmpty()){
                JOptionPane.showMessageDialog(pnlcont, "Dont leave the field empty");
    }
    else{
        
        if(PNumber>= 0 && PNumber<list.size()){
            
                if(list.get(PNumber) instanceof SeniorDeveloper){
                    SeniorDeveloper SDev = (SeniorDeveloper) list.get(PNumber);
                    
                if(SDev.getTerminated()){
                    
                    JOptionPane.showMessageDialog(pnlcont,"Senior Developer has been terminated");
                }
                else if(!SDev.getTerminated()){
                    SDev.termination();
                    JOptionPane.showMessageDialog(pnlcont, "Senior Developer successfuly terminated");
                    
                }
            }
                else {
                    JOptionPane.showMessageDialog(pnlcont,"Not Senior Developer");
                }
            
            
           
        }
        else {
            JOptionPane.showMessageDialog(pnlcont, "Wrong Platform No");
        }
    }
}

catch(Exception e){
    JOptionPane.showMessageDialog(pnlcont,"Some error occured");
    
   }
}

public void HireJuniorDeveloper(){
        
    try{
        String JDeveloperName = txtDevName.getText();
        String JSpecialization = txtSpecialization.getText();
        String JoinDate = txtJoiningDate.getText();
        String JTerminateDate = txtTerminateDate.getText();
        int JPlatformNo = Integer.parseInt(txtPlatformNo.getText());
        int i = JPlatformNo -1;
        
        if (list.get(i) instanceof JuniorDeveloper){
            JuniorDeveloper JD = (JuniorDeveloper) list.get(i);
            JD.appointDeveloper(JDeveloperName,JoinDate,JTerminateDate,JSpecialization);
            
            if(JD.getJoined()){
                JOptionPane.showMessageDialog(pnlcont, "The Junior Developer has successfully been hired.");
            }
            else{
                JOptionPane.showMessageDialog(pnlcont,"The junior developer has not been hired");
            }
        }
        else{
            JOptionPane.showMessageDialog(pnlcont,"The developer is not a junior developer");
        }
        
}catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }catch (NumberFormatException e) {
            System.out.println("Exception thrown: " + e);
        }catch (ArithmeticException e){
            System.out.println("Exception thrown: " + e);
        }catch (NullPointerException e){
            System.out.println("Exception thrown: "+ e);
        }catch (Exception e){
           JOptionPane.showMessageDialog(pnlcont, "Some error occured");
        }
    
    }
    
    public void displayAll(){
        if(list.size()>=0){
            for(Developer obj1: list){
                if(obj1 instanceof SeniorDeveloper){
                    SeniorDeveloper obj2 = (SeniorDeveloper) obj1;
                    obj2.display();
                }
                if (obj1 instanceof JuniorDeveloper){
                    JuniorDeveloper obj2 = (JuniorDeveloper)obj1;
                    obj2.display();
                }
            }
        }else{
            JOptionPane.showMessageDialog(pnlcont,"There are no inforamation to display");
        }
    }
   
        
    public static void main(String []args){
        new RigoTechnology().gui();
    }
}