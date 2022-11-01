package POO_Capgemini;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Personagem objetoPersonagem = new Personagem;
        String nome = "";
        float vida = 10;
        float vidaatual = 10;
        int forca = 0;
        int destreza = 0;
        int resistencia = 0;
        int magia = 0;
        int resposta;

        try (Scanner leitor = new Scanner(System.in)) {

            //Criar personagem
            for(int i = 1; i < 3;){
                System.out.println("Informe o nome do " + i + "º personagem:");
                nome = leitor.next();

                // Definir atributos
                for(int a = 4; a > 0;){
                    System.out.println("Informe o atributo que receberá " + a 
                    + " pontos: \n 1 - Força(" + forca + ")\n 2 - Destreza(" + destreza
                     + ")\n 3 - Resistência(" + resistencia + ")\n 4 - Magia(" + magia + ") .");
                    resposta = leitor.nextInt();

                    switch(resposta){
                        case 1:
                            forca = a;
                            a--;
                            break;
                        case 2:
                            destreza = a;
                            a--;
                            break;
                        case 3:
                            resistencia = a;
                            a--;
                            break;
                        case 4:
                            magia = a;
                            a--;
                            break;
                        default:
                            System.out.println("Opção inválida, tente novamente.");
                            break;
                    }
            }
            //Mostrar personagem
            System.out.println("O " + i + "º personagem está pronto. Aqui estão as informações dele: \n"
             + nome + "\n"
             + vida + "/" + vidaatual + " - Vida\n"
             + forca + " - Força \n"
             + destreza + " - Destreza \n"
             + resistencia + " - Resistência \n"
             + magia + " - Magia \n" 
             + "Deseja redestribuir os pontos? \n  1 - Sim / 2 - Não");
             resposta = leitor.nextInt();

             switch(resposta){
                 case 1:
                     break;
                 case 2:
                    System.out.println("Personagem adicionado.");
                     i++;
                     break;
                 default:
                     System.out.println("Opção inválida, tente novamente.");
                     break;
            
   }
        nome = "";
        vida = 10;
        vidaatual = 10;
        forca = 0;
        destreza = 0;
        resistencia = 0;
        magia = 0;
}
        }
    }
}
