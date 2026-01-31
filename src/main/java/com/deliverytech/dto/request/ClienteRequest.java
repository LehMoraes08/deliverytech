package com.deliverytech.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {

    @NotBlank(message = "O nome não pode estar em branco.")
    @Size(min = 2, max = 100, message = "O nome deve ter entre {min} e {max} caracteres.")
    private String nome;

    @NotBlank(message = "O email não pode estar em branco.")
    @Email(message = "O email deve ser válido.")    
    private String email;
}
