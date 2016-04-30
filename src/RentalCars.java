import java.util.ArrayList;
import java.util.Scanner;

public class RentalCars {
	
	public static void run(ArrayList<Automovel> bancoAuto){
	    Scanner reader = new Scanner(System.in);
	    int op;

	    do {
	        System.out.println("Voce esta logado no modulo Rental Cars");
	        System.out.println("Escolha uma opÃ§ao");
	        System.out.println("1 - Cadastrar Veículos");
	        System.out.println("2 - Op indisponivel");
	        System.out.println("3 - Op indisponivel");
	        System.out.println("4 - Sair");
	        op = reader.nextInt();

	        switch (op){
	            case 1:
	                cadastrarVeículos(bancoAuto);
	                break;
	            case 2:
	                System.out.println("ServiÃ§o indisponivel no momento");
	                break;
	            case 3:
	                System.out.println("ServiÃ§o indisponivel no momento");
	                break;
	            case 4: break;
	            default:
	                break;
	        }
	    } while (op != 4);
	}

	private static void cadastrarVeículos(ArrayList<Automovel> bancoAuto)
	{
	Scanner reader = new Scanner(System.in);	
    String modeloB;
    String tipoB; // esportivo, van, casual etc
    byte numero_portasB;
    int	anoB;
    String arcondicionadoB;
	
	Automovel novo;
	
	System.out.println("Modelo do carro");
	modeloB = reader.nextLine();
	System.out.println("Tipo");
	tipoB = reader.nextLine();
	System.out.println("Número de Portas");
	numero_portasB = reader.nextByte(); 
	System.out.println("Ano de Fabricação");
	anoB = reader.nextInt();
	System.out.println("Possui Ar Condicionado? S/N");
	arcondicionadoB = reader.nextLine(); //Bug estranho
	arcondicionadoB = reader.nextLine();
	
	Automovel.create(bancoAuto, modeloB, tipoB, numero_portasB, anoB, arcondicionadoB);
	System.out.print("Automóvel cadastrado com sucesso\n");
	}
	
}
