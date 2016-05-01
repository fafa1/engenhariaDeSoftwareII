import java.util.ArrayList;
import java.util.Scanner;

public class RentalCars {

    public static void run(ArrayList<Automovel> bancoAuto){
        Scanner reader = new Scanner(System.in);
        byte op;

        do {
            System.out.println("Voce esta logado no modulo Rental Cars");
            System.out.println("Escolha uma opçao");
            System.out.println("1 - Cadastrar Veiculos");
            System.out.println("2 - Editar Veiculos");
            System.out.println("3 - Op indisponivel");
            System.out.println("4 - Sair");
            op = reader.nextByte();

            switch (op){
                case 1:
                    cadastrarVeiculos(bancoAuto);
                    break;
                case 2:
                    visualizarVeiculos(bancoAuto);;
                    break;
                case 3:
                    System.out.println("Serviço indisponivel no momento");
                    break;
                case 4: break;
                default:
                        break;
            }
        } while (op != 4);
    }

    private static void cadastrarVeiculos(ArrayList<Automovel> bancoAuto)
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
        System.out.println("Numero de Portas");
        numero_portasB = reader.nextByte();
        System.out.println("Ano de Fabricacao");
        anoB = reader.nextInt();
        System.out.println("Possui Ar Condicionado? S/N");
        arcondicionadoB = reader.nextLine(); //Bug estranho
        arcondicionadoB = reader.nextLine();

        Automovel.create(bancoAuto, modeloB, tipoB, numero_portasB, anoB, arcondicionadoB);
        System.out.print("Automovel cadastrado com sucesso\n");
    }

    private static void visualizarVeiculos(ArrayList<Automovel> bancoAuto)
    {
        byte op;
        Scanner reader = new Scanner(System.in);
        String modeloB;
        String tipoB; // esportivo, van, casual etc
        byte numero_portasB;
        int	anoB;
        String arcondicionadoB;

        for (int i = 0; i < bancoAuto.size(); i++)
        {
            System.out.println(i+1 + "-");
            System.out.println("Modelo: " + bancoAuto.get(i).getModelo());
            System.out.println("Tipo: " + bancoAuto.get(i).getTipo());
            System.out.println("Numero de Portas: " + bancoAuto.get(i).getNumero_portas());
            System.out.println("Possui Arcondicionado: " + bancoAuto.get(i).getArcondicionado());
            System.out.println("");
        }

        do
        {
            System.out.println("Qual deseja editar?");
            op = reader.nextByte();
        } while (op > bancoAuto.size());

        System.out.println("");
        System.out.println("");
        System.out.println("1- Modelo: " + bancoAuto.get(op-1).getModelo());
        System.out.println("2- Tipo: " + bancoAuto.get(op-1).getTipo());
        System.out.println("3- Numero de Portas: " + bancoAuto.get(op-1).getNumero_portas());
        System.out.println("4- Possui Arcondicionado: " + bancoAuto.get(op-1).getArcondicionado());
        System.out.println("5- Sair");
        System.out.println("O que deseja editar?");
        op = reader.nextByte();

        switch (op){
            case 1:
                System.out.println("Digite o novo valor para Modelo");
                modeloB = reader.nextLine();
                System.out.println("Modelo alterado com sucesso");
                break;
            case 2:
                System.out.println("Digite o novo valor para Tipo");
                tipoB = reader.nextLine();
                System.out.println("Tipo alterado com sucesso");
                break;
            case 3:
                System.out.println("Digite o novo valor para Numero de Portas");
                numero_portasB = reader.nextByte();
                System.out.println("Numero de Portas alterado com sucesso");
                break;
            case 4:
                System.out.println("Digite o novo valor para o campo Ar Condicionado");
                numero_portasB = reader.nextByte();
                System.out.println("Ar Condicionado alterado com sucesso");
                break;
            case 5: break;
            default:
                    break;

        }
    }

    public void cadastrarPlanosAluguel()
    {
    }

    public void visualizarAgendamentos()
    {
    }

    public void realizarCheckinDeLocacao()
    {
    }

    public void realizarCheckoutDeLocacao()
    {
    }

    public void visualizarFeedbacks()
    {
    }

    public void cadastarPostos()
    {
    }

    public void visualizarAgendamento()
    {
    }

}
