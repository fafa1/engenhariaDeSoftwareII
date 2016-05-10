package Main;

import models.*;
import database.Banco;

import java.util.Scanner;

public class RentalCars {

    public static void run(Banco banco){
        Scanner reader = new Scanner(System.in);
        byte op;

        do {
            System.out.println("Voce esta logado no modulo Rental Cars");
            System.out.println("Escolha uma opçao");
            System.out.println("1 - Cadastrar Veiculos");//feito
            System.out.println("2 - Visualizar Veiculos");//feito + ediçao, falta delecao
            System.out.println("3 - Cadastrar Postos");
            System.out.println("4 - Visualizar Postos");
            System.out.println("5 - Visualizar Feedbacks");
            System.out.println("6 - Visualizar Agendamentos");
            System.out.println("7 - Realizar Checkin de Locaçao");
            System.out.println("8 - Realizar Checkout de Locaçao");
            System.out.println("9 - Cadastrar Planos de Quilometragem");
            System.out.println("10 - Visualizar Historio de Aluguel");
            System.out.println("11 - Sair");
            op = reader.nextByte();

            switch (op){
                case 1:
                    cadastrarVeiculos(banco);
                    break;
                case 2:
                    visualizarVeiculos(banco);
                    break;
                case 3:
                    cadastrarPostos(banco);
                    break;
                case 4:
                    visualizarPostos(banco);
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Serviço indisponivel no momento");
                    break;
            }
        } while (op != 11);
    }

    private static void cadastrarVeiculos(Banco banco)
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
        arcondicionadoB = reader.nextLine(); //limpando o buffer c POG
        arcondicionadoB = reader.nextLine();

        Automovel.create(banco, modeloB, tipoB, numero_portasB, anoB, arcondicionadoB);
        System.out.print("models.Automovel cadastrado com sucesso\n");
    }

    private static void visualizarVeiculos(Banco banco)
    {
        int op;
        Scanner reader = new Scanner(System.in);
        String modeloB;
        String tipoB; // esportivo, van, casual etc
        byte numero_portasB;
        int	anoB;
        String arcondicionadoB;

        for (int i = 0; i < banco.getAutomoveis().size(); i++)
        {
            System.out.println(i+1 + "-");
            System.out.println("Modelo: " + banco.getAutomoveis().get(i).getModelo());
            System.out.println("Tipo: " + banco.getAutomoveis().get(i).getTipo());
            System.out.println("Numero de Portas: " + banco.getAutomoveis().get(i).getNumero_portas());
            System.out.println("Possui Arcondicionado: " + banco.getAutomoveis().get(i).getArcondicionado());
            System.out.println("");
        }

        do
        {
            System.out.println("Para editar algum item digite seu id ou '0' (zero) para sair");
            op = reader.nextInt();
        } while (op > banco.getAutomoveis().size());
        if (op != 0) alterarAutomovel(banco, op);
    }

    public static void cadastrarPostos(Banco banco) {
        Scanner reader = new Scanner(System.in);
        String nameB; //Unidade Central, Unidade Orla, Unidade lalala
        String bairroB;
        String funcionamentoB; //24 horas, 12 horas, fds

        Posto novo;

        System.out.println("Digite o nome da nova unidade");
        nameB = reader.nextLine();
        System.out.println("Digite o nome do Bairro");
        bairroB = reader.nextLine();
        System.out.println("Descreva o periodo de funcionamento (24 horas, 12 horas, fds...)");
        funcionamentoB = reader.nextLine();

        Posto.create(banco, nameB, bairroB, funcionamentoB);
        System.out.print("models.Automovel cadastrado com sucesso\n");
    }
    public static void visualizarPostos(Banco banco) {
        int op;
        Scanner reader = new Scanner(System.in);
        String nameB;
        String bairroB;
        String funcionamentoB;

        for (int i = 0; i < banco.getPostos().size(); i++) {
            System.out.println(i + 1 + "-");
            System.out.println("Nome: " + banco.getPostos().get(i).getName());
            System.out.println("Bairro: " + banco.getPostos().get(i).getBairro());
            System.out.println("Funcionamento: " + banco.getPostos().get(i).getFuncionamento());
            System.out.println("");
        }

        do {
            System.out.println("Para editar algum item digite seu id ou '0' (zero) para sair");
            op = reader.nextInt();
        } while (op > banco.getPostos().size());
        if (op != 0) alterarPosto(banco, op);
    }

    public static void alterarPosto(Banco banco, int id) {
        Scanner reader = new Scanner(System.in);
        int op;
        String nameB;
        String bairroB;
        String funcionamentoB;

        System.out.println("");
        System.out.println("1- Nome: " + banco.postos.get(id).getName());
        System.out.println("2- Bairro: " + banco.postos.get(id).getBairro());
        System.out.println("3- Funcionamento: " + banco.postos.get(id).getFuncionamento());
        System.out.println("4- Sair");
        System.out.println("O que deseja editar?");
        op = reader.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o novo valor para Nome");
                nameB = reader.nextLine();
                banco.postos.get(id).setName(nameB);
                System.out.println("Modelo alterado com sucesso");
                break;
            case 2:
                System.out.println("Digite o novo valor para Bairro");
                bairroB = reader.nextLine();
                banco.postos.get(id).setBairro(bairroB);
                System.out.println("Tipo alterado com sucesso");
                break;
            case 3:
                System.out.println("Digite o novo valor para Funcionamento (24 horas, 12 horas, fds...)");
                funcionamentoB = reader.nextLine();
                banco.postos.get(id).setFuncionamento(funcionamentoB);
                System.out.println("Numero de Portas alterado com sucesso");
                break;
            case 4:
                break;
            default:
                break;

        }
    }


    public static void alterarAutomovel(Banco banco, int id){
        Scanner reader = new Scanner(System.in);
        int op;
        String modeloB;
        String tipoB; // esportivo, van, casual etc
        byte numero_portasB;
        int	anoB;
        String arcondicionadoB;

        System.out.println("");
        System.out.println("1- Modelo: " + banco.automoveis.get(id-1).getModelo());
        System.out.println("2- Tipo: " + banco.automoveis.get(id-1).getTipo());
        System.out.println("3- Numero de Portas: " + banco.automoveis.get(id-1).getNumero_portas());
        System.out.println("4- Possui Arcondicionado: " + banco.automoveis.get(id-1).getArcondicionado());
        System.out.println("5- Sair");
        System.out.println("O que deseja editar?");
        op = reader.nextInt();

        switch (op){
            case 1:
                System.out.println("Digite o novo valor para Modelo");
                modeloB = reader.nextLine();
                banco.automoveis.get(id-1).setModelo(modeloB);
                System.out.println("Modelo alterado com sucesso");
                break;
            case 2:
                System.out.println("Digite o novo valor para Tipo");
                tipoB = reader.nextLine();
                banco.automoveis.get(id-1).setTipo(tipoB);
                System.out.println("Tipo alterado com sucesso");
                break;
            case 3:
                System.out.println("Digite o novo valor para Numero de Portas");
                numero_portasB = reader.nextByte();
                banco.automoveis.get(id-1).setNumero_portas(numero_portasB);
                System.out.println("Numero de Portas alterado com sucesso");
                break;
            case 4:
                System.out.println("Digite o novo valor para o campo Ar Condicionado");
                arcondicionadoB = reader.nextLine(); //limpando o buffer c POG
                arcondicionadoB = reader.nextLine();
                banco.automoveis.get(id-1).setArcondicionado(arcondicionadoB);
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
