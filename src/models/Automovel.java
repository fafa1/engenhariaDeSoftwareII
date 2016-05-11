package models;

import database.Banco;

public class Automovel {

private String modelo;
private String tipo; // esportivo, van, casual etc
private byte numero_portas;
private int	ano, id;
private String arcondicionado;

public Automovel (int id, String modelo, String tipo,byte numero_portas,int ano, String arcondicionado)
{
	this.id = id;
	this.modelo = modelo;
	this.tipo = tipo;
	this.numero_portas = numero_portas;
    this.ano = ano;
	this.arcondicionado = arcondicionado;
}

public static void create(Banco banco, String modelo, String tipo, byte numero_portas, int ano, String arcondicionado){
    banco.getAutomoveis().add(new Automovel(banco.getLastInsertAutomovel() + 1, modelo, tipo, numero_portas, ano, arcondicionado));
    banco.incLastInsertAutomovel();
}

public static void edit(Banco banco, Automovel me){
    int i;
    for (i = 0; i < banco.getAutomoveis().size() && (banco.getAutomoveis().get(i).getId() != me.getId()); i++);
    if (i == banco.getAutomoveis().size())
        System.out.println("nao acho!");
    else
        banco.getAutomoveis().set(i, me);
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public void setNumero_portas(byte numero_portas) {
    this.numero_portas = numero_portas;
}

public byte getNumero_portas() {
    return numero_portas;
}

public int getAno() { return ano; }

public void setAno(int ano) { this.ano = ano; }

public void setArcondicionado(String arcondicionado) {
    this.arcondicionado = arcondicionado;
}

public String getArcondicionado() {
    return arcondicionado;
}
}
