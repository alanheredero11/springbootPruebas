package com.first.api.firstapirest.controller;

import com.first.api.firstapirest.model.Product;
import com.first.api.firstapirest.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        return productoService.getProductos();
    }

    @GetMapping("/getById")
    public Product getProductById(@RequestParam String id) {
        return productoService.getProductoById(id);
    }

    @PostMapping("save")
    public Product saveProducto(@RequestBody Product p) {
        return productoService.saveProducto(p);
    }

    @DeleteMapping("delete")
    public String deleteProducto(@RequestParam String id) {
        return productoService.deleteProducto(id);
    }

    @PutMapping("/update")
    public Product updateProducto(@RequestBody Product p) {
        return productoService.updateProducto(p);
    }


}
