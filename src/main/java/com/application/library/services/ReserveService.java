package com.application.library.services;

import com.application.library.models.Reserve;
import com.application.library.repositories.IReserveRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReserveService implements IReserveService{
    @Autowired
    IReserveRespository reserveRespository;

    @Override
    public List<Reserve> findAll() {
        return (List<Reserve>) reserveRespository.findAll();
    }

    @Override
    public Reserve findById(Long id) {
        return reserveRespository.findById(id).orElse(null);
    }

    @Override
    public void save(Reserve reserve) {
        reserveRespository.save(reserve);
    }

    @Override
    public void deleteById(Long id) {
        reserveRespository.deleteById(id);
    }

    @Override
    public void update(Reserve reserve) {
        Reserve newReserve = findById(reserve.getId());
        newReserve.setReservationDate(reserve.getReservationDate());
        this.save(newReserve);
    }
}
