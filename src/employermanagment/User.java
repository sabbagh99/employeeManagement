/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employermanagment;

import java.awt.List;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class User  implements  Serializable{
    private long id;
    private String name;
    private String department;
    private String barthDate;
    private String address;
    private String gender;
    private String status;

    public User() {
    }
    
   

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBarthDate() {
        return barthDate;
    }

    public void setBarthDate  (String barthDate) {
        this.barthDate = barthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", department=" + department + ", barthDate=" + barthDate + ", address=" + address + ", gender=" + gender + ", status=" + status + '}';
    }

    
    
    
    
    
    
    

}
