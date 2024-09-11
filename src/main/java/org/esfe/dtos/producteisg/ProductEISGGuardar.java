package org.esfe.dtos.producteisg;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductEISGGuardar implements Serializable{

    @NotBlank(message = "El nombre es obligatorio")
    @JsonProperty("Nombre")
    private String nombreEISG;

    @JsonProperty("Descripción")
    private String descripcionEISG;

    @NotNull(message = "El precio es obligatorio")
    @JsonProperty("Precio")
    private BigDecimal precio;
}
