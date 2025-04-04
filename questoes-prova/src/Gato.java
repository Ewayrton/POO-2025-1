public class Gato extends Animal{
    private String nome;

    public Gato(String nome, String especie){
        super(especie);
        this.nome = nome;
    }

    @Override
    public void som(){
        System.out.println("O gato faz: Miau!");
    }
}
