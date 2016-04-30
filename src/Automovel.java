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

}
