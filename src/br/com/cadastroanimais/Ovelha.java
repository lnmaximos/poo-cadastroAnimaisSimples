package br.com.cadastroanimais;

class Ovelha extends Animal {
    public Ovelha(String nome, int anoNascimento, boolean precisaVacinar, double peso) {
        super(nome, anoNascimento, precisaVacinar, peso, TipoAnimal.OVELHA);
    }
}