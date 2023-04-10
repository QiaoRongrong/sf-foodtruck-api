package com.foodtrucks.foodtrucksapi.repo;

import com.foodtrucks.foodtrucksapi.domain.FoodTruck;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodTruckRepository extends PagingAndSortingRepository<FoodTruck, Integer> {

//    @Override
//    List<FoodTruck> findAll(Pageable pageable);

    List<FoodTruck> findAllByAddress(String address);
    List<FoodTruck> findAllByAddressAndFoodItemsLike(String address, String foodItem, Pageable pageable);
    List<FoodTruck> findAllByAddressContainsOrFoodItemsContains(String address, String foodItem, Pageable pageable);

}