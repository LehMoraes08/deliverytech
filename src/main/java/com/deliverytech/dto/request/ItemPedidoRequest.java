package com.deliverytech.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedidoRequest {

    @NotNull(message = "O ID do produto é obrigatório.")
    private Long produtoId;

    @NotNull(message = "A quantidade do produto é obrigatória.")
    @Min(value = 1, message = "A quantidade deve ser no mínimo 1.")
    @Positive(message = "A quantidade deve ser um número positivo.")
    private Integer quantidade;
}
