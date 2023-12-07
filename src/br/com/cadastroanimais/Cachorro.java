package br.com.cadastroanimais;

class Cachorro extends Animal {
    public Cachorro(String nome, int anoNascimento, boolean precisaVacinar, double peso) {
        super(nome, anoNascimento, precisaVacinar, peso, TipoAnimal.CACHORRO);
    }
}