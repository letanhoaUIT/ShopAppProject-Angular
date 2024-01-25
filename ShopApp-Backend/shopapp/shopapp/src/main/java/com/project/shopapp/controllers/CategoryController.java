package com.project.shopapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.shopapp.dtos.CategoryDTO;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
    //hien tat ca cac categories
    @GetMapping("") //http://localhost:8089/api/v1/categories?=1&limit=10
    public ResponseEntity<String> getAllCategories(
            @RequestParam("page")   int page,
            @RequestParam("limit")  int limit
    ) {
        return ResponseEntity.ok(String.format("getAllCategories, page = %d, limit = %d", page, limit));
    }

    @PostMapping("")
    //Neu tham số truyền vào là 1 object thì sao? => Data Transfer Object = Request Object
    public ResponseEntity<String> insertCategory(@RequestBody CategoryDTO categoryDTO) {
        return ResponseEntity.ok("This is insertCategory");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategory(@PathVariable Long id) {
        return ResponseEntity.ok("insertCategory with id = "+id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        return ResponseEntity.ok("deleteCategory with id = "+id);
    }

}
