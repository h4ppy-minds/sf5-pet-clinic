package com.springboot.sf5petclinic.services;

import com.springboot.sf5petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);

}
