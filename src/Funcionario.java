public class Funcionario extends Pessoa {

/*0 BrasilC*/
/*1 RentalC*/
/*2 SalesC*/
/*3 ManutencaoC*/
public int empresa;

public Funcionario(int id, String name, String email, String password, int empresa) {
    super(id, name, email, password);
    this.empresa = empresa;
}

public static void create(Banco banco, String name, String email, String password, int empresa){
    banco.getPessoas().add(new Funcionario(banco.getPessoas().size() + 1, name, email, password, empresa));
}

public int getEmpresa() {
    return empresa;
}

public void setBrasilCars() {
    this.empresa = 0;
}

public void setRentalCars() {
    this.empresa = 1;
}

public void setSalesCars() {
    this.empresa = 2;
}

public void setManutencaoCars() {
    this.empresa = 3;
}

}
