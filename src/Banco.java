import java.util.ArrayList;

public class Banco {

public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
public ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
public ArrayList<Posto> postos = new ArrayList<Posto>();
public ArrayList<Locacao> locacoes = new ArrayList<Locacao>();
public ArrayList<PlanoLocacao> planosLocacoes= new ArrayList<PlanoLocacao>();
public ArrayList<Feedback> feedbacks = new ArrayList<Feedback>();

public Banco() {
    //iniciando o "banco"
    this.pessoas.add(new Funcionario(1, "Marino", "marino@brasilcars.com", "lalala", 0));
    this.pessoas.add(new Funcionario(2, "Bruno", "bcamera@brasilcars.com", "senhafacil", 1));
    this.pessoas.add(new Funcionario(3, "Romilson", "romilson@brasilcars.com", "tesourasemponta123", 2));
    this.pessoas.add(new Cliente(4, "Jonh Doe", "iammyown@grandfather.com", "grandfatherparadox"));
    this.pessoas.add(new Cliente(5, "Acerto", "mizeravi@qtensino.com", "apredeascontaponcotom"));
    this.automoveis.add(new Automovel(1, "Fiat Uno", "Casual", (byte) 2, 2015, "S"));
    this.postos.add(new Posto(1, "Unidade Central", "Ondina", "24 horas"));
}

public ArrayList<Pessoa> getPessoas() {
    return pessoas;
}

public void setPessoas(ArrayList<Pessoa> pessoas) {
    this.pessoas = pessoas;
}

public ArrayList<Automovel> getAutomoveis() {
    return automoveis;
}

public void setAutomoveis(ArrayList<Automovel> automoveis) {
    this.automoveis = automoveis;
}

public ArrayList<Posto> getPostos() {
    return postos;
}

public void setPostos(ArrayList<Posto> postos) {
    this.postos = postos;
}

public ArrayList<Locacao> getLocacoes() {
    return locacoes;
}

public void setLocacoes(ArrayList<Locacao> locacoes) {
    this.locacoes = locacoes;
}

public ArrayList<PlanoLocacao> getPlanosLocacoes() {
    return planosLocacoes;
}

public void setPlanosLocacoes(ArrayList<PlanoLocacao> planosLocacoes) {
    this.planosLocacoes = planosLocacoes;
}

public ArrayList<Feedback> getFeedbacks() {
    return feedbacks;
}

public void setFeedbacks(ArrayList<Feedback> feedbacks) {
    this.feedbacks = feedbacks;
}


}
