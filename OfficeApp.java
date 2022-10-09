import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JOptionPane;

public class OfficeApp extends JFrame {

    static String Namesend=null;
    static String IDsend=null;
    static Double Salarysend;
    static String Titlesend=null;
    static Double Salessend;
    static String OfficeNosend=null;
    static String popup;
    static String TeamNamesend;
    static HighRankStaff test1;
    static LowRankStaff test2;
    

  //CONSTRUCTOR
    public OfficeApp() {
        initComponents();
    }

    //@SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new JLabel();
        Name = new JLabel();
        NameText = new JTextField();
        ID = new JLabel();
        IDText = new JTextField();
        Salary = new JLabel();
        SalaryText = new JTextField("0");
        Title = new JLabel();
        TitleBox = new JComboBox<>();
        OfficeNoSalesTeamName = new JComboBox<>();
        SalesText = new JTextField("0");
        SubmitBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Office Management System");

        jLabel1.setFont(new Font("sansserif", 1, 14)); 
        jLabel1.setText("Office Management System");

        //ACTIONLISTENERS AND KEYLISTENERS
        //Textfield fro name
        Name.setText("Name");
        NameText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               
            }
        }
        );
        NameText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                NameTextKeyPressed(evt);
            }
        }
        );

        //TextField for ID
        ID.setText("ID");
        IDText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        }
        );
        IDText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                IDTextKeyPressed(evt);      
            }
        }
        );

        //TextField for Salary
        Salary.setText("Salary (RM)");
        SalaryText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
             
            }
        }
        );
        SalaryText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                SalaryTextKeyPressed(evt);      
            }
        }
        );

        //CheckBox for Titles
        Title.setText("Title");
        TitleBox.setModel(new DefaultComboBoxModel<>(new String[] {"--SELECT--" ,"Chief Executive Officer", "Chief Financial Officer", "System Administrator", "Sales Consultant" }));
        
                
        
        TitleBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        }
        );
        
        //CheckBox for selecting OfficeNo/Total Sales/Team Name based on their titles
        OfficeNoSalesTeamName.setEditable(false);
        OfficeNoSalesTeamName.setEnabled(false);
        OfficeNoSalesTeamName.setModel(new DefaultComboBoxModel<>(new String[] { "--SELECT--","Office No.", "Team Name", "Total Sales" }));
        OfficeNoSalesTeamName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                OfficeNoSalesTeamNameActionPerformed(evt);
            }
        }
        );

        //TextField for Sales
        SalesText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SalesTextActionPerformed(evt);
            }
        }
        );
        SalesText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                SalesTextKeyPressed(evt);      
            }
        }
        );

        //Button for Submit
        SubmitBtn.setText("SUBMIT");
        SubmitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        }
        );

        
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(SubmitBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(Name, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Salary, GroupLayout.Alignment.LEADING))
                                                        .addComponent(Title, GroupLayout.PREFERRED_SIZE, 41,GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(OfficeNoSalesTeamName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(NameText, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                        .addComponent(IDText)
                                                        .addComponent(SalaryText, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                        .addComponent(SalesText, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                        .addComponent(TitleBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(jLabel1)))
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(NameText, GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ID)
                                        .addComponent(IDText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(SalaryText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Salary))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Title)
                                        .addComponent(TitleBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(OfficeNoSalesTeamName, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SalesText, GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(SubmitBtn)
                                .addGap(27, 27, 27))
        );
        pack();
    }

    
    private void NameTextActionPerformed(ActionEvent evt) {
        
    }
    
    //To adjust the cursor focus to next Text Field
    public void NameTextKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                IDText.requestFocus();
    }
    

    private void SubmitBtnActionPerformed(ActionEvent evt) {
        
        
        
        if (evt.getSource()==SubmitBtn){
         
                Namesend=NameText.getText();
                IDsend= IDText.getText();
                Salarysend=Double.parseDouble(SalaryText.getText());
                
                
                if (TitleBox.getSelectedIndex() == 1 || TitleBox.getSelectedIndex() == 2) {
                    OfficeNoSalesTeamName.setSelectedIndex(1);
                } 
                else if (TitleBox.getSelectedIndex() == 3) {
                     OfficeNoSalesTeamName.setSelectedIndex(2);
                } else if (TitleBox.getSelectedIndex() == 4) {
                      OfficeNoSalesTeamName.setSelectedIndex(3);
                }
                
                
                
                if(SalaryText.getText().isEmpty()){
                    Salarysend=0.00;
                }
                
                if (OfficeNoSalesTeamName.getSelectedIndex()==1){
            
                    OfficeNosend=SalesText.getText();
                }
                else if(OfficeNoSalesTeamName.getSelectedIndex()==2){
                    TeamNamesend=SalesText.getText();
                }
                else if (OfficeNoSalesTeamName.getSelectedIndex()==3){
                    Salessend=Double.parseDouble(SalesText.getText());
                }
                
                Titlesend=String.valueOf(TitleBox.getSelectedItem());
                
            
                
                
            
        //ERROR MESSAGE
            if(NameText.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Please enter your Name","Error", JOptionPane.ERROR_MESSAGE);
             }
             if(IDText.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Please enter your ID","Error", JOptionPane.ERROR_MESSAGE);
             }
             
             if(SalaryText.getText().isBlank()||SalaryText.getText().equals(0)){
                 JOptionPane.showMessageDialog(null, "Please enter your Salary","Error", JOptionPane.ERROR_MESSAGE);
             }
        
             if(TitleBox.getSelectedIndex()==0){
                 JOptionPane.showMessageDialog(null, "Please select your Title","Error", JOptionPane.ERROR_MESSAGE);
             }
             
             
             if(SalesText.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Please enter your OfficeNo/Sales/TeamName Info" +"\n" + "CEO/CFO = OfficeNo"+"\n"+"System Admin = Team Name"+"\n"+"Sales Consultant = Total Sales","Error", JOptionPane.ERROR_MESSAGE);
             }
             
        ///
            
            
            if(TitleBox.getSelectedIndex()==1 || TitleBox.getSelectedIndex()==2){
                HighRankStaff  test1 = new HighRankStaff(Namesend, IDsend , Titlesend, Salarysend, OfficeNosend);
                test1.displayInfo();
                System.out.println();
            }

            else if (TitleBox.getSelectedIndex()==3){
                LowRankStaff test2 = new TechDepartment(Namesend, IDsend, Titlesend, Salarysend, TeamNamesend);
                test2.displayInfo();
                 System.out.println();
            }

            else if (TitleBox.getSelectedIndex()==4){
                test2 = new SalesDepartment(Namesend, IDsend, Titlesend, Salarysend, Salessend);
                test2.displayInfo();
                System.out.println();
            }
        }
    }

    
    private void IDTextActionPerformed(ActionEvent evt) {
        
    }

     public void IDTextKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                SalaryText.requestFocus();
    }
     
     
    private void SalaryTextActionPerformed(ActionEvent evt) {                                           

    }
    
     public void SalaryTextKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                SalesText.requestFocus();
    }

     
    private void SalesTextActionPerformed(ActionEvent evt) {                                          

        
    }
    
    public void SalesTextKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                    NameText.requestFocus();
    }
    
    
    
    public void TitleBoxKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                SalaryText.requestFocus();
    }

    
    private void TitleBoxActionPerformed(ActionEvent evt) {   
              
    }

    
    private void OfficeNoSalesTeamNameActionPerformed(ActionEvent evt) {                                                      

       // OfficeNoSalesTeamName.setEnabled(true);
        
    }

    
    
    // Variables declaration 
    private JLabel ID;
    private JTextField IDText;
    private JLabel Name;
    private JTextField NameText;
    private JComboBox<String> OfficeNoSalesTeamName;
    private JLabel Salary;
    private JTextField SalaryText;
    private JTextField SalesText;
    private JButton SubmitBtn;
    private JLabel Title;
    private JComboBox<String> TitleBox;
    private JLabel jLabel1;
    


    public static void main(String args[]) {
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficeApp().setVisible(true);
            }
        }
        );
    }
}