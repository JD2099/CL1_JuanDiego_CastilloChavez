package com.juandiego.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.juandiego.model.Laptop;

public interface ILaptopRepository extends JpaRepository<Laptop, String>{

}
