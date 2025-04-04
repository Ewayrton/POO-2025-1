public class Animal {
    private String especie;


    public Animal(){
    }
    public Animal(String especie){
        this.especie = especie;
    }

    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }


    public void som(){
        System.out.println("O animal emite um som genérico!");
    }
}
