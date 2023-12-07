package br.com.cadastroanimais;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tipo de animal a ser cadastrado:");
        System.out.println("1 - Ovelha\n2 - Pato\n3 - Pai do Matheus\n4 - Cachorro\n5 - Gato");

        int tipoSelecionado = in.nextInt();in.nextLine();

        Animal animal = cadastrarAnimal(in, tipoSelecionado);

        if (animal != null) {
            System.out.println("Animal cadastrado com sucesso!\nInformações do animal:");
            animal.exibirInfo();
        } else {
            System.out.println("Tipo de animal inválido!");
        }
        in.close();
    }

    private static Animal cadastrarAnimal(Scanner in, int tipoSelecionado) {

        String nome;
        int anoNascimento;
        boolean precisaVacinar;
        double peso;

        System.out.println("Informe o nome do animal:");
        nome = in.nextLine();

        System.out.println("Informe o ano de nascimento do animal:");
        anoNascimento = in.nextInt();

        System.out.println("O animal precisa se vacinar? (true/false):");
        precisaVacinar = in.nextBoolean();

        System.out.println("Informe o peso do animal:");
        peso = in.nextDouble();

        TipoAnimal tipoAnimal = null;
        for (TipoAnimal tipo : TipoAnimal.values()) {
            if (tipo.getCodigo().equals(String.valueOf(tipoSelecionado))) {
                tipoAnimal = tipo;
                break;
            }
        }

        if (tipoAnimal != null) {
            return switch (tipoAnimal) {
                case OVELHA -> new Ovelha(nome, anoNascimento, precisaVacinar, peso);
                case PATO -> new Pato(nome, anoNascimento, precisaVacinar, peso);
                case PORCO -> new Porco(nome, anoNascimento, precisaVacinar, peso);
                case CACHORRO -> new Cachorro(nome, anoNascimento, precisaVacinar, peso);
                case GATO -> new Gato(nome, anoNascimento, precisaVacinar, peso);
            };
        }
        return null;
    }
}