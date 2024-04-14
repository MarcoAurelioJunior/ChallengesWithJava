package JavaExercise.Challenges.picpay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class receiveUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Coloque o seu nome completo: ");
        String fullName = scanner.nextLine();

        System.out.println("Coloque o seu email: ");
        String email = scanner.nextLine();

        System.out.println("Coloque o seu CPF apenas números: ");
        String cpf = scanner.nextLine();

        System.out.println("Para finalizar o cadastro coloque a sua senha: ");
        String password = scanner.nextLine();

        System.out.println("Nos diga o seu perfil");
        System.out.println("1 - Usuário \n2 - Lojista");
        int option = scanner.nextInt();

        if (option == 1) {
            usuario commumUser = new usuario(fullName, cpf, email, password, null);

            System.out.println("1 - Cadastrar outro usuário");
            int singupAnotherUser = scanner.nextInt();

            if (singupAnotherUser == 1) {
                userList users = new userList(null);
            }
            
        }else if(option == 2){
            usuario LogUser = new usuario(fullName, cpf, email, password, null);
            List<String> logUserList = new ArrayList<>();

        }


    }   
}
