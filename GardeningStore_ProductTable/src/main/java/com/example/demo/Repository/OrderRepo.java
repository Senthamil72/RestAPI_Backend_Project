package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Ordermodel;

public interface OrderRepo extends JpaRepository<Ordermodel, Integer>{

}
