package com.amalaver.enrollment.negocio.enums;

public enum StatusEnum {
	
	ACTIVO((byte)1),
	INACTIVO((byte)-1),
	BLOQUEADO((byte)0),
	ELIMINADO((byte)-2);
	
	private byte valor;
	
	StatusEnum(byte valor){
		this.valor = valor;
	}
	
	public byte getValor() {
		return this.valor;
	}

}
