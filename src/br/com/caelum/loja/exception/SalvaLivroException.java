package br.com.caelum.loja.exception;

import javax.ejb.ApplicationException;

@SuppressWarnings("serial")
@ApplicationException(rollback=true)
public class SalvaLivroException extends RuntimeException {

}