package com.deliverytech.exception;

/** 
 * Exceção lançada quando uma entidade não é encontrada no banco de dados
*/
public class EntityNotFoundException extends BusinessException {

    /**
     * Construtor que formata uma mensagem padrão de "não encontrado".
     * @param entityName O nome da entidade (ex: "Cliente", "Pedido").
     * @param id O identificador da entidade que não foi encontrada.
     */
    public EntityNotFoundException(String entityName, Long id) {
        super(String.format("%s com ID %d não foi encontrado.", entityName, id));
    }    
}
