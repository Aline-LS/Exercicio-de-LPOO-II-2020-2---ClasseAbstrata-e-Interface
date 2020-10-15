/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesom;

/**
 *
 * @author Aline
 */
public class Radio implements AparelhoDeSom{
    private boolean ligado;
	private int volume;
	
	public void CDPlayer() {
		ligado = false;
		volume = 0;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

        @Override
	public void liga(){
		if(ligado == false)
			ligado = true;
	}
	
        @Override
	public void desliga() {
		if(ligado == true)
			ligado = false;
	}
	
    @Override
	public void aumentaVolume(int valor) {
		if(valor > 0)
			volume += valor;
	}
	
    @Override
	public void diminuiVolume(int valor) {
		if(valor > 0)
			volume -= valor;
	}
}
