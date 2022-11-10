package Heranca_Capgemini;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int morf = 0;
        Magico m = new Magico();
        Fisico f = new Fisico();

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Escolha a classe de seu personagem: \n 1 - Guerreiro \n 2 - Ladino\n 3 - Mago\n 4 - Clérigo");
            switch(leitor.nextInt()){
                case 1:
                    f.setClasse("Guerreiro");
                    f.setNivel(1);
                    System.out.println("Escolha a arma do seu personagem:  \n 1 - Martelo \n 2 - Machado\n");
                    if(leitor.nextInt() == 1){
                        f.setArma("Martelo");
                    }else if(leitor.nextInt() == 2){
                        f.setArma("Machado");
                    }
                    morf = 1;
                    break;
                case 2:
                    f.setClasse("Ladino");
                    f.setNivel(1);
                    System.out.println("Escolha a arma do seu personagem:  \n 1 - Adaga \n 2 - Espada curta\n");
                    if(leitor.nextInt() == 1){
                        f.setArma("Adaga");
                    }else if(leitor.nextInt() == 2){
                        f.setArma("Espada curta");
                    }
                    morf = 1;
                    break;
                case 3:
                    m.setClasse("Mago");
                    m.setNivel(1);
                    System.out.println("Escolha o poder do seu personagem:  \n 1 - Fogo \n 2 - Gelo \n");
                    if(leitor.nextInt() == 1){
                        m.setMagia("Fogo");
                    }else if(leitor.nextInt() == 2){
                        m.setMagia("Gelo");
                    }
                    morf = 2;
                    break;
                case 4:
                    m.setClasse("Clérigo");
                    m.setNivel(1);
                    System.out.println("Escolha o poder do seu personagem:  \n 1 - Luz \n 2 - Escuridão \n");
                    if(leitor.nextInt() == 1){
                        m.setMagia("Luz");
                    }else if(leitor.nextInt() == 2){
                        m.setMagia("Escuridão");
                    }
                    morf = 2;
                    break;
                default:
                    System.out.println("Opção inválida. Fim do programa.");
            
            } 
            if(morf != 0){
                System.out.println("Escolha a raça de seu personagem: \n 1 - Humano \n 2 - Elfo \n 3 - Anão\n 4 - Próscrito");
                switch(leitor.nextInt()){
                    case 1:
                        if(morf == 1){
                            f.setRaca("Humano");
                        }else if(morf == 2){
                            m.setRaca("Humano");
                        }
                        break;
                    case 2:
                        if(morf == 1){
                            f.setRaca("Elfo");
                        }else if(morf == 2){
                            m.setRaca("Elfo");
                        }
                        break;
                    case 3:
                        if(morf == 1){
                            f.setRaca("Anão");
                        }else if(morf == 2){
                            m.setRaca("Anão");
                        }
                        break;
                    case 4:
                        if(morf == 1){
                            f.setRaca("Próscrito");
                        }else if(morf == 2){
                            m.setRaca("Próscrito");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida. Fim do programa");
                
                }
            }
            if(m.getRaca() != null || f.getRaca() != null){
                System.out.println("Dê um nome ao seu personagem: ");
                if(morf == 1){
                    f.setNome(leitor.next());
                }else if(morf == 2){
                    m.setNome(leitor.next());
                }
            }
        }

        System.out.println("Personagem concluído!");
        if(morf == 1){
            System.out.println(
                f.getNome() + "\n"
                 + f.getNivel() + "lvl\n"
                 + f.getRaca() + " - Raça \n"
                 + f.getClasse() + " - Classe \n"
                 + f.getArma() + " - Arma \n\n");
        }else if(morf == 2){
            System.out.println(
                m.getNome() + "\n"
                 + m.getNivel() + "lvl\n"
                 + m.getRaca() + " - Raça \n"
                 + m.getClasse() + " - Classe \n"
                 + m.getMagia() + " - Magia \n\n");
        }
            
        
            
    }
}
