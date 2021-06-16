public class StaffHire{
    //attribute
    private int vacancyNumber;
    private String designation;
    private String jobType;

public StaffHire( int vacancyNumber , String designation , String jobType ){
    this.vacancyNumber = vacancyNumber;
    this.designation = designation;
    this.jobType = jobType;
}

// getter method
public int getVacancyNumber(){
    return vacancyNumber;
}

public String getDesignation(){
    return designation;
}

public String getJobType(){
    return jobType;
}

//setter method
public void setVancancyNumber (int vacancyNumber){
    this.vacancyNumber = vacancyNumber;
}

public void setDesignation (String designation){
    this.designation = designation;
}

public void setJobType(String jobType){
    this.jobType = jobType;
}

public void displayDetails(){
    System.out.println("vacancy number = " + getVacancyNumber());
    System.out.println("designation = " + getDesignation());
    System.out.println("job type = " + getJobType());
}
}