/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDeBiblioteca;

/**
 *
 * @author Aline
 */
import java.util.Scanner;
public class InterfaceDeBiblioteca {

    public static void main(String[] args) {
        int resposta;
        Scanner ler = new Scanner(System.in);
        
        do{
        System.out.println("O que deseja ver? \n 1 - Livro \n 2 - Revista \n 3 - Tese \n 4 - Sair");
        resposta = ler.nextInt();
        
        switch(resposta){
            case 1:
                Livro liv = new Livro();
                liv.disponivel();
                liv.emAtraso();
                liv.esprestado();
                liv.reservado();
                break;
            case 2: 
                Revista rev = new Revista();
                rev.disponivel();
                rev.emAtraso();
                rev.esprestado();
                rev.reservado();
                break;
            case 3:
                Tese tes = new Tese();
                tes.disponivel();
                tes.emAtraso();
                tes.esprestado();
                tes.reservado();
                break;
            case 4:
                System.out.println("Sistema Finalizado");

            default:
                System.out.println("Opção inválida, tente novamente!");

        }
        }while(resposta != 4);


    }
    
}
