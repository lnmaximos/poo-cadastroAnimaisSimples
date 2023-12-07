package br.com.cadastroanimais;

class Porco extends Animal {
    public Porco(String nome, int anoNascimento, boolean precisaVacinar, double peso) {
        super(nome, anoNascimento, precisaVacinar, peso, TipoAnimal.PORCO);
    }
}