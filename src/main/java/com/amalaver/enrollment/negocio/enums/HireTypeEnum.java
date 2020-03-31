package com.amalaver.enrollment.negocio.enums;

public enum HireTypeEnum {

	PARCIAL((short)1),
	COMPLETO((short)2),
	POR_HORAS((short)3);
	
	private short valor;
	

	HireTypeEnum(short valor) {
		this.valor = valor;
	}
	
	public short getValor() {
		return this.valor;
	}
}
