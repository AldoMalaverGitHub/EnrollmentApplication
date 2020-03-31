package com.amalaver.enrollment.negocio.enums;

public enum CourseTypeEnum {

	PROGRAMACION((short)1),
	OFIMATICA((short)2),
	GESTION((short)3);
	
	private short valor;
	
	CourseTypeEnum(short valor){
		this.valor = valor;
	}
	
	public short getValor() {
		return this.valor;
	}
}
