/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonedeal;

/**
 *
 * @author Osk
 */
public class Staff 
{
    
    private String mobNum;
    private String name;
    
    public Staff(){
        
    }
    
    public Staff(String name , String mobNumb){
        this.name = name;
        this.mobNum = mobNumb;
       
    }

    public String getMobNum() {
        return mobNum;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String toString() {
        return "Staff{" + "mobNum=" + mobNum + ", name=" + name + '}';
    }
    
    
    
}
