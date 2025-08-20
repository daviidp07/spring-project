package com.sena3.clase3.services;

import java.util.List;

import com.sena3.clase3.dto.ProductDto;

public interface ProductServices {
  public ProductDto getProduct(Integer id);
  public ProductDto saveProduct(ProductDto productDto);
  public List<ProductDto> getProducts();
  public ProductDto updateProduct(Integer id, ProductDto productDto);
  public ProductDto deleteProduct(Integer id);
}
