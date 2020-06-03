/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.app.io.entities.ProductEntity;
import com.richard.app.ws.ui.models.responses.Notification;

/**
 * @author richard
 *
 */
@RestController
@RequestMapping("/ws/products")
public class ProductController {

 private static Map<String, ProductEntity> productRepo = new HashMap<>();

 static {
  ProductEntity honey = new ProductEntity();
  honey.setId("1");
  honey.setName("Honey");
  productRepo.put(honey.getId(), honey);

  ProductEntity almond = new ProductEntity();
  almond.setId("2");
  almond.setName("Almond");
  productRepo.put(almond.getId(), almond);
 }

 @GetMapping
 public ResponseEntity<Object> getProduct() {
  return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
 }

 @PostMapping("/add-product")
 public ResponseEntity<Object> createProduct(@RequestBody ProductEntity product) {
  productRepo.put(product.getId(), product);
  return new ResponseEntity<>(new Notification(HttpStatus.CREATED.toString(), "Product is created successfully"), HttpStatus.CREATED);
 }

 @PutMapping("/{id}")
 public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody ProductEntity product) {
  productRepo.remove(id);
  product.setId(id);
  productRepo.put(id, product);
  return new ResponseEntity<>(new Notification(HttpStatus.OK.toString(), "Product is updated successsfully"), HttpStatus.OK);
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<Object> delete(@PathVariable("id") String id) {
  productRepo.remove(id);
  return new ResponseEntity<>(new Notification(HttpStatus.OK.toString(), "Product is deleted successsfully"), HttpStatus.OK);
 }

}
