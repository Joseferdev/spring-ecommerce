package com.ecommerceenna.springecommerce.service;

import com.ecommerceenna.springecommerce.model.Producto;
import com.ecommerceenna.springecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProductoServiceImplementacion implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        productoRepository.findById(id);
    }
}
