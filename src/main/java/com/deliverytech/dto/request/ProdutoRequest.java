package com.deliverytech.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {

    @NotBlank(message = "O nome do produto não pode estar vazio")
    @Size(min = 2, max = 100, message = "O nome do produto deve ter entre 2 e 100 caracteres")
    private String nome;

    @NotBlank(message = "A categoria do produto não pode estar vazia")
    private String categoria;

    @NotBlank(message = "A descrição do produto não pode estar vazia")
    @Size(max = 500, message = "A descrição do produto não pode exceder 500 caracteres")
    private String descricao;

    @NotNull(message = "O preço do produto é obrigatório")
    @DecimalMin(value = "0.1", message = "O preço do produto deve ser maior que zero")
    @DecimalMax(value = "800.0", message = "O preço do produto não pode exceder 800,00")
    private BigDecimal preco;

    @NotNull(message = "O ID do restaurante é obrigatório")
    private Long restauranteId;
}
