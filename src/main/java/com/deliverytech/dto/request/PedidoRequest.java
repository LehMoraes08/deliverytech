package com.deliverytech.dto.request;

import com.deliverytech.model.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoRequest {

    @NotNull(message = "O ID do cliente é obrigatório.")
    private Long clienteId;

    @NotNull(message = "O ID do restaurante é obrigatório.")
    private Long restauranteId;

    @NotNull(message = "O endereço de entrega é obrigatório.")
    @Valid //<--Importante para validar os campos do objeto Endereço
    private Endereco enderecoEntrega;

    @NotEmpty(message = "A lista de pedido não pode estar vazia.")
    @Valid //<--Importante para validar os campos dos itens do pedido
    private List<ItemPedidoRequest> itens;
}
