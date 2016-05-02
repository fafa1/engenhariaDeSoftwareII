import java.util.Scanner;

public class CarsBrasil {

public static void run(Banco banco){
    Scanner reader = new Scanner(System.in);
    int op;

    do {
        System.out.println("Voce esta logado no modulo Brasil Cars");
        System.out.println("Escolha uma opçao");
        System.out.println("1 - Cadastrar novo funcionário");
        System.out.println("2 - Op indisponivel");
        System.out.println("3 - Op indisponivel");
        System.out.println("4 - Sair");
        op = reader.nextInt();

        switch (op){
            case 1:
                createEmployee(banco);
                break;
            case 2:
                System.out.println("Serviço indisponivel no momento");
                break;
            case 3:
                System.out.println("Serviço indisponivel no momento");
                break;
            case 4: break;
            default:
                System.out.println("Opçao invalida");
        }
    } while (op != 4);
}

private static void createEmployee(Banco banco){
    Scanner reader = new Scanner(System.in);
    int op;
    String r;

    Funcionario novo;
    String nameB;
    String emailB;
    String passwordB;
    int empresaB;

    do {
        System.out.println("Entre com os dados do novo funcionario");
        System.out.print("nome: ");
        nameB = reader.next();
        System.out.print("email: ");
        emailB = reader.next();
        System.out.print("password: ");
        passwordB = reader.next();
        System.out.print("Qual empresa destino?");
        System.out.print("0- Brasil Cars");
        System.out.print("1- Rental Cars");
        System.out.print("2- Sales Cars");
        System.out.print("3- Manutencao Cars\n");
        empresaB = reader.nextInt();
        while (empresaB < 0 || empresaB > 3){
            System.out.print("Opçao Invalida: ");
            empresaB = reader.nextInt();
        }
        System.out.print("Confirma? y/n");
        r = reader.next();
    } while (r.equals("n") || r.equals("N"));
    Funcionario.create(banco, nameB, emailB, passwordB, empresaB);
    System.out.print("Funcionario cadastrado com sucesso\n");
}
}
