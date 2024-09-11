package org.esfe.dtos.producteisg;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductEISGEditar  implements Serializable {
    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("Nombre")
    private String nombreEISG;

    @JsonProperty("Descripción")
    private String descripcionEISG;

    @JsonProperty("Precio")
    private BigDecimal precio;
}
