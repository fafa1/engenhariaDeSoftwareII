import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
public static ArrayList<Pessoa> banco = new ArrayList<Pessoa>();
public static ArrayList<Automovel> bancoAuto = new ArrayList<Automovel>();
public static Scanner reader = new Scanner(System.in);

static int op;
public static String nameB;
public static String emailB;
public static String passwordB;

public static void main(String args[]) {
    //iniciando o "banco"
    banco.add(new Funcionario(1, "Marino", "marino@brasilcars.com", "lalala", 0));
    banco.add(new Funcionario(2, "Bruno", "bcamera@brasilcars.com", "senhafacil", 0));
    banco.add(new Funcionario(3, "Mezeravi", "romilson@brasilcars.com", "tesourasemponta123", 0));
    banco.add(new Cliente(4, "Jonh Doe", "iammyown@grandfather.com", "grandfatherparadox"));
    bancoAuto.add(new Automovel(1, "Fiat Uno", "Casual", (byte) 2, 2015, "S"));

    for(;;) {
        System.out.println("Seja bem vindo ao portal Brasil Cars!");
        System.out.println("1-Login\n2-Cadastrar\n");
        op = reader.nextInt();

        switch (op) {
            case 1:
                Sistema.login();
                break;
            case 2:
                Sistema.singUp();
                break;
            case 3:
                return;
            default:
                break;
        }
    }
}

private static void login(){
    Pessoa logado;
    do {
        System.out.println("Entre com seus dados");
        System.out.print("email: ");
        emailB = reader.next();
        System.out.print("password: ");
        passwordB = reader.next();
        logado = Pessoa.login(banco, emailB, passwordB);
    } while (logado.isFail());

    if( logado instanceof Cliente){
        do {
            System.out.println("Escolha uma opçao");
            System.out.println("1 - Rental Cars");
            System.out.println("2 - Sales Cars");
            System.out.println("3 - Cars Manutençao");
            System.out.println("4 - Sair");
            op = reader.nextInt();

            switch (op){
                case 1:
                    System.out.println("Rental Cars");
                    RentalCars.run(bancoAuto);
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
    else{
        switch (logado.getEmpresa()){
            case 0:
                System.out.println("Brasil Cars");
                CarsBrasil.run(banco);
                break;
            case 1:
                System.out.println("Rental Cars");
                RentalCars.run(bancoAuto);
                break;
            case 2:
                System.out.println("Sistema de Sales Cars offline");
                break;
            case 3:
                System.out.println("Sistema de Cars Manutençao offline");
                break;
        }
    }

}

private static void singUp(){
    Cliente novo;
    String r;
    do {
        System.out.println("Entre com seus dados");
        System.out.print("nome: ");
        nameB = reader.next();
        System.out.print("email: ");
        emailB = reader.next();
        System.out.print("password: ");
        passwordB = reader.next();
        System.out.print("Confirma? y/n");
        r = reader.next();
    } while (r.equals('n') || r.equals('N'));
    Cliente.create(banco, nameB, emailB, passwordB);
}

}
