public class FullTimeStaffHire extends StaffHire{
    //attribute
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

//constructor
public FullTimeStaffHire(int vacancyNumber, String designation, String jobType ,int salary, int workingHour){
    
    //super is used
    super(vacancyNumber,designation,jobType);
    this.salary = salary;
    this.workingHour=workingHour;
    this.staffName="";
    this.joiningDate="";
    this.qualification="";
    this.appointedBy="";
    this.joined=false;
}

//getter Method
public int getSalary(){
    return salary;
}

public int getWorkingHour(){
    return workingHour;
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

public boolean getJoined(){
    return joined;
}
//setter Method
public void setSalary(int salary){
    // if condition
    if (joined == false){
        this.salary=salary;
    }
    else {
        System.out.println("the staff is already appointed so it is therefore not possible to change the salary.");
    }
}

public void setWorkingHour(int workingHour){
    //if condition
    if (joined == false){
        this.workingHour=workingHour;
    }
}

public void setStaffName(String staffName){
    this.staffName=staffName;
}

public void setJoiningDate(String joiningDate){
    this.joiningDate=joiningDate;
}

public void setQualification(String qualification){
    this.qualification=qualification;
}

public void setAppointedBy(String appointedBy){
    this.appointedBy= appointedBy;
}

public void setJoined(boolean joined){
    this.joined=joined;
}

// hire full tme staff hire method
public void hireFullTimeHire(String staffName, String joiningDate, String qualification, String appointedBy){
    // if condition
    if(joined == true){
        System.out.println("the name of the staff is "+ getStaffName());
        System.out.println("the staff has already joined on "+ getJoiningDate());
    }
    else{
        this.staffName = staffName;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = true;
    }
}

public void displayDetails(){
    //super is used
    super.displayDetails();
    //if condition
    if (joined == true){
      System.out.println("staff name = " + getStaffName());  
      System.out.println("salary = " + getSalary());
      System.out.println("working Hour = " + getWorkingHour());
      System.out.println("joining date = " + getJoiningDate());
      System.out.println("qualification = " + getQualification());
      System.out.println("appointed by = " + getAppointedBy());
    }
}
}