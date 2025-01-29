package com.enviro.assessment.grad._1.TreasureLottring.RestAPI.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.enviro.assessment.grad._1.TreasureLottring.RestAPI.model.*;
import com.enviro.assessment.grad._1.TreasureLottring.RestAPI.service.*;

@RestController
@RequestMapping("/api/waste-categories")
public class WasteCategoryController {
    @Autowired
    private WasteCategoryService wasteCategoryService;

    @GetMapping
    public List<WasteCategory> getAllWasteCategories() {
        return wasteCategoryService.getAllWasteCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getWasteCategoryById(@PathVariable Long id) {
        WasteCategory wasteCategory = wasteCategoryService.getWasteCategoryById(id);
        return ResponseEntity.ok(wasteCategory);
    }

    @PostMapping
    public WasteCategory createWasteCategory(@RequestBody WasteCategory wasteCategory) {
        return wasteCategoryService.saveWasteCategory(wasteCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteWasteCategory(@PathVariable Long id) {
        wasteCategoryService.deleteWasteCategory(id);
    }
}
