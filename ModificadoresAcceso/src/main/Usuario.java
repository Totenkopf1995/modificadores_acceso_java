package main;

public class Usuario {
    public String username;
    private String password;

    //Constructor
    public Usuario(){
        this.username = "";
        this.password = "";
    }
    public Usuario(String username){
        this.username = username;
        this.password = "";
    }
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void saluda(){
        System.out.println("Hola, mi username es " + this.username);
    }

    //Getter
    public String getPassword(){
        return this.password;
    }

    //Setter
    public void setPassword(String password){
        this.password = password;
    }
}
