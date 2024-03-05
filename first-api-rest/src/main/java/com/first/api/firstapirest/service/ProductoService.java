package com.first.api.firstapirest.service;


import com.first.api.firstapirest.model.Product;
import com.first.api.firstapirest.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Product saveProducto(Product producto) {
        return productoRepository.save(producto);
    }

    public List<Product> getProductos() {
        return productoRepository.findAll();
    }

    public Product getProductoById(String id) {
        return productoRepository.findFirstById(id);
    }

    public String deleteProducto(String id) {
        productoRepository.deleteById(id);
        return "Success delected";
    }

    public Product updateProducto(Product producto) {
        return productoRepository.save(producto);
    }
}
