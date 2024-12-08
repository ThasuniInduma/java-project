/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author ASUS
 */
public class userEntity {
    private String Employee_ID;
    private String First_name;
    private String Second_name;
    private String User_Password;
    
    public userEntity() {
    }

    public userEntity(String Employee_ID, String First_name, String Second_name, String User_Password) {
        
        this.Employee_ID = Employee_ID;
        this.First_name = First_name;
        this.Second_name = Second_name;
        this.User_Password = User_Password;
    }

    /**
     * @return the Employee_ID
     */
    public String getEmployee_ID() {
        return Employee_ID;
    }

    /**
     * @param Employee_ID the Employee_ID to set
     */
    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    /**
     * @return the First_name
     */
    public String getFirst_name() {
        return First_name;
    }

    /**
     * @param First_name the First_name to set
     */
    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    /**
     * @return the Second_name
     */
    public String getSecond_name() {
        return Second_name;
    }

    /**
     * @param Second_name the Second_name to set
     */
    public void setSecond_name(String Second_name) {
        this.Second_name = Second_name;
    }

    /**
     * @return the User_Password
     */
    public String getUser_Password() {
        return User_Password;
    }

    /**
     * @param User_Password the User_Password to set
     */
    public void setUser_Password(String User_Password) {
        this.User_Password = User_Password;
    }

    @Override
    public String toString() {
        return "userEntity{" + "Employee_ID=" + Employee_ID + ", First_name=" + First_name + ", Second_name=" + Second_name + ", User_Password=" + User_Password + '}';
    }
}
