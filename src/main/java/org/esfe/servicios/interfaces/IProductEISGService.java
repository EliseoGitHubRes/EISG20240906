package org.esfe.servicios.interfaces;
import org.esfe.dtos.producteisg.ProductEISGEditar;
import org.esfe.dtos.producteisg.ProductEISGGuardar;
import org.esfe.dtos.producteisg.ProductEISGSalida;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
public interface IProductEISGService {
    List<ProductEISGSalida> obtenerTodos();

    Page<ProductEISGSalida> obtenerTodosPaginados(Pageable pageable);

    ProductEISGSalida obtenerPorId(Integer id);

    ProductEISGSalida crear(ProductEISGGuardar productEISGGuardar);

    ProductEISGSalida editar(ProductEISGEditar productEISGEditar);

    void eliminarPorId(Integer id);
}
