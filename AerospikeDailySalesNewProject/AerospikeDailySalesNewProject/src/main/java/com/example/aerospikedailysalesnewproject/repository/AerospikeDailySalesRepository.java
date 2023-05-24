package com.example.aerospikedailysalesnewproject.repository;

import com.example.aerospikedailysalesnewproject.model.DailySales;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.data.repository.CrudRepository;

public interface AerospikeDailySalesRepository extends AerospikeRepository<DailySales, Integer>, CrudRepository<DailySales, Integer> {
}
