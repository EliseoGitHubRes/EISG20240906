package org.esfe.controladores;
import org.esfe.dtos.producteisg.ProductEISGEditar;
import org.esfe.dtos.producteisg.ProductEISGGuardar;
import org.esfe.dtos.producteisg.ProductEISGSalida;
import org.esfe.servicios.interfaces.IProductEISGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductEISGController {
    @Autowired
    private IProductEISGService productEISGService;

    @GetMapping
    public ResponseEntity<Page<ProductEISGSalida>> mostrarTodosPaginados(Pageable pageable){
        Page<ProductEISGSalida> productsEISG = productEISGService.obtenerTodosPaginados(pageable);
        if(productsEISG.hasContent()){
            return ResponseEntity.ok(productsEISG);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/lista")
    public ResponseEntity<List<ProductEISGSalida>> mostrarTodos(){
        List<ProductEISGSalida> productsEISG = productEISGService.obtenerTodos();
        if(!productsEISG.isEmpty()){
            return ResponseEntity.ok(productsEISG);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEISGSalida> buscarPorId(@PathVariable Integer id){
        ProductEISGSalida productEISG = productEISGService.obtenerPorId(id);

        if(productEISG != null){
            return ResponseEntity.ok(productEISG);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ProductEISGSalida> crear(@RequestBody ProductEISGGuardar productEISGGuardar){
        ProductEISGSalida productEISG = productEISGService.crear(productEISGGuardar);
        return ResponseEntity.ok(productEISG);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductEISGSalida> editar(@PathVariable Integer id, @RequestBody ProductEISGEditar productEISGEditar){
        ProductEISGSalida productEISG = productEISGService.editar(productEISGEditar);
        return ResponseEntity.ok(productEISG);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminar(@PathVariable Integer id){
        productEISGService.eliminarPorId(id);
        return ResponseEntity.ok("Producto eliminado correctamente");
    }
}
