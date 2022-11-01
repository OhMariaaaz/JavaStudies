package START_Capgemini;
import java.util.Scanner;
import java.util.Random;

public class While {
   
    public static void main(String[] args){

        try(Scanner leitor = new Scanner(System.in);){
            Random gerador = new Random();
            
                System.out.println("Vamos jogar um jogo!" + 
                "\n Eu escolhi um número de 0 a 100, e você deve adivinhar qual eu escolhi!" +
                "\n Faça sua primeira tentativa:");
                int numero = gerador.nextInt(101);
                int resposta = leitor.nextInt();
                int tentativas = 0;

                while(resposta!=numero){
                    if(resposta<numero){
                        System.out.println("Resposta errada. O número é maior.");
                    }else{
                        System.out.println("Resposta errada. O número é menor.");
                    }
                    tentativas++;
                    System.out.println("Tente novamente:");
                    resposta = leitor.nextInt();
                }

                System.out.println("Você acertou! O número era " + numero + ". Você usou " + tentativas + " tentativas.");
        }
    }
}
