package org.esfe.dtos.producteisg;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductEISGGuardar implements Serializable{
    private String nombreEISG;

    private String descripcionEISG;

    private BigDecimal precio;
}
