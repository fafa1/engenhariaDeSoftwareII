import java.util.ArrayList;

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
	this.arcondicionado = arcondicionado;
}

public static void create(ArrayList<Automovel> bancoAuto, String modelo, String tipo, byte numero_portas, int ano, String arcondicionado){
    bancoAuto.add(new Automovel(bancoAuto.size() + 1, modelo, tipo, numero_portas, ano, arcondicionado));
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

public void setArcondicionado(String arcondicionado) {
    this.arcondicionado = arcondicionado;
}

public String getArcondicionado() {
    return arcondicionado;
}
}
