public class PartTimeStaffHire extends StaffHire{
    //attributes
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

//constructor
public PartTimeStaffHire(int vancancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts){
    super( vancancyNumber, designation, jobType);
    this.workingHour=workingHour;
    this.wagesPerHour=wagesPerHour;
    this.shifts=shifts;
    this.staffName = "";
    this.joiningDate = "";
    this.appointedBy = "";
    this.joined = false;
    this.terminated = false;
}

//Getter Method
public int getWorkingHour(){
    return workingHour;
}

public int getWagesPerHour(){
    return wagesPerHour;
}

public String getStaffName(){
    return staffName;
}

public String getJoiningDate(){
    return joiningDate;
}

public String getQualification(){
    return qualification;
}

public String getAppointedBy(){
    return appointedBy;
}

public String getShift(){
    return shifts;
}

public boolean getJoined(){
    return joined;
}

public boolean getTerminated(){
    return terminated;
}

// setter method
public void setWorkingHour( int workingHour ){
    this.workingHour = workingHour;
}

public void setWagesPerHour(int wagesPerHour){
    this.wagesPerHour = wagesPerHour;
}

public void setStaffName(String staffName){
    this.staffName = staffName;
}

public void setJoiningDate(String joiningDate){
    this.joiningDate = joiningDate;
}

public void setQualification( String qualification){
    this.qualification = qualification;
}

public void setAppointedBy( String appointedBy){
    this.appointedBy = appointedBy;
}

public void setShifts ( String shifts ){
    if(joined = false){
    this.shifts = shifts;
}
}

public void setJoined( boolean joined ){
    this.joined = joined;
}

public void setTerminated(boolean terminated){
    this.terminated = terminated;
}

public void HirePartTimeStaff(String staffName, String joiningDate, String qualificaton, String appointedBy){
//if condition is used
if (joined == true){
    System.out.println("the staff has already been appointed.");
    System.out.println("the name of the staff is " + getStaffName());
    System.out.println("the staff had joined at the date " + getJoiningDate());
}
else{
    this.staffName = staffName;
    this.joiningDate = joiningDate;
    this.qualification = qualification;
    this.appointedBy = appointedBy;
    this.joined = true;
    this.terminated = false;
}
}
public void terminateTheStaff(){
    //if condition is used
    if (terminated==true){
        System.out.println("the staff is already terminated.");
        
    }
    else{
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.terminated=true;
        this.joined=false;
    }
}
public void displayDetails(){
    //super is used
    super.displayDetails();
    //if condition is used
    if(joined==true){
    System.out.println("the name of the staff = " + getStaffName());
    System.out.println("the wager per hour = " + getWagesPerHour());
    System.out.println("working hour = " + getWorkingHour());
    System.out.println("joining date = " + getJoiningDate());
    System.out.println("qualification =" + getQualification());
    System.out.println("appointed by = " + getAppointedBy());
    System.out.println("income per day = " + (getWagesPerHour()*getWorkingHour()));
    }
    
}
}