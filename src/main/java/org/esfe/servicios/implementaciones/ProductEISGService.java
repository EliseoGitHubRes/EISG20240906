package org.esfe.servicios.implementaciones;
import org.esfe.dtos.producteisg.ProductEISGEditar;
import org.esfe.dtos.producteisg.ProductEISGGuardar;
import org.esfe.dtos.producteisg.ProductEISGSalida;
import org.esfe.modelos.ProductEISG;
import org.esfe.repositorios.IProductEISGRepository;
import org.esfe.servicios.interfaces.IProductEISGService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductEISGService implements IProductEISGService {

    @Autowired
    private IProductEISGRepository productEISGRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductEISGSalida> obtenerTodos() {
        List<ProductEISG> productsEISGS = productEISGRepository.findAll();

        return productsEISGS.stream()
                .map(productEISGS -> modelMapper.map(productEISGS, ProductEISGSalida.class))
                .collect(Collectors.toList());
    }

    @Override
    public Page<ProductEISGSalida> obtenerTodosPaginados(Pageable pageable) {
        Page<ProductEISG> page = productEISGRepository.findAll(pageable);

        List<ProductEISGSalida> productEISGSDto = page.stream()
                .map(productEISGS -> modelMapper.map(productEISGS, ProductEISGSalida.class))
                .collect(Collectors.toList());

        return new PageImpl<>(productEISGSDto, page.getPageable(), page.getTotalElements());
    }

    @Override
    public ProductEISGSalida obtenerPorId(Integer id) {
        return modelMapper.map(productEISGRepository.findById(id).get(), ProductEISGSalida.class);
    }

    @Override
    public ProductEISGSalida crear(ProductEISGGuardar productEISGGuardar) {
        ProductEISG productEISGS = productEISGRepository.save(modelMapper.map(productEISGGuardar, ProductEISG.class));
        return modelMapper.map(productEISGS, ProductEISGSalida.class);
    }

    @Override
    public ProductEISGSalida editar(ProductEISGEditar productEISGEditar) {
        ProductEISG productEISGS = productEISGRepository.save(modelMapper.map(productEISGEditar, ProductEISG.class));
        return modelMapper.map(productEISGS, ProductEISGSalida.class);
    }

    @Override
    public void eliminarPorId(Integer id) {
        productEISGRepository.deleteById(id);
    }
}
