package ar.edu.unlp.info.oo1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean estado = false; 
	List <Farola> vecinos;
	
	public Farola () {
		vecinos = new ArrayList<>();
	}
	
	public Boolean isOn() {
		if (this.estado)
			return true;
		else 
			return false;
	}

	public Boolean isOff() {
		if (!this.estado)
			return true;
		else 
			return false;
	}

	public List<Farola> getNeighbors() {
		return this.vecinos;
	}

	public void pairWithNeighbor(Farola otraFarola) {
		this.vecinos.add(otraFarola);
		if (!otraFarola.vecinos.contains(this))
			otraFarola.pairWithNeighbor(this);
		
	}

	public void turnOn() {
		if (!this.estado) {
			this.estado = true;
			this.vecinos.stream().forEach(far -> far.turnOn());
		}
		
	}

	public void turnOff() {
		if (this.estado) {
			this.estado = false;
			this.vecinos.stream().forEach(far -> far.turnOff());
		}
	}
	


}
