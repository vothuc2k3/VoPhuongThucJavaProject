/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hughey
 */
public class User {
    private String uName;
    private String password;

    public User(String uName, String password) {
        this.uName = uName;
        this.password = password;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o){
        User u = (User) o;
        if(this.getuName().equals(u.getuName()) && this.getPassword().equals(u.getPassword())){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return String.format("%s-%s", this.getuName(), this.getPassword());
    }
}
