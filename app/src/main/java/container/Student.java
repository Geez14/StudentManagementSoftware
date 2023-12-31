package container;
import java.io.Serializable;

public class Student implements Serializable{
    // Todo
    /*
     * Define attributes for Student class with proper naming
     * Define constructor to initialize the value to instance variable
     */

    // make all the attribute private as we are storing it in a private database
    private String firstName;
    private String lastName;
    private long roll;
    private String section;
    private String branch;
    private long phoneNumber;
    private String state;
    private String city;
    private int pinCode;

    // private Date dateOfAdmission; // AutoGenerated
    private long registrationNumber;


    public Student(String name,
            long roll,
            String section,
            String branch,
            long phoneNumber,
            String state,
            String city,
            int pncode,
            long registrationNumber) {

            // Todo initialize instance variable
    }


    // all the getter Methods for the attributes
    public String getName() {
        return firstName+lastName;
    }
    public long getRoll() {
        return roll;
    }
    public String getSection() {
        return section;
    }
    public String getBranch()
    {
        return branch;
    }
    public long getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getState()
    {
        return state;
    }
    public String getCity()
    {
        return city;
    }
    public int getPinCode()
    {
        return pinCode;
    }
    // public Date getDateOfAdmission()
    // {
    //     return dateOfAdmission;
    // }
    public long getRegistrationNumber()
    {
        return registrationNumber;
    }

    // setter method for all the attribute
    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // ToDo make getter method also clean the code
    /*
     * fist add getter method
     * then add the setter method for the respective setter method
     * example:

     public long getRoll() {
        return roll;
    }

     public void setRoll(long roll) {
        this.roll = roll;
    }

     *
     */
}