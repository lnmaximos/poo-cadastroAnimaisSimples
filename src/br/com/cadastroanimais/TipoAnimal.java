package br.com.cadastroanimais;

public enum TipoAnimal {
    OVELHA("1", "mééééé"),
    PATO("2", "quá quá"),
    PORCO("3", "óinc óinc"),
    CACHORRO("4", "au au"),
    GATO("5", "miau miau");

    private final String id;
    private final String som;

    TipoAnimal(String id, String som) {
        this.id = id;
        this.som = som;
    }

    public String getCodigo() {
        return id;
    }

    public String getSom() {
        return som;
    }
}
