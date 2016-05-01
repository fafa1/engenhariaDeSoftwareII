import java.util.ArrayList;

public class Cliente extends Pessoa{

public Cliente(int id, String name, String email, String password) {
    super(id, name, email, password);
}

public static void create(ArrayList<Pessoa> banco, String name, String email, String password){
    banco.add(new Cliente(banco.size() + 1, name, email, password));
}

}
