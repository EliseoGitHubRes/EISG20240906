package org.esfe.dtos.producteisg;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductEISGSalida implements Serializable {
    @JsonProperty("Id")
    private Integer id;

    @NotBlank(message = "El nombre es obligatorio")
    @JsonProperty("Nombre")
    private String nombreEISG;

    @JsonProperty("Descripción")
    private String descripcionEISG;

    @NotNull(message = "El precio es obligatorio")
    @JsonProperty("Precio")
    private BigDecimal precio;
}
