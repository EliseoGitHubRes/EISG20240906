package org.esfe.dtos.producteisg;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductEISGSalida implements Serializable {
    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("Nombre")
    private String nombreEISG;

    @JsonProperty("Descripción")
    private String descripcionEISG;

    @JsonProperty("Precio")
    private BigDecimal precio;
}
