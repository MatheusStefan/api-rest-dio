package me.dio.com.api.handler;

public class FieldMandatory extends BusinessException {
public FieldMandatory(String campo) {
	super("O campo %s é obrigatório", campo);
}
	
}
