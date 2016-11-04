package com.impacta.apirest.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = -8328443678506683236L;

	public LivroNaoEncontradoException(String mensagem){
		super(mensagem);
	}

	public LivroNaoEncontradoException(String mensagem, Throwable causa){
		super(mensagem,causa);
	}
	
}
