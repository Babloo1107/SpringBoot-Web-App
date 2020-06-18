package com.nt.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entities.OrderDtlsEntity;

public interface OrderDtlsRepositries extends JpaRepository<OrderDtlsEntity, Serializable> {

}
