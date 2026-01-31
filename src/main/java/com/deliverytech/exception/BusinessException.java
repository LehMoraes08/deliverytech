package com.deliverytech.exception;

/**
 * Exceção criada para representar erros de negócio na aplicação.
 * Para servir como base para outras exceções específicas de negócio.
 */
public class BusinessException extends RuntimeException{

    /**
     * Construtor que recebe a mensagem de erro.
     * @param message Mensagem de erro detalhando a exceção de negócio.
     */
    public BusinessException(String message) {
        super(message);
    }
    
}
