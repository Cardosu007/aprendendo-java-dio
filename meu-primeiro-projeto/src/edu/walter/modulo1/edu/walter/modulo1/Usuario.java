package edu.walter.modulo1;

public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();


        

        
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);


        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " +smartTv.canal);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " +smartTv.volume);      

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " +smartTv.volume);


        smartTv.ligar();
        System.out.println("TV ligada? " +smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada? " +smartTv.ligada);

    }
    
}
