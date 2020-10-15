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
public class Livro implements ItemDeBiblioteca {
    private boolean pegar;
    private int dias = 10;
    private int diasemprestimo = 7;


    public boolean getPegar(){
        return pegar;
    }
    public void setPegar(boolean pegar){
        this.pegar = pegar;
    }
    
    @Override
    public void disponivel(){
        if(pegar == true)
            pegar = false;
        
        System.out.println("O livro está disponivel na estante");
    }
    @Override
    public void esprestado(){
        if(pegar == false)
            pegar = true;
                System.out.println("O livro já foi emprestado e estará emprestado por " + diasemprestimo + "dias.");

    }
    @Override
    public void emAtraso(){
        if(pegar == false)
            pegar = false;
                System.out.println("O livro ainda não foi devolvido");

    }
    @Override
    public void reservado(){
        if(pegar == true)
            pegar = true;
            System.out.println("O livro estará reservado por " + dias);

    }
    
}
