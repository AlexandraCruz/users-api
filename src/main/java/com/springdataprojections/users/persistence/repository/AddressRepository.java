package com.springdataprojections.users.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdataprojections.users.persistence.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
