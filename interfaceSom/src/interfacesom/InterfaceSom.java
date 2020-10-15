/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesom;

/**
 *
 * @author usuario 1
 */
public class InterfaceSom {

   public static void main(String[] args) {
	Radio radio = new Radio();
            
            System.out.println("CDPlayer");
            System.out.println("Ligado:" + radio.isLigado() + ", Volume:"  + radio.getVolume());
            radio.setLigado(true);
            radio.setVolume(75);
            System.out.println("Ligado:" + radio.isLigado() + ", Volume:"  + radio.getVolume());
            radio.desliga();
            radio.diminuiVolume(20);
            System.out.println("Ligado:" + radio.isLigado() + ", Volume:"  + radio.getVolume());
            radio.liga();
            radio.aumentaVolume(10);
            System.out.println("Ligado:" + radio.isLigado() + ", Volume:"  + radio.getVolume());
	
       
       
        CDPlayer cd = new CDPlayer();
            
            System.out.println("Radio");
            System.out.println("Ligado:" + cd.isLigado() + ", Volume:"  + cd.getVolume());
            cd.setLigado(true);
            cd.setVolume(100);
            System.out.println("Ligado:" + cd.isLigado() + ", Volume:"  + cd.getVolume());
            cd.desliga();
            cd.diminuiVolume(50);
            System.out.println("Ligado:" + cd.isLigado() + ", Volume:"  + cd.getVolume());
            cd.liga();
            cd.aumentaVolume(25);
            System.out.println("Ligado:" + cd.isLigado() + ", Volume:"  + cd.getVolume());
	}

}
