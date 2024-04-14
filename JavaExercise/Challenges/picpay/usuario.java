package JavaExercise.Challenges.picpay;

import java.util.List;

public class usuario {

    //Creating objects

    public String fullName;
    private String cpf;
    private String email;
    public String password;

    usuario(String fullName, String cpf, String email, String password, List<String> user){
        this.fullName = fullName;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
    }
        
    public String getCpf(){
        return this.cpf;
    }
    public String getemail(){
        return this.email;
    }

}
    
    

