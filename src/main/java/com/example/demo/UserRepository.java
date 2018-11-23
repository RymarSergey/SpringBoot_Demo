package com.example.demo;/*
 *
 *autor Sergey on 24.11.2018 0:49
 */

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path="user")
public interface UserRepository extends PagingAndSortingRepository<User,Integer> {
    List<User> findAll();
}
