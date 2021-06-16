import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class INGNepal{
    
    private JFrame frame;
    private JTextField ftVacancyNum, ftDesignation, ftWorkingHPD, ftVacancyNum1, ftStaffName, ftJoiningDate, ftJobType, ftSalary, ftQualification, ftAppointedBy, ptVacancyNum, ptDesignation, ptWorkingHPD, ptVacancyNum1, ptStaffName, ptJoiningDate, ptJobType, ptShifts, ptWagesPH, ptQualification, ptAppointedBy, ptExterminate;
    private JButton ftAdd, ftAppoint, ftDisplay, ftClear,ptAdd, ptAppoint, ptDisplay, ptClear, Exterminate;
    // staffHire arraylist is created so that the information of the staff can be stored in the list.
    ArrayList <StaffHire> staffHire = new ArrayList <StaffHire>();
    // constructor
    public INGNepal(){
        initializeFrame();
        initializeBody();
    }
    
    // initializeFrame method contains things like frame name,size, layout, etc. 
    public void initializeFrame(){
        frame = new JFrame("window");
        frame.setBounds(0,0,1650,1080);
        frame.setLayout(null);
        //DISPONSE_ON_CLOSE since we don't have to stop application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void initializeBody(){
        
        JLabel fth = new JLabel("FULL TIME STAFF HIRE");
        fth.setBounds(368,10,180,20);
        frame.add(fth);     
        
        JLabel VN = new JLabel("Vacancy Number");
        VN.setBounds(20,50,100,20);
        frame.add(VN);
        
        JLabel dgn = new JLabel("Designation");
        dgn.setBounds(20,100,100,20);
        frame.add(dgn);
        
        JLabel whp = new JLabel("Working Hour Per Day");
        whp.setBounds(20,150,150,20);
        frame.add(whp);
        
        JLabel vn = new JLabel("Vacancy Number");
        vn.setBounds(20,250,100,20);
        frame.add(vn);
        
        JLabel sn = new JLabel("Staff Name");
        sn.setBounds(20,300,100,20);
        frame.add(sn);
        
        JLabel jd = new JLabel("Joining Date");
        jd.setBounds(20,350,100,20);
        frame.add(jd);
        
        JLabel jt = new JLabel("Job Type");
        jt.setBounds(410,50,100,20);
        frame.add(jt);
        
        JLabel sly = new JLabel("Salary");
        sly.setBounds(410,100,80,20);
        frame.add(sly);
        
        JLabel qlf = new JLabel("Qualification");
        qlf.setBounds(410,250,80,20);
        frame.add(qlf);
        
        JLabel aptBy = new JLabel("AppointedBy");
        aptBy.setBounds(410,300,80,20);
        frame.add(aptBy);
        
        ftVacancyNum = new JTextField();
        ftVacancyNum.setBounds(160,50,200,20);
        frame.add(ftVacancyNum);
        
        ftDesignation = new JTextField();
        ftDesignation.setBounds(160,100,200,20);
        frame.add(ftDesignation);
        
        ftWorkingHPD = new JTextField();
        ftWorkingHPD.setBounds(160,150,200,20);
        frame.add(ftWorkingHPD);
        
        ftVacancyNum1 = new JTextField();
        ftVacancyNum1.setBounds(160,250,200,20);
        frame.add(ftVacancyNum1);
        
        ftStaffName = new JTextField();
        ftStaffName.setBounds(160,300,200,20);
        frame.add(ftStaffName);
        
        ftJoiningDate = new JTextField();
        ftJoiningDate.setBounds(160,350,200,20);
        frame.add(ftJoiningDate);
        
        ftJobType = new JTextField();
        ftJobType.setBounds(510,50,200,20);
        frame.add(ftJobType);
        
        ftSalary = new JTextField();
        ftSalary.setBounds(510,100,200,20);
        frame.add(ftSalary);
        
        ftQualification = new JTextField();
        ftQualification.setBounds(510,250,200,20);
        frame.add(ftQualification);
        
        ftAppointedBy = new JTextField();
        ftAppointedBy.setBounds(510,300,200,20);
        frame.add(ftAppointedBy);
        
        // JButton in full time staff hire
        
        ftAdd = new JButton("Add");
        ftAdd.setBounds(550,150,120,50);
        frame.add(ftAdd);
        // action listener is used in Add button so that operation can be performed after user clicks the Add button
        ftAdd.addActionListener(new ActionListener() {                
             public void actionPerformed(ActionEvent ae) {                    
                 ftAdd();                
                };          
            }); 
        
        ftAppoint = new JButton("Appoint");
        ftAppoint.setBounds(550,350,120,50);
        frame.add(ftAppoint);
        // action listener is used in Appoint button so that operation can be performed after user clicks the Appoint button
        ftAppoint.addActionListener(new ActionListener() {                
             public void actionPerformed(ActionEvent ae) {                    
                 ftAppoint();                
                };          
            }); 
        
        //// action listener is used in clear button so that operation can be performed after user clicks the clear button
        ftClear = new JButton("Clear");
        ftClear.setBounds(550,410,120,50);
        frame.add(ftClear);
         ftClear.addActionListener(new ActionListener() {                
             public void actionPerformed(ActionEvent ae) {                    
                 ftclear();                
                };          
            }); 
        ftDisplay = new JButton("Display");
        ftDisplay.setBounds(200,410,120,50);
        frame.add(ftDisplay);
        // action listener is used in Display button so that operation can be performed after user clicks the Dispaly button
        ftDisplay.addActionListener(new ActionListener() {                
             public void actionPerformed(ActionEvent ae) {                    
                 ftDisplay();                
                };          
            });
        
        // part time staff hire
        
        JLabel pth = new JLabel("PART TIME STAFF HIRE");
        pth.setBounds(1150,10,180,20);
        frame.add(pth);
        
        JLabel ptVN = new JLabel("Vacancy Number");
        ptVN.setBounds(800,50,100,20);
        frame.add(ptVN);
        
        JLabel ptdgn = new JLabel("Designation");
        ptdgn.setBounds(800,100,100,20);
        frame.add(ptdgn);
        
        JLabel ptwhp = new JLabel("Working Hour Per Day");
        ptwhp.setBounds(800,150,150,20);
        frame.add(ptwhp);
        
        JLabel ptvn = new JLabel("Vacancy Number");
        ptvn.setBounds(800,250,100,20);
        frame.add(ptvn);
        
        JLabel ptsn = new JLabel("Staff Name");
        ptsn.setBounds(800,300,100,20);
        frame.add(ptsn);
        
        JLabel ptjd = new JLabel("Joining Date");
        ptjd.setBounds(800,350,100,20);
        frame.add(ptjd);
        
        JLabel ptjt = new JLabel("Job Type");
        ptjt.setBounds(1200,50,100,20);
        frame.add(ptjt);
        
        JLabel ptsft = new JLabel("Shifts");
        ptsft.setBounds(1200,100,80,20);
        frame.add(ptsft);
        
        JLabel ptWPH = new JLabel("Wages Per Hour");
        ptWPH.setBounds(1200,150,100,20);
        frame.add(ptWPH);
        
        JLabel ptqlf = new JLabel("Qualification");
        ptqlf.setBounds(1200,250,80,20);
        frame.add(ptqlf);
        
        JLabel ptaptBy = new JLabel("Appointed By");
        ptaptBy.setBounds(1200,300,80,20);
        frame.add(ptaptBy);
        
        ptVacancyNum = new JTextField();
        ptVacancyNum.setBounds(940,50,200,20);
        frame.add(ptVacancyNum);
        
        ptDesignation = new JTextField();
        ptDesignation.setBounds(940,100,200,20);
        frame.add(ptDesignation);
        
        ptWorkingHPD = new JTextField();
        ptWorkingHPD.setBounds(940,150,200,20);
        frame.add(ptWorkingHPD);
        
        ptVacancyNum1 = new JTextField();
        ptVacancyNum1.setBounds(940,250,200,20);
        frame.add(ptVacancyNum1);
        
        ptStaffName = new JTextField();
        ptStaffName.setBounds(940,300,200,20);
        frame.add(ptStaffName);
        
        ptJoiningDate = new JTextField();
        ptJoiningDate.setBounds(940,350,200,20);
        frame.add(ptJoiningDate);
        
        ptJobType = new JTextField();
        ptJobType.setBounds(1300,50,200,20);
        frame.add(ptJobType);
        
        ptShifts = new JTextField();
        ptShifts.setBounds(1300,100,200,20);
        frame.add(ptShifts);
        
        ptWagesPH = new JTextField();
        ptWagesPH.setBounds(1300,150,200,20);
        frame.add(ptWagesPH);
        
        ptQualification = new JTextField();
        ptQualification.setBounds(1300,250,200,20);
        frame.add(ptQualification);
        
        ptAppointedBy = new JTextField();
        ptAppointedBy.setBounds(1300,300,200,20);
        frame.add(ptAppointedBy);
        
        ptExterminate = new JTextField("vacancy Number");
        ptExterminate.setBounds(1120,500,200,20);
        frame.add(ptExterminate);
        
        
        // JButton for part time staff hire
        
        ptAdd = new JButton("Add");
        ptAdd.setBounds(1350,185,120,50);
        frame.add(ptAdd);
        // action listener is used in Add button so that operation can be performed after user clicks the Add button
        ptAdd.addActionListener(new ActionListener() {                
             public void actionPerformed(ActionEvent ae) {                    
                 ptAdd();                
                };          
            }); 
        
        ptAppoint = new JButton("Appoint");
        ptAppoint.setBounds(1350,350,120,50);
        frame.add(ptAppoint);
        // action listener is used in Appoint button so that operation can be performed after user clicks the Appoint button
        ptAppoint.addActionListener(new ActionListener() {                
             public void actionPerformed(ActionEvent ae) {                    
                 ptAppoint();                
                };          
            }); 
        
        ptClear = new JButton("Clear");
        ptClear.setBounds(1350,410,120,50);
        frame.add(ptClear);
        // action listener is used in clear button so that operation can be performed after user clicks the clear button
        ptClear.addActionListener(new ActionListener() {                
             public void actionPerformed(ActionEvent ae) {                    
                 ptclear();                
                };          
            }); 
        
        ptDisplay = new JButton("Display");
        ptDisplay.setBounds(980,410,120,50);
        frame.add(ptDisplay);
        // action listener is used in Display button so that operation can be performed after user clicks the Display button
        ptDisplay.addActionListener(new ActionListener() {                
             public void actionPerformed(ActionEvent ae) {                    
                 ptDisplay();                
                };          
            }); 
        
        Exterminate = new JButton("Terminate");
        Exterminate.setBounds(1350,480,120,50);
        frame.add(Exterminate);
        // action listener is used in Exterminate button so that operation can be performed after user clicks the Exterminate button
        Exterminate.addActionListener(new ActionListener() {                
             public void actionPerformed(ActionEvent ae) {                    
                 Exterminate();                
                };          
            });   
    }
        // ftclear method clears the fields in Full Time Staff Hire
    public void ftclear(){
        ftVacancyNum.setText(null);
        ftDesignation.setText(null);
        ftWorkingHPD.setText(null);
        ftVacancyNum1.setText(null);
        ftStaffName.setText(null);
        ftJoiningDate.setText(null);
        ftJobType.setText(null);
        ftSalary.setText(null);
        ftQualification.setText(null);
        ftAppointedBy.setText(null);
        }
        
        // ptclear method clears the fields in Part Time Staff Hire
    public void ptclear(){
        ptVacancyNum.setText(null);
        ptDesignation.setText(null);
        ptWorkingHPD.setText(null);
        ptVacancyNum1.setText(null);
        ptStaffName.setText(null);
        ptJoiningDate.setText(null);
        ptJobType.setText(null);
        ptShifts.setText(null);
        ptWagesPH.setText(null);
        ptQualification.setText(null);
        ptAppointedBy.setText(null);
        ptExterminate.setText(null);
        }
        
    //ftAdd method adds staff to Full Time Staff Hire
    public void ftAdd(){
        // Try statement is used to prevent the program from crashing
        try{
            String vacancyNumber = ftVacancyNum.getText();
            String designation = ftDesignation.getText();
            String workingHour = ftWorkingHPD.getText();
            String jobType = ftJobType.getText();
            String salary = ftSalary.getText();

            //if statement is used to check after clicking add button is there any field left empty.
            if(vacancyNumber.trim().equals("") || designation.trim().equals("") || workingHour.trim().equals("") || jobType.trim().equals("") || salary.trim().equals("")){
                JOptionPane.showMessageDialog(frame,"please fill all the details","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int intVacancyNumber = Integer.parseInt(vacancyNumber);
                int intWorkingHour = Integer.parseInt(workingHour);
                int intSalary = Integer.parseInt(salary);
                if(intVacancyNumber<1 || intWorkingHour<1 || intSalary <1){
                    JOptionPane.showMessageDialog(frame,"please fill the inputs correctly. vacancy number, working hour and salary needs to be greater than 0.","Error",JOptionPane.ERROR_MESSAGE);
                }
                // if statement is used to check whether intWorkingHour is greater than 24
                else if(intWorkingHour >24){
                    JOptionPane.showMessageDialog(frame,"full time working hour cannot be greater than 24 hour.","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    boolean added=false;
                    // for loop is used to enter each index of staffHire array list
                    for(int a=0; a<staffHire.size(); ++a){
                        StaffHire sh = staffHire.get(a);
                            // if statement is used to check getVacancyNumber is equal to intVacancyNumber
                            if (sh.getVacancyNumber() == intVacancyNumber){
                                added=true;
                                break;
                            } 
                    }
                    //if statement is used to check whether added is equal to false. if satisfied the staff is added and an suitable message is displayed
                    if(added==false){
                        staffHire.add(new FullTimeStaffHire( intVacancyNumber, designation, jobType, intSalary ,intWorkingHour ));
                        JOptionPane.showMessageDialog(frame,"Vacancy Number : " + intVacancyNumber +"\n Designation : " + designation + "\n Job Type : " 
                        + jobType + "\n Salary : " + intSalary+ "\n working hour : " + workingHour,"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"the staff has already been added.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
            // catch is used to prevent the program from crashing
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"please enter data of appropriate data type","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    //ptAdd method adds staff to Part Time Staff Hire
    public void ptAdd(){
        // Try statement is used to prevent the program from crashing
        try{
            String vacancyNumber = ptVacancyNum.getText();
            String designation = ptDesignation.getText();
            String workingHour = ptWorkingHPD.getText();
            String jobType = ptJobType.getText();
            String shifts = ptShifts.getText();
            String wagesPerHour = ptWagesPH.getText();
            //if statement is used to check after clicking add button is there any field left empty.
            if(vacancyNumber.trim().equals("") || designation.trim().equals("") || workingHour.trim().equals("") || jobType.trim().equals("") || shifts.trim().equals("") || wagesPerHour.trim().equals("")){
                JOptionPane.showMessageDialog(frame,"please fill all the details","Error",0);
            }
            else{
                int intVacancyNumber = Integer.parseInt(vacancyNumber);
                int intWorkingHour = Integer.parseInt(workingHour);
                int intWagesPerHour = Integer.parseInt(wagesPerHour);
                if(intVacancyNumber<1 || intWorkingHour<1 || intWagesPerHour <1){
                    JOptionPane.showMessageDialog(frame,"please fill the inputs correctly. \n vacancy Number, working Hour and wages per needs to be greater than 0.","Error",JOptionPane.ERROR_MESSAGE);
                }
                // else if statement is used to check whether intWorkingHour is greater than 6
                else if(intWorkingHour >6){
                    JOptionPane.showMessageDialog(frame,"part time working hour cannot be greater than 6 hour.","Error",0);
                }
                else{
                    boolean added=false;
                    // for loop is used to enter each index of staffHire array list
                    for(int a=0; a<staffHire.size(); ++a){
                        StaffHire sh = staffHire.get(a);
                            // if statement is used to check getVacancyNumber is equal to intVacancyNumber
                            if (sh.getVacancyNumber() == intVacancyNumber){
                                added=true;
                                break;
                            }  
                    }
                    //if statement is used to check whether added is equal to false. if satisfied the staff is added and an suitable message is displayed
                    if(added==false){
                        staffHire.add(new PartTimeStaffHire( intVacancyNumber, designation, jobType, intWorkingHour, intWagesPerHour, shifts ));
                        
                        JOptionPane.showMessageDialog(frame,"Vacancy Number : " + intVacancyNumber +"\n Designation : " + designation + "\n Job Type : " 
                        + jobType + "\n wages per hour : "+ wagesPerHour +"\n working hour : "+ workingHour + "\n shift : " + shifts,"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"the staff has already been added.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        // catch is used to prevent the program from crashing
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"please enter data of appropriate data type","INFORMATION_MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
    }
    //ftAppoint method appoints staff to Full Time Staff Hire
    public void ftAppoint(){
        // Try statement is used to prevent the program from crashing
        try{
            String vacancyNumber1 = ftVacancyNum1.getText();
            String staffName =  ftStaffName.getText();
            String joiningDate = ftJoiningDate.getText();
            String qualification = ftQualification.getText();
            String appointedBy = ftAppointedBy.getText(); 
            //if statement is used to check after clicking add button is there any field left empty.
            if (vacancyNumber1.trim().equals("") || staffName.trim().equals("") || joiningDate.trim().equals("") || qualification.trim().equals("") || appointedBy.trim().equals("")){
                JOptionPane.showMessageDialog(frame,"please fill all the details","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int intVacancyNumber1 = Integer.parseInt(vacancyNumber1);
                // if statement is used to check whether intVacancyNumber1 is less than 1
                if(intVacancyNumber1 < 1){
                    JOptionPane.showMessageDialog(frame,"please fill the inputs correctly. \n Vacancy Number needs to be greater than 0.","Error",JOptionPane.ERROR_MESSAGE);
                }
                boolean ftAdded = false;
                // for loop is used to enter each index of staffHire array list
                for(int a=0; a<staffHire.size(); ++a){
                    StaffHire sh = staffHire.get(a);
                    if(sh instanceof FullTimeStaffHire){
                        FullTimeStaffHire p = (FullTimeStaffHire) sh;
                        if(p.getJoined()==true){
                           ftAdded=false;
                            break;
                        }
                        // if statement is used to check whether getVacancyNumber is equal to intVacancyNumber.
                        if (p.getVacancyNumber() == intVacancyNumber1){
                            ftAdded = true;
                            //staff is appointed
                            p.hireFullTimeHire(staffName, joiningDate, qualification, appointedBy);
                            JOptionPane.showMessageDialog(frame,"the staff has been successfully appointed","INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }    
                    }
                }
                //if statement used to check whether Added is equal to false.
                if(ftAdded==false){
                    JOptionPane.showMessageDialog(frame,"staff cannot be appointed.","Error",JOptionPane.ERROR_MESSAGE);}
            }
        }
        // catch is used to prevent the program from crashing
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"please enter data of appropriate data type","Error",JOptionPane.ERROR_MESSAGE);  
        }
    }  
    //ptAppoint method appoints staff to Part Time Staff Hire
    public void ptAppoint(){
        // Try statement is used to prevent the program from crashing
        try{
            String vacancyNumber1 = ptVacancyNum1.getText();
            String staffName =  ptStaffName.getText();
            String joiningDate = ptJoiningDate.getText();
            String qualification = ptQualification.getText();
            String appointedBy = ptAppointedBy.getText();
            //if statement is used to check after clicking add button is there any field left empty.
            if (vacancyNumber1.trim().equals("") || staffName.trim().equals("") || joiningDate.trim().equals("") || qualification.trim().equals("") || appointedBy.trim().equals("")){
                JOptionPane.showMessageDialog(frame,"please fill all the details","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int intVacancyNumber1 = Integer.parseInt(vacancyNumber1);
                // if statement is used to check whether intVacancyNumber1 is less than 1
                if(intVacancyNumber1 < 1){
                    JOptionPane.showMessageDialog(frame,"please fill the inputs correctly. \n vacancy Number needs to be greater than 0.","Error",JOptionPane.ERROR_MESSAGE);
                }
                boolean ptAdded = false;
                // for loop is used to enter each index of staffHire array list
                for(int a=0; a<staffHire.size(); ++a){
                    StaffHire sh = staffHire.get(a);
                    if(sh instanceof PartTimeStaffHire){
                        PartTimeStaffHire p = (PartTimeStaffHire) sh;
                        if(p.getJoined()==true){
                           ptAdded=false;
                            break;
                        }
                        else{
                        // if statement is used to check whether getVacancyNumber is equal to intVacancyNumber
                        if (p.getVacancyNumber() == intVacancyNumber1){
                            ptAdded=true;
                            //staff is appointed
                            p.HirePartTimeStaff(staffName, joiningDate, qualification, appointedBy);
                            JOptionPane.showMessageDialog(frame,"the staff has been successfully appointed","INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }
                    }
                }
                //if statement used to check whether Added is equal to false.
                if(ptAdded==false){
                    JOptionPane.showMessageDialog(frame,"vacancy number cannot be hired.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        // catch is used to prevent the program from crashing
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"please enter data of appropriate data type","Error",JOptionPane.ERROR_MESSAGE);
        }
    }  
    //Exterminate method terminates staff of Part Time Staff Hire
    public void Exterminate(){
        // Try statement is used to prevent the program from crashing
        try{
            String exterminate = ptExterminate.getText();
            // if statement is used to check whether exterminate is empty.
            if(exterminate.trim().equals("")){
                JOptionPane.showMessageDialog(frame,"please input the vacancy number of the part time staff you desire to exterminate","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int intExterminate = Integer.parseInt(exterminate);
                if(intExterminate<1){
                    JOptionPane.showMessageDialog(frame,"please fill the inputs correctly. \n vacancy Number needs to be greater than 0.","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    boolean found = false;
                    // for loop is used to enter each index of staffHire array list
                    for(int a=0; a<staffHire.size(); ++a){
                        StaffHire sh = staffHire.get(a);
                        if(sh instanceof PartTimeStaffHire){
                            PartTimeStaffHire p = (PartTimeStaffHire) sh;
                            // if statement is used to check whether getVacancyNumber is equal to intExterminate.
                            if (p.getVacancyNumber() == intExterminate){
                                p.terminateTheStaff();
                                staffHire.remove(a);
                                JOptionPane.showMessageDialog(frame,"the staff has been successfully terminated","INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                                found = true;
                            }
                        }
                    }
                    // if statement is used to check whether found is equal to false
                    if(found == false){
                        JOptionPane.showMessageDialog(frame,"invalid vacancy number.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        // catch is used to prevent the program from crashing
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"please enter data of appropriate data type","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
        
    //ptDisplay method displays staff of Full Time Staff Hire
    public void ftDisplay(){
        // for each loop is used to enter each of the index of the staffHire arrayList
        for(StaffHire s : staffHire){
            if(s instanceof FullTimeStaffHire){
                FullTimeStaffHire p = (FullTimeStaffHire) s;
                p.displayDetails();
            }
        }
    }  
    //ptDisplay method displays staff of Full Time Staff Hire
    public void ptDisplay(){
        // for each loop is used to enter each of the index of the staffHire arrayList
        for(StaffHire s : staffHire){
            if(s instanceof PartTimeStaffHire){
                PartTimeStaffHire p = (PartTimeStaffHire) s;
                p.displayDetails();
            }
        }
    }       
    public static void main(String [] args){
        new INGNepal().frame.setVisible(true);
    }
}