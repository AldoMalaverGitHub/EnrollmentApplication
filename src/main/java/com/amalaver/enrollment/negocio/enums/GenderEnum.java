package com.amalaver.enrollment.negocio.enums;

public enum GenderEnum {
	
	MASCULINO((short)1),
	FEMENINO((short)2);
	
	private short valor;
	
	GenderEnum(short valor){
		this.valor = valor;
	}
	
	public short getValor() {
		return this.valor;
	}

}
