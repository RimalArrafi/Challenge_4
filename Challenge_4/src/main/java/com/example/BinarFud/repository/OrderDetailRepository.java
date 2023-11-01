package com.example.BinarFud.repository;

import com.example.BinarFud.entity.OrderDetail;
import com.example.BinarFud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, UUID> {
}
