package com.spring.taco.converter;

import com.spring.taco.model.Ingredient;
import com.spring.taco.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class IngredientById implements Converter<String, Ingredient> {
    private IngredientRepository ingredientRepo;

    @Autowired
    public IngredientById(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo; }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}
