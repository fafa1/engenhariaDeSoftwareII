public class Cliente extends Pessoa{

public Cliente(int id, String name, String email, String password) {
    super(id, name, email, password);
}

public static void create(Banco banco, String name, String email, String password){
    banco.getPessoas().add(new Cliente(banco.getPessoas().size() + 1, name, email, password));
}

}
