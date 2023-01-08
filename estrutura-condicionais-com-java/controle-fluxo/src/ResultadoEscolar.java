public class ResultadoEscolar{

    public static void main(String[] args) {
        int nota = 4 ;
        //condicional encadeada 
        if(nota >= 7){
            System.out.println("Aprovado");
        }else if(nota >=  5 && nota < 7){
            System.out.println("Prova de recuperação");
        }else{
            System.out.println("Reprovado!");
        }
        System.out.println("-----------------");
        // condição ternaria 

        System.out.println("Condição ternaria");
        System.out.println("-----------------");
        int nota1 = 5 ;
       /*  String resultado  = nota1 >= 7 ? "Aprovado!" :"Reprovado!";
        System.out.println(resultado);
         */
        String resultado = nota1 >= 7 ? "Aprovado!" : nota1 >=5 && nota1 <7 ? "Recuperação!" : "Reprovado!";
        System.out.println("Resualtado: " + resultado);
    }


}