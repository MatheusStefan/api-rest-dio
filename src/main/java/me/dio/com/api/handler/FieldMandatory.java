package me.dio.com.api.handler;

public class FieldMandatory extends BusinessException {
	private static final long serialVersionUID = 1L;

public FieldMandatory(String campo) {
	super("O campo %s é obrigatório", campo);
}
	
}
