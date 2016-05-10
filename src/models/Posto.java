package models;

import database.Banco;

public class Posto {
private int id;
private String name;
private String bairro;
private String funcionamento;

public Posto(int id, String name, String bairro, String funcionamento) {
    this.id = id;
    this.name = name;
    this.bairro = bairro;
    this.funcionamento = funcionamento;
}

public static void create(Banco banco, String name, String bairro, String funcionamento){
    banco.postos.add(new Posto(banco.getPostos().size() + 1, name, bairro, funcionamento));
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getBairro() {
    return bairro;
}

public void setBairro(String bairro) {
    this.bairro = bairro;
}

public String getFuncionamento() {
    return funcionamento;
}

public void setFuncionamento(String funcionamento) {
    this.funcionamento = funcionamento;
}
}
