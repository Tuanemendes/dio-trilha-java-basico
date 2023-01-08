import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A,B ,media;


        A = scanner.nextDouble();
        B = scanner.nextDouble();

        media = ((A * 3.5) + (B * 7.5) )/11;
        System.out.printf("Media = %.5f ",media);
 
        System.out.println(media);


    }
    
}
