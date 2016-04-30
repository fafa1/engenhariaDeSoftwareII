import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
public static ArrayList<Pessoa> banco = new ArrayList<Pessoa>();
public static Scanner reader = new Scanner(System.in);

static int op;
public static String nameB;
public static String emailB;
public static String passwordB;

public static void main(String args[]) {
    //iniciando o "banco"
    banco.add(new Pessoa(1, "Marino", "marino@brasilcars.com", "lalala"));
    banco.add(new Pessoa(2, "Bruno", "bcamera@brasilcars.com", "senhafacil"));
    banco.add(new Pessoa(3, "Mezeravi", "missinho@brasilcars.com", "tesourasemponta123"));

    for(;;) {
        System.out.println("Seja bem vindo ao portal Brasil Cars!");
        System.out.println("1-Login\n2-Cadastrar");
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

    do {
        System.out.println("Escolha uma opçao");
        System.out.println("1 - Brasil Cars");
        System.out.println("2 - Rental Cars");
        System.out.println("3 - Sales Cars");
        System.out.println("4 - Cars Manutençao");
        System.out.println("5 - Sair");
        op = reader.nextInt();
        System.out.println("Voce selecionou " + op);
    } while (op != 5);

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
