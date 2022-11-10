package Classes_Capgemini;
import java.util.Random;
import java.util.Scanner;

public class Personagem {
    
    private String nome[] = new String[2];
    private float vida[] = new float[2];
    private float vidaatual[] = new float[2];
    private int forca[] = new int[2];
    private int destreza[] = new int[2];
    private int resistencia[] = new int[2];
    private int resposta;
    Random dado = new Random();
    Scanner leitor = new Scanner(System.in);
    
    public Personagem(){
    }

    //Setters e Getters. A maneira correta de alterar dados de uma classe.
    public void setResposta(){
        this.resposta = leitor.nextInt();
        
    }
    public int getResposta(){
        return this.resposta;
    }

    public void setNome(String nome, int i){
        this.nome[i] = nome;
    }
    public String getNome(int i){
        return this.nome[i];
    }

    public void setVida(int i, int resistencia){
        this.vida[i] = resistencia + 10;
    }
    public float getVida(int i){
        return this.vida[i];
    }

    public void setVidaAtual(int i, float vidaatual){
        this.vidaatual[i] = vidaatual;
    }
    public float getVidaAtual(int i){
        return this.vidaatual[i];
    }

    public void setForca(int forca, int i){
        this.forca[i] = forca;
    }
    public int getForca(int i){
        return this.forca[i];
    }

    public void setDestreza(int destreza, int i){
        this.destreza[i] = destreza;
    }
    public int getDestreza(int i){
        return this.destreza[i];
    }

    public void setResistencia(int resistencia, int i){
        this.resistencia[i] = resistencia;
    }
    public int getResistencia(int i){
        return this.resistencia[i];
    }

    // Onde os atributos são definidos. 
    //  I = o indice do vetor de personagens.
    public void definirAtributos(int i){
        // Cada volta no laço diminui o valor de a, que será o valor que será alocado em cada um dos atributos.
        for(int a = 3; a > 0;){
            System.out.println("Informe o atributo que receberá " + a + " pontos:" 
            + " \n 1 - Força(" + this.getForca(i) 
            + ")\n 2 - Destreza(" + this.getDestreza(i)
            + ")\n 3 - Resistência(" + this.getResistencia(i) 
            + ") .");
            this.setResposta();

            //Descobre qual foi o atributo escolhido e atribui o valor de "a"
            switch(this.getResposta()){
                case 1:
                    if(this.getForca(i) != 0){
                        System.out.println("Atributo já pontuado. Escolha outro.");
                    }else{ 
                        this.setForca(a,i);
                        a--;
                    }
                    break;
                case 2:
                    if(this.getDestreza(i) != 0){
                        System.out.println("Atributo já pontuado. Escolha outro.");
                    }else{ 
                        this.setDestreza(a,i);
                        a--;
                    }
                        break;
                case 3:
                    if(this.getResistencia(i) != 0){
                        System.out.println("Atributo já pontuado. Escolha outro.");
                    }else{ 
                        this.setResistencia(a,i);
                        a--;
                    }
                        break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        //Baseado nos atributo de resistência, o valor de vida será calculado.
        this.setVida(i, this.getResistencia(i));
        this.setVidaAtual(i, this.getVida(i));
    
    }

    public void criarPersonagens(){

        //Criar personagem. 
        //I é o indice do vetor de personagens, e a cada volta do for um personagem será criado.
        for(int i = 0; i < 2;){
            System.out.println("Informe o nome do " + (i+1) + "º personagem:");
            this.setNome(leitor.next(), i);

            //Uma classe separada para definir os atributos de cada personagem.
            this.definirAtributos(i);


            System.out.println("O " + (i+1) + "º personagem está pronto. \n");
            this.exibirPersonagem(i);
            System.out.println("Deseja redestribuir os pontos? \n" + 
            " 1 - Não, prossiga para o próximo passo.\n" + 
            " 2 - Sim, desejo refazer o personagem.");
                this.setResposta();

                //Caso o usuário deseje redestribuir os pontos, os atributos serão zerados 
                //e o laço termina sem que o i(indice do vetor) se altere. 
                switch(this.getResposta()){
                case 1:
                    System.out.println("Personagem adicionado.");
                    i++;
                    break;
                case 2:
                    this.setVida(i, 0);
                    this.setVidaAtual(i, 0);
                    this.setForca(0, i);
                    this.setDestreza(0, i);
                    this.setResistencia(0, i);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
                    
            }
            
        }
    }

    public void exibirPersonagem(int i){
        System.out.println(
            this.getNome(i) + "\n"
             + this.getVida(i) + "/" + this.getVidaAtual(i) + " - Vida\n"
             + this.getForca(i) + " - Força \n"
             + this.getDestreza(i) + " - Destreza \n"
             + this.getResistencia(i) + " - Resistência \n");
    }

    public int iniciativa(){
        int iniciativa = dado.nextInt(2);
        return iniciativa;
    }

    public float atacar(int i){
        float dano = 0;    
        if((this.destreza[i] + dado.nextInt(3)) <= dado.nextInt(7)){
            dano = dado.nextInt(4) + forca[i] + (destreza[i]/3);
            return dano;
        }else{
            return dano;
        }
    }

    public float defender(float dano, int i){
        float danorecebido;
        danorecebido = dano - ((resistencia[i] + destreza[i]) / 3);
        if (danorecebido > 0){
            this.vidaatual[i] = this.vidaatual[i] - danorecebido;
        }
        return danorecebido;
    }


}
/*
 * As classes representam objetos do mundo real, que tem atributos e caracteristicas.
 * 
 * Método são as ações que esse objeto tem na vida real.
 * 
 * Método construtor é o método que será acionado no primeira chamada do objeto.
 * 
 * Encapsulamento: nenhuma informação deve ser diretamente alterada pela classe main.
 */