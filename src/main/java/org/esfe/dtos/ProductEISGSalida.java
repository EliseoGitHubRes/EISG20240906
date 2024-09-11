package org.esfe.dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductEISGSalida implements Serializable {
    private Integer id;

    private String nombreEISG;

    private String descripcionEISG;

    private BigDecimal precio;
}
