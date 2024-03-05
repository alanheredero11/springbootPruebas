package com.first.api.firstapirest.repository;

import com.first.api.firstapirest.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public interface ProductoRepository extends MongoRepository<Product, String> {

    Product findFirstById(String id);


/*
    private List<Product> productos = new ArrayList<>();

    //Listar todos los productos
    public List<Product> getAllProductos() {
        return productos;
    }

    //Buscar un producto
    public Product findById(String id) {
        return productos.stream().filter(producto -> producto.getId() == id).findFirst().orElse(null);
    }

    //Buscar por nombre
    public List<Product> search(String nombre) {
        return productos.stream().filter(producto -> producto.getName().contains(nombre)).collect(Collectors.toList());
    }

    //Save producto
    public Product save(Product p) {
        Product producto = new Product();
        producto.setId(p.getId());
        producto.setName(p.getName());
        producto.setAmount(p.getAmount());
        producto.setPrice(p.getPrice());

        productos.add(producto);
        return producto;
    }

    //Delete product
    public String delete(String id) {
        productos.removeIf(producto -> producto.getId() == id);
        return null;
    }

    //Update product
    public Product update(Product producto) {
        Product productToEdit = productos.stream().filter(p -> p.getId() == producto.getId()).findFirst().orElse(null);

        if(productToEdit != null) {
            productToEdit.setName(producto.getName());
            productToEdit.setAmount(producto.getAmount());
            productToEdit.setPrice(producto.getPrice());
            return productToEdit;
        }

        return null;
    }
*/
}
