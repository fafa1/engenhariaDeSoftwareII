package models;

import database.Banco;

public class Pessoa {
private int id;
private String name;
private String email;
private String password;
private boolean fail = false;

public boolean isFail() {
    return fail;
}

public void setFail(boolean fail) {
    this.fail = fail;
}

public Pessoa (int id, String name, String email, String password){
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
}

public Pessoa (){
    this.fail = true;
    new Pessoa(0, "", "", "");
}

public static Pessoa login(Banco banco, String email, String password){
    int i;
    for (i = 0; i < banco.getPessoas().size() && !(banco.getPessoas().get(i).getEmail().equals(email)); i++);
    if (i == banco.getPessoas().size())
        return new Pessoa();
    else if (banco.getPessoas().get(i).getPassword().equals(password))
        return banco.getPessoas().get(i);
    return new Pessoa();
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

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}
}
