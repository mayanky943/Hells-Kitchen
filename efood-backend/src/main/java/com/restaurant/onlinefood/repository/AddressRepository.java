package com.restaurant.onlinefood.repository;

import com.restaurant.onlinefood.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
