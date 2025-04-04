public class Zoologico {
    private Gato gato;
    private Cachorro cachorro;

    public Zoologico(){}


    public void emitirSom(){
        Gato gato = new Gato("Castiel", "Felino");
        Cachorro cachorro = new Cachorro("Kauã","Canino");
        gato.som();
        cachorro.som();
    }
}
