import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.*;
import javax.swing.*;
public class PharmacyManagement {
    public static void main(String[] args) {
        Login login=new Login();
        login.setVisible(true);
    }    
}
class Login extends JFrame implements ActionListener
{
   JLabel label1,label2;
   JButton submit;
   JTextField text1,text2; 
   Login()
   {
       JFrame f=new JFrame();
       f.setLayout(null);
       f.setVisible(true);
       f.setSize(500,500);
       f.getContentPane().setBackground(new Color(173,216,230));
       label1=new JLabel();
       label1.setText("USERNAME");
       label1.setBounds(50,50,100,50);
       text1=new JTextField(15);
       text1.setBounds(175,50,250,50);
       label2=new JLabel();
       label2.setText("PASSWORD");
       label2.setBounds(50,150,100,50);
        text2=new JPasswordField(15);
       text2.setBounds(175,150,250,50);
       submit=new JButton("SUBMIT");
       submit.setBounds(175,250,100,50);
       f.add(label1); f.add(label2);
       f.add(text1);  f.add(text2);
       f.add(submit);
       f.setTitle("LOGIN");
       submit.addActionListener(this);     
       f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent ae)
   {
       String name=new String();
       name=text1.getText();
       String pass=new String();
       pass=text2.getText();
       if(name.trim().equals("user001")&&pass.trim().equals("123"))
       {
           PersonalDetails pd=new PersonalDetails();
           pd.setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
       }}
}
class PersonalDetails extends JFrame implements ActionListener
{
    JLabel label1,label2,label3,label4,label5,label6;
    JTextField text1,text2,text3,text5;
    JTextArea area;
    JRadioButton rb1,rb2;
    JButton next;    
    PersonalDetails()
    {
        JFrame f=new JFrame();
        f.setSize(500,600);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(new Color(173,216,230));
        f.setTitle("PERSONAL DETAILS");
         label1=new JLabel();
       label1.setText("NAME");
       label1.setBounds(50,50,100,50);
        text1=new JTextField();
       text1.setBounds(175,50,200,50);
        label2=new JLabel();
       label2.setText("AGE");
       label2.setBounds(50,120,100,50);
       text2=new JTextField();
       text2.setBounds(175,120,200,50);
       label3=new JLabel();
       label3.setText("DOB");
       label3.setBounds(50,190,100,50);
        text3=new JTextField();
       text3.setBounds(175,190,200,50);
       label4=new JLabel();
       label4.setText("GENDER");
       label4.setBounds(50,260,100,50);
       rb1=new JRadioButton("MALE");
       rb1.setBounds(175,260,100,50);
        rb2=new JRadioButton("FEMALE");
       rb2.setBounds(275,260,100,50);
       rb1.setBackground(new Color(173,216,230));
       rb2.setBackground(new Color(173,216,230));
       ButtonGroup bg= new ButtonGroup();
       bg.add(rb1);bg.add(rb2);
        label5=new JLabel();
       label5.setText("BLOOD GROUP");
       label5.setBounds(50,330,100,50);
        text5=new JTextField();
       text5.setBounds(175,330,200,50);
       label6=new JLabel("ADDRESS");
       label6.setBounds(50,400,100,50);
        area= new JTextArea();
       area.setBounds(175,400,200,80);
      next=new JButton("NEXT");
       next.setBounds(150,500,100,45);
       f.add(label1);f.add(text1);f.add(label2);f.add(text2);
       f.add(label3);f.add(text3);f.add(label4);
       f.add(label5);f.add(text5);f.add(label6);
       f.add(next);f.add(area);f.add(rb1);f.add(rb2);       
       next.addActionListener(this);
      f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {  
        String name=text1.getText();
        String age=text2.getText();
        String dob=text3.getText();
        String bloodgrp=text5.getText();
        String ad=area.getText();     
        if(next.isEnabled())
        {
            Complication comp= new Complication();
            comp.setVisible(true);  
        }}
}
    class Complication extends JFrame implements ItemListener
 {
     JCheckBox c1,c2,c3,c4;
     JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
     Complication()
    {
    JFrame f=new JFrame();
    f.setSize(700, 1000);
    f.setVisible(true);
    f.setLayout(null);
    f.getContentPane().setBackground(new Color(173,216,230));
    f.setTitle("MEDICAL MANAGEMENT SYSTEM");
     c1=new JCheckBox("FLU");
     c1.setBackground(new Color(173,216,230));
     c2=new JCheckBox("COLD AND COUGH");
     c2.setBackground(new Color(173,216,230));
    c3=new JCheckBox("STOMACH FLU");
    c3.setBackground(new Color(173,216,230));
      c4=new JCheckBox("ENT INFECTIONS");
      c4.setBackground(new Color(173,216,230));
     c1.setBounds(50,40,200,50);
     c2.setBounds(50,80,200,50);
     c3.setBounds(50,120,200,50);
     c4.setBounds(50,160,200,50);
   c1.addItemListener(this); c2.addItemListener(this);
   c3.addItemListener(this); c4.addItemListener(this);
     ButtonGroup b=new ButtonGroup();
     b.add(c1);  b.add(c2);
     b.add(c3); b.add(c4);
     f.add(c4);f.add(c3);f.add(c2); f.add(c1);
    JLabel label1=new JLabel();
    label1.setText("WHAT SORT OF COMPLICATION DO YOU HAVE?");
    Font font= new Font("Arial",BOLD,17);
    label1.setFont(font);
    label1.setBounds(50,8,500,50);     
    f.add(label1);  
    f.setVisible(true);
    JLabel label6=new JLabel();
    label6.setText("PLEASE SELECT (YES/NO) TO PROCEED FURTHER");
    label6.setBounds(50,200,800,50);
    Font fo=new Font("Arial",BOLD,18);
    label6.setFont(fo);
    label6.setForeground(Color.red);
    JLabel label2=new JLabel();
    label2.setText("1)ARE YOU A DIABETIC PATIENT?");
    label2.setBounds(50,240,300,50);
    label2.setFont(font);
    rb1=new JRadioButton();
    rb1.setText("YES");
    rb1.setFont(font);
    rb1.setBounds(100,280,100,50);
    ButtonGroup bg=new ButtonGroup();
    bg.add(rb1);
   rb2=new JRadioButton();
    rb2.setText("NO");
    rb2.setFont(font);
    rb2.setBounds(200,280,100,50);
    bg.add(rb2);
    JLabel label3=new JLabel();
    label3.setText("2)DO YOU SUFFER FROM LOW/HIGH BLOOD PRESSURE?");
    label3.setBounds(50,320,500,50);
    label3.setFont(font);
    rb3=new JRadioButton();
    rb3.setText("YES");
    rb3.setFont(font);
    rb3.setBounds(100,360,100,50);
     rb4=new JRadioButton();
    rb4.setText("NO");
    rb4.setFont(font);
    rb4.setBounds(200,360,100,50);
    ButtonGroup bg1=new ButtonGroup();
    bg1.add(rb3);
    bg1.add(rb4);
     JLabel label4=new JLabel();
    label4.setText("3)ARE YOU A ALCOHOL/DRUG ADDICT?");
    label4.setBounds(50,410,500,50);
    label4.setFont(font);
    rb5=new JRadioButton();
    rb5.setText("YES");
    rb5.setFont(font);
    rb5.setBounds(100,450,100,50);
    rb6=new JRadioButton();
    rb6.setText("NO");
    rb6.setFont(font);
    rb6.setBounds(200,450,100,50);
    ButtonGroup bg2=new ButtonGroup();
    bg2.add(rb5);
    bg2.add(rb6);
    JLabel label5=new JLabel();
    label5.setText("4)ARE YOU ALLERGIC TO ANYTHING? IF SO MENTION BELOW");
    label5.setBounds(50,490,500,50);
    label5.setFont(font);
    rb7=new JRadioButton();
    rb7.setText("YES");
    rb7.setFont(font);
    rb7.setBounds(100,530,100,50);
    rb8=new JRadioButton();
    rb8.setText("NO");
    rb8.setFont(font);
    rb8.setBounds(200,530,100,50);
    ButtonGroup bg3=new ButtonGroup();
    bg3.add(rb7);
    bg3.add(rb8);
    JTextField text=new JTextField();
    text.getText();
    text.setBounds(50,580,300,50);
   f.add(label2);f.add(label3);
    f.add(label4);
    f.add(rb1);  f.add(rb2); f.add(rb3); f.add(rb4);
    f.add(rb5); f.add(rb6); f.add(label5); f.add(rb7);
    f.add(rb8); f.add(text); f.add(label6);
    rb1.addItemListener(this); rb2.addItemListener(this);
    rb3.addItemListener(this);rb4.addItemListener(this);
    rb5.addItemListener(this); rb6.addItemListener(this);
    rb7.addItemListener(this); rb8.addItemListener(this);
    rb1.setBackground(new Color(173,216,230));rb2.setBackground(new Color(173,216,230));
    rb3.setBackground(new Color(173,216,230));rb4.setBackground(new Color(173,216,230));
     rb5.setBackground(new Color(173,216,230));rb6.setBackground(new Color(173,216,230));
     rb7.setBackground(new Color(173,216,230));rb8.setBackground(new Color(173,216,230));
     f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
     }
public void itemStateChanged(ItemEvent ie)
{
if((c1.isSelected())&&((rb1.isSelected()||rb2.isSelected())&&(rb3.isSelected()||rb4.isSelected())&&(rb5.isSelected()||rb6.isSelected())&&(rb7.isSelected()||rb8.isSelected())))
   {
       Flu flu=new Flu();
       flu.setVisible(true);
    }
    else if((c2.isSelected())&&((rb1.isSelected()||rb2.isSelected())&&(rb3.isSelected()||rb4.isSelected())&&(rb5.isSelected()||rb6.isSelected())&&(rb7.isSelected()||rb8.isSelected())))
   {
       ColdCough cc= new ColdCough();
       cc.setVisible(true);
   }
    else if((c3.isSelected())&&((rb1.isSelected()||rb2.isSelected())&&(rb3.isSelected()||rb4.isSelected())&&(rb5.isSelected()||rb6.isSelected())&&(rb7.isSelected()||rb8.isSelected())))
   {
       StomachFlu sf= new StomachFlu();
       sf.setVisible(true);
   }
    else if((c4.isSelected())&&((rb1.isSelected()||rb2.isSelected())&&(rb3.isSelected()||rb4.isSelected())&&(rb5.isSelected()||rb6.isSelected())&&(rb7.isSelected()||rb8.isSelected())))
   {
       Ent ent= new Ent();
       ent.setVisible(true);}
}}
class Flu extends JFrame implements ActionListener
{ 
    JButton ok;
    Flu()
    {
        JFrame f= new JFrame();
        f.getContentPane().setBackground(new Color(173,216,230));
        f.setTitle("MEDICINES AND DOCTOR INFO");
        String tablets[][]={{"1","Paracetamol","100mg","500/650mg"},{"2","Nurofen","5mg","200mg"},{"3","Benylin","20mg","250mg"}};
        String column[]={"S.NO","TABLET NAME","DOSAGE(for children)","DOSAGE(for adults)"};
        JTable jt= new JTable(tablets,column);
        String doctors[][]={{"1","Dr.R.Rajesh","9:00am to 6:30pm","9832586572"},{"2","Dr.R.Sridevi","10:00am to7:00pm","9823456876"}};
        String col1[]={"S.NO","DOCTOR NAME","AVAILABLE HOURS","CONTACT NO."};
        JTable jt1=new JTable(doctors,col1);
        Container c=f.getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
        c.add(jt.getTableHeader());
        c.add(jt);
        c.add(jt1.getTableHeader());
        c.add(jt1);
        f.pack();
         ok=new JButton("OK");
          ok.addActionListener(this);
        f.add(ok,BorderLayout.CENTER);
        f.setSize(700,200);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ok.isEnabled())
           JOptionPane.showMessageDialog(null,"HOPE YOU GET WELL SOON!"); 
    }
    }
class ColdCough extends JFrame implements ActionListener
{ 
    JButton ok;
    ColdCough()
    {
        JFrame f= new JFrame();
        f.getContentPane().setBackground(new Color(173,216,230));
        f.setTitle("MEDICINES AND DOCTOR INFO");
        String tablets[][]={{"1","Cipro","100mg","500/650mg"},{"2","Nyquil","5mg","200mg"},{"3","Coldrex","20mg","250mg"}};
        String column[]={"S.NO","TABLET NAME","DOSAGE(for children)","DOSAGE(for adults)"};
        JTable jt= new JTable(tablets,column);
        String doctors[][]={{"1","Dr.A.Riya","9:00am to 6:30pm","9832586572"},{"2","Dr.R.Meena","10:00am to7:00pm","9823456876"}};
        String col1[]={"S.NO","DOCTOR NAME","AVAILABLE HOURS","CONTACT NO."};
        JTable jt1=new JTable(doctors,col1);
        Container c=f.getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
        c.add(jt.getTableHeader());
        c.add(jt);
        c.add(jt1.getTableHeader());
        c.add(jt1);
        f.pack();
        ok=new JButton("OK");
        ok.addActionListener(this);
        f.add(ok,BorderLayout.CENTER);
        f.setSize(700,200);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);   
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ok.isEnabled())
           JOptionPane.showMessageDialog(null,"HOPE YOU GET WELL SOON!"); 
    }   
    }
     class StomachFlu extends JFrame implements ActionListener
{ 
    JButton ok;
    StomachFlu()
    {
        JFrame f= new JFrame();
        f.setTitle("MEDICINES AND DOCTOR INFO");
        f.getContentPane().setBackground(new Color(173,216,230));
        String tablets[][]={{"1","Nauzene","118ml","250ml"},{"2","Zofran","5mg","200mg"},{"3","Vibramycin","20mg","250mg"}};
        String column[]={"S.NO","TABLET NAME","DOSAGE(for children)","DOSAGE(for adults)"};
        JTable jt= new JTable(tablets,column);
        String doctors[][]={{"1","Dr.C.Nivi","9:00am to 6:30pm","9832586572"},{"2","Dr.S.Parkavi","10:00am to7:00pm","9823456876"}};
        String col1[]={"S.NO","DOCTOR NAME","AVAILABLE HOURS","CONTACT NO."};
        JTable jt1=new JTable(doctors,col1);
        Container c=f.getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
        c.add(jt.getTableHeader());
        c.add(jt);
        c.add(jt1.getTableHeader());
        c.add(jt1);
        f.pack();
         ok=new JButton("OK");
        ok.addActionListener(this);
        f.add(ok,BorderLayout.CENTER);
        f.setSize(700,200);
        f.setVisible(true);
        f.setLayout(null);
  f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ok.isEnabled())
           JOptionPane.showMessageDialog(null,"HOPE YOU GET WELL SOON!"); 
    }}  
     class Ent extends JFrame implements ActionListener
{ 
    JButton ok;
    Ent()
    {
        JFrame f= new JFrame();
        f.getContentPane().setBackground(new Color(173,216,230));
        f.setTitle("MEDICINES AND DOCTOR INFO");
        String tablets[][]={{"1","Tylenol","100mg","500mg"},{"2","Advil","5mg","200mg"},{"3","Phexin","100mg","250/500mg"}};
        String column[]={"S.NO","TABLET NAME","DOSAGE(for children)","DOSAGE(for adults)"};
        JTable jt= new JTable(tablets,column);
        String doctors[][]={{"1","Dr.K.Ayush","9:00am to 6:30pm","9832586572"},{"2","Dr.R.Riza","10:00am to7:00pm","9823456876"}};
        String col1[]={"S.NO","DOCTOR NAME","AVAILABLE HOURS","CONTACT NO."};
        JTable jt1=new JTable(doctors,col1);
        Container c=f.getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
        c.add(jt.getTableHeader());
        c.add(jt);
        c.add(jt1.getTableHeader());
        c.add(jt1);
        f.pack();
        ok=new JButton("OK");
        ok.addActionListener(this);
        f.add(ok,BorderLayout.CENTER);
        f.setSize(700,200);
        f.setVisible(true);
        f.setLayout(null);
  f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ok.isEnabled())
           JOptionPane.showMessageDialog(null,"HOPE YOU GET WELL SOON!"); 
    }   
     }
