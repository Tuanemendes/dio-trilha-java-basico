public class OperadorLogico {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("Condição verdadeira");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
    }    
}
