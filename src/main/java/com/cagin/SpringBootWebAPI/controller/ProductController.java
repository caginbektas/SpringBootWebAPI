package com.cagin.SpringBootWebAPI.controller;

import com.cagin.SpringBootWebAPI.model.Product;
import com.cagin.SpringBootWebAPI.repository.ProductRepository;
import com.cagin.SpringBootWebAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @ExceptionHandler(value = MultipartException.class)
    @PostMapping("/createProduct")
    public Product createProduct(@Valid @RequestBody Product product){
        return productService.save(product);
    }
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }
    @GetMapping("/getProductById/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable(value = "id") Long productId){
        Product product = productService.findOne(productId);

        if (product==null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().body(product);
    }
    @PutMapping("/updateProductById/{id}")
    public ResponseEntity<Product> updateProductById(@PathVariable(value = "id") Long productId, @Valid @RequestBody Product product){
        Product oldProduct = productService.findOne(productId);

        if(oldProduct==null)
            return ResponseEntity.notFound().build();

        oldProduct.setName(product.getName());
        oldProduct.setImgUri(product.getImgUri());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setCurrency(product.getCurrency());
        oldProduct.setDescription(product.getDescription());

        Product updatedProduct = productService.save(oldProduct);
        return ResponseEntity.ok().body(updatedProduct);
    }
    @DeleteMapping("/deleteProductById/{id}")
    public ResponseEntity<Product> deleteProductById(@PathVariable(value = "id") Long productId){
        Product deleteProduct = productService.findOne(productId);

        if (deleteProduct==null)
            return ResponseEntity.notFound().build();

        productService.delete(deleteProduct);
        return ResponseEntity.ok().build();
    }
}
