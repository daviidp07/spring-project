package com.sena3.clase3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena3.clase3.dto.ProductDto;
import com.sena3.clase3.mapper.ProductMapper;
import com.sena3.clase3.models.Product;
import com.sena3.clase3.repositories.ProductoRepository;

@Service
public class ProductServiceImple implements ProductServices {
  @Autowired
  private ProductoRepository productRepo;

  @Autowired
  private ProductMapper productMapper;

  @Override
  public ProductDto getProduct(Integer id){
    Product product = productRepo.findById(id).get();
    return productMapper.consultDto(product);
  }

  @Override
  public ProductDto saveProduct(ProductDto productDto){
    Product product = productMapper.consultProduct(productDto);
    return productMapper.consultDto(productRepo.save(product));
  }

  @Override
  public List<ProductDto> getProducts(){
    List<Product> Products = productRepo.findAll();
    return productMapper.listDtoProduct(Products);
  }

  @Override
  public ProductDto updateProduct(Integer id, ProductDto productDto) {
    Product product = productRepo.findById(id).get();
    productMapper.updateProduct(product, productDto);
    return productMapper.consultDto(productRepo.save(product));
  }

  @Override
  public ProductDto deleteProduct(Integer id) {
    Product product = productRepo.findById(id).get();
    productRepo.delete(product);
    return productMapper.consultDto(product);
  }

}