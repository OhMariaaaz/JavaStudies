package START_Capgemini;
import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {

        try(Scanner leitor = new Scanner(System.in)){
            int race;

            System.out.println("Digite a raça que você deseja:" 
            + " \n 1 - Soole \n 2 - Toruk \n 3 - Huma \n 4 - Próscrito");
            race = leitor.nextInt();

            switch(race){
                case 1:
                    System.out.println("Você escolheu Soole.");
                    break;
                case 2:
                    System.out.println("Você escolheu Toruk.");
                    break;
                case 3:
                    System.out.println("Você escolheu Huma.");
                    break;
                case 4:
                    System.out.println("Você escolheu Próscrito.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        

    }

}
