package br.com.cadastroanimais;

class Pato extends Animal {
    public Pato(String nome, int anoNascimento, boolean precisaVacinar, double peso) {
        super(nome, anoNascimento, precisaVacinar, peso, TipoAnimal.PATO);
    }
}