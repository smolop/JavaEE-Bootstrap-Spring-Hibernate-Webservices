package com.sebastian.ejercicios.poo.pruebas.entidades.jerarquia.empleado.operario;

import com.sebastian.ejercicios.poo.pruebas.entidades.jerarquia.empleado.Operario;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
	
}
