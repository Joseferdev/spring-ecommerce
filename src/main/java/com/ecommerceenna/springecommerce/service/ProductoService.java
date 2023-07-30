package com.ecommerceenna.springecommerce.service;

import com.ecommerceenna.springecommerce.model.Producto;

import java.util.Optional;

public interface ProductoService {
    public Producto save(Producto producto);
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);
}
