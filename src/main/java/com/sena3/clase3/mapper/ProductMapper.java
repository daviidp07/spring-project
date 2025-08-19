package com.sena3.clase3.mapper;

import java.util.List;

import com.sena3.clase3.dto.ProductDto;
import com.sena3.clase3.models.Product;

public interface ProductMapper {
    Product consultProduct(ProductDto productDto);

    ProductDto consultDto(Product product);

    List<ProductDto> ListDtoProduct(List<Product> product);

    void updateProduct(Product product, ProductDto productDto);
}
