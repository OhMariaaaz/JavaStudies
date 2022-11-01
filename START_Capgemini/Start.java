package START_Capgemini;
import java.util.Scanner;

public class Start {
    
    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            int idade;
            
            System.out.println("Em que ano estamos?");
            int ano = leitor.nextInt();

            System.out.println("Qual seu nome?");
            String nome = leitor.next();

            System.out.println("Qual sua idade?");
            idade = leitor.nextInt();

            int anonasc = ano - idade;

            if(anonasc < 1960) {
                System.out.println(nome + " nasceu antes da década de 60");
            }else if(anonasc < 1970){
                System.out.println(nome + " nasceu na década de 60");
            }else if(anonasc < 1980){
                System.out.println(nome + " nasceu na década de 70");
            }else if(anonasc < 1990){
                System.out.println(nome + " nasceu na década de 80");
            }else if(anonasc < 2000){
                System.out.println(nome + " nasceu na década de 90");
            }else if(anonasc < 2010){
                System.out.println(nome + " nasceu na geração 2000");
            }else if(anonasc < 2020){
                System.out.println(nome + " nasceu na pré-pandemia");
            }else if(anonasc > 2020){
                System.out.println(nome + " nasceu na pós-pandemia");
            }

        }

        

    }

}

           /*           Notas
                Operadores
             * == compara
             * = recebe
             * < ou >
             * != 
             * <= ou >=
             * &&
             * ||
             * 
             * -----------
             * 
             * + - / * % (/ divisão || % divisão com resto)
             * 
             * ------------
             *   Tipos de dados
             * Int - inteiro - 1
             * Double - números com virgula - 1,4
             * Float - casas decímais - 0,2
             * char - apenas uma letra -'m'
             * Byte - ???- 0
             * boolean - true e false - true
             * String - texto -" the winter is coming"
             * next - lê apenas uma palavra/letra
             * nextLine - Lê toda a linha
             * 
             * 
            */

             // Comentário de linha única

            /* 
            *  Comentário
            *  de bloco
            */  

            /**
             * Comentário de documentação
             */