package br.com.cadastroanimais;

class Gato extends Animal {
    public Gato(String nome, int anoNascimento, boolean precisaVacinar, double peso) {
        super(nome, anoNascimento, precisaVacinar, peso, TipoAnimal.GATO);
    }
}