package com.application.library.services;

import com.application.library.models.Reserve;

import java.util.List;

public interface IReserveService {
    List<Reserve> findAll();
    Reserve findById(Long id);
    void save(Reserve reserve);
    void deleteById(Long id);
    void update(Reserve reserve);
}
