package com.graficoeweb.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
