package com.deliverytech.exception;

/**
 * Exceção para indicar conflitos de dados, como tentativas de criar um recurso que já existe.
 */
public class ConflictException extends BusinessException {
   
    /**
     * Construtor que recebe a mensagem de conflito.
     * @param message A Mensagem descritiva de conflito.
     */
    public ConflictException(String message) {
        super(message);
    }
}
