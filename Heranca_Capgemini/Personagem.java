package Heranca_Capgemini;

public class Personagem {
    private String nome;
    private int nivel;
    private String raca;
    private String classe;
    
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getClasse(){
        return classe;
    }
    public void setClasse(String classe){
        this.classe = classe;
    }
}
