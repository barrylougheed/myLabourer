package mylabourer.com.mylabourer.model;

/**
 * Created by barry on 29/08/2017.
 */

public class User {


    private int id;
    public String name;
    public String email;
    public String password;


    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}






