package org.esfe.dtos.producteisg;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductEISGGuardar implements Serializable{
    @JsonProperty("Nombre")
    private String nombreEISG;

    @JsonProperty("Descripción")
    private String descripcionEISG;

    @JsonProperty("Precio")
    private BigDecimal precio;
}
