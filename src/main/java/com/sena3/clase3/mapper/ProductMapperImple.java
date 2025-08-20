package com.sena3.clase3.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sena3.clase3.dto.ProductDto;
import com.sena3.clase3.models.Product;

@Component
public class ProductMapperImple implements ProductMapper{

    @Override
    public Product consultProduct(ProductDto productDto){
    if (productDto == null){
        return null;
    }
    Product product = new Product();
    product.setId_producto(productDto.getId());
    product.setCategoria(productDto.getCat());
    product.setNombre(productDto.getNam());
    product.setPrecio(productDto.getPri());
    return product;
    }

    @Override
    public ProductDto consultDto(Product product){
    if ( product == null) {
        return null;
    }
    ProductDto productDto = new ProductDto();
    productDto.setId(product.getId_producto());
    productDto.setCat(product.getCategoria());
    productDto.setNam(product.getNombre());
    productDto.setPri(product.getPrecio());
    return productDto;
    }

    @Override
    public List<ProductDto> listDtoProduct(List<Product> product) {
    if (product == null) {
        return null;
    }
    List<ProductDto> productDto = new ArrayList<ProductDto>(product.size());
    for (Product products : product) {
        productDto.add(consultDto(products));
    }
    return productDto;
    }

    @Override
    public void updateProduct(Product product, ProductDto productDto) {
    if (productDto == null) {
        return;
    }
    product.setCategoria(productDto.getCat());
    product.setNombre(productDto.getNam());
    product.setPrecio(productDto.getPri());
    }
}
