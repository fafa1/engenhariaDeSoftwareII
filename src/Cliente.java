import java.util.ArrayList;

public class Cliente extends Pessoa{

public Cliente(int size, String name, String email, String password) {
    super(size, name, email, password);
}

public static void create(ArrayList<Pessoa> banco, String name, String email, String password){
    banco.add(new Cliente(banco.size() + 1, name, email, password));
}

public void visualizarHistóricoAluguel()
{
}

public void visualizarHistoricodeCompras()
{
}

}
