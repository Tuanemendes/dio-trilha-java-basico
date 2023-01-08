package metodo;

public class Usuario {
    
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println(" A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Qual o volume ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo status : A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println(" Novo status : A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo volume : " + smartTv.volume);
        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);


    }
}
