import java.util.Scanner;

public class PlanoOperadora {

    public static void main(String[] args) {
        
        System.out.println("===================================");
        System.out.println("|     Bem vindo a Operadore OP    |");
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("|              PLANOS             |");
        System.out.println("===================================");
        System.out.println("            BASIC: Digite B        ");
        System.out.println("===================================");
        System.out.println("            MIDIA: Digite M        ");
        System.out.println("===================================");
        System.out.println("            TURBO: Digite T        ");
        System.out.println("===================================");
        System.out.println("Para escolher digite umas opções");
        Scanner scanner = new Scanner(System.in);

        String  opcoes = scanner.next();

        switch (opcoes.toUpperCase()) {
            case "T":
                System.out.println("5Gb Youtube,");
               
            case "M":
                System.out.println("Whats e Intragam grátis,");
              
            case "B":
                System.out.println("100 minutos de ligação. ");
                
            default:
                System.out.println("Não possui esta opção escolha novamente umas das opções acima!");
                break;
        }
        


    }
    
}
