public class Cachorro extends Animal{
    private String nome;

    public Cachorro(){
    }
    public Cachorro(String nome, String especie){
        super(especie);
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public void som(){
        System.out.println("O cachorro faz: AU AU!");
    }
}
