package Classes_Capgemini;

public class Main {

    public static void main(String[] args){

        int turno;
        int pular = 0 ;
        Personagem player = new Personagem();


        System.out.println(
            "\n\nBem vindo á arena! Meu nome é Mariig e serei sua narradora, " + 
            "(ou a programadora que fez esse jogo, como preferirem.) \n" + 
            "E hoje teremos um combate! Animados? Espero que sim, porque nossos " + 
            "guerreiros vieram de bem longe de Sassaria apenas para vocês vê-los morrer, e como bem sabemos: " + 
            "apenas um deles sairá desta arena com a cabeça no lugar. Mas chega de enrolação! \n" + 
            "Façam suas apostas pois nossos guerreiros são... \n");

        player.criarPersonagens();
        
        turno = player.iniciativa();
        System.out.println("\n\nE assim começamos nossa batalha! " + player.getNome(turno) + ", faça seu primeiro movimento.");


        while(player.getVidaAtual(0) > 0 && player.getVidaAtual(1)  > 0){
            System.out.println(
                "\n" + player.getNome(turno) + ", o que você deseja fazer?" + 
                "\n 1 - Atacar" + 
                "\n 2 - Vizualizar ficha de atributos" +
                "\n 3 - Pular turno");
            player.setResposta();

            switch(player.getResposta()){
                case 1:
                    float dano = player.atacar(turno);
                    float danorecebido = 0;

                    if(dano == 0.0){
                        System.out.println("Você errou o ataque!");
                    }else{
                        if (turno == 0){
                            danorecebido = player.defender(dano, 1);
                            if(danorecebido == 0 || danorecebido < 0 ){
                                System.out.println("O inimigo defendeu seu ataque!");
                            }else{
                                System.out.println("Você causou " + danorecebido + "de dano em " + player.getNome(1));
                            }
                        }else{
                            danorecebido = player.defender(dano, 0);
                            if(danorecebido == 0 || danorecebido < 0 ){
                                System.out.println("O inimigo defendeu seu ataque!");
                            }else{
                                System.out.println("Você causou " + danorecebido + "de dano em " + player.getNome(0));
                            }
                        }
                    }
                    pular = 1;
                    break;
                case 2:
                    player.exibirPersonagem(turno);
                    break;
                default:
                    pular = 1;
                    break;
            }
            if(pular == 1){
                if(turno == 0){
                    turno = 1;
                }else{
                    turno = 0;
                }
            }
            pular = 0;
        }

    }
}
