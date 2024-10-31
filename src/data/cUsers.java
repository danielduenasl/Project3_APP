/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PC
 */
public class cUsers {
    
    private long idUsers;
    private String userName;
    private String password;

    public long getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(long idUsers) {
        this.idUsers = idUsers;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public cUsers() {
    }

    @Override
    public String toString() {
        return "cUsers{" + "idUsers=" + idUsers + ", userName=" + userName + ", password=" + password + '}';
    }
    
    public String toJSON() {
    return "{"
            + "\"userName\": \"" + userName + "\", "
            + "\"password\": \"" + password + "\" "
            + "}";
    }
}
