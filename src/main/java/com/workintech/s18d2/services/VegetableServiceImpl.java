package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegetableServiceImpl implements VegetableService{

   private VegetableRepository vegetableRepository;

   @Autowired
   public VegetableServiceImpl(VegetableRepository vegetableRepository) {
       this.vegetableRepository=vegetableRepository;
   }


    @Override
    public List<Vegetable> getByPriceAsc() {
        return vegetableRepository.getByPriceAsc();
    }

    @Override
    public Vegetable getById(Long id) {
        Optional<Vegetable> optionalVegetable = vegetableRepository.findById(id);
        return optionalVegetable.get();
    }

    @Override
    public List<Vegetable> getByPriceDesc() {
        return vegetableRepository.getByPriceDesc();
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public List<Vegetable> searchByName(String name) {
        return vegetableRepository.searchByName(name);
    }

    @Override
    public Vegetable delete(Long id) {
        Optional<Vegetable> optionalVegetable = vegetableRepository.findById(id);
        vegetableRepository.delete(optionalVegetable.get());
        return optionalVegetable.get();
    }
}
