package br.com.cadastroanimais;

class Animal {
    private String nome;
    private int anoNascimento;
    private boolean precisaVacinar;
    private double peso;
    private TipoAnimal tipo;

    public Animal(String nome, int anoNascimento, boolean precisaVacinar, double peso, TipoAnimal tipo) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.precisaVacinar = precisaVacinar;
        this.peso = peso;
        this.tipo = tipo;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Precisa se vacinar: " + precisaVacinar);
        System.out.println("Peso: " + peso);
        System.out.println("Som do animal: " + tipo.getSom());
    }
}