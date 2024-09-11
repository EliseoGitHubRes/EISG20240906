package org.esfe.dtos;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductEISGEditar  implements Serializable {
    private Integer id;

    private String nombreEISG;

    private String descripcionEISG;

    private BigDecimal precio;
}
