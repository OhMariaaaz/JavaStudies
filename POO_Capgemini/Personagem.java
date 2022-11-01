package POO_Capgemini;
import java.util.Random;

public class Personagem {
    
    String nome;
    float vida;
    int forca;
    float destreza;
    int resistencia;

    Random dado = new Random();

    public float atacar(){
        float dano = 0;    
        if(destreza <= dado.nextInt(4)){
            dano = dado.nextInt(4) + forca + (destreza/3);
            return dano;
        }else{
            return dano;
        }
    }

    public float defender(float dano){
        float danorecebido;
        danorecebido = dano - ((resistencia + destreza) / 3);
        if (danorecebido > 0){
            vida = vida - danorecebido;
        }
        return danorecebido;
    }


}
/*
 * As classes representam objetos do mundo real, que tem atributos e caracteristicas.
 * Método são as ações que esse objeto teria na vida real.
 */