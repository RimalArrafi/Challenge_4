package com.example.BinarFud.repository;

import com.example.BinarFud.entity.Order;
import com.example.BinarFud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
