import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hohenheim on 4/29/16.
 */
public class Sistema {
    public static ArrayList<Pessoa> banco = new ArrayList<Pessoa>();
    public static Scanner reader = new Scanner(System.in);

    public static String emailB;
    public static String passwordB;

    public static void main(String args[]) {
        //iniciando o "banco"
        banco.add(new Pessoa(1, "Marino", "marino@brasilcars.com", "lalala"));
        banco.add(new Pessoa(2, "Bruno", "bcamera@brasilcars.com", "senhafacil"));
        banco.add(new Pessoa(3, "Mezeravi", "missinho@brasilcars.com", "tesourasemponta123"));

        System.out.println("Seja bem vindo ao portal Brasil Cars!");
        Pessoa logado;
        do {
            System.out.println("Entre com seus dados");
            System.out.print("email: ");
            String emailB = reader.next();
            System.out.print("password: ");
            String passwordB = reader.next();
            logado = Pessoa.login(banco, emailB, passwordB);
        } while (logado.isFail());

        System.out.println("Escolha uma opçao");
        System.out.println("1 - Brasil Cars");
        System.out.println("2 - Rental Cars");
        System.out.println("3 - Sales Cars");
        System.out.println("4 - Cars Manutençao");
        int op = reader.nextInt();
        System.out.println("Voce selecionou " + op);
    }
}
