package com.enviro.assessment.grad._1.TreasureLottring.RestAPI.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.enviro.assessment.grad._1.TreasureLottring.RestAPI.model.*;
import com.enviro.assessment.grad._1.TreasureLottring.RestAPI.repository.*;

@Service
public class WasteCategoryService {
    
    @Autowired
    private WasteCategoryRepository wasteCategoryRepository;

    public List<WasteCategory> getAllWasteCategories() {
        return wasteCategoryRepository.findAll();
    }

    public WasteCategory getWasteCategoryById(Long id) {
        return wasteCategoryRepository.findById(id).orElse(null);
    }

    public WasteCategory saveWasteCategory(WasteCategory wasteCategory) {
        return wasteCategoryRepository.save(wasteCategory);
    }

    public void deleteWasteCategory(Long id) {
        wasteCategoryRepository.deleteById(id);
    }
}