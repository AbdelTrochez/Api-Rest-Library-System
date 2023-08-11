package com.application.library.repositories;

import com.application.library.models.Reserve;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReserveRespository extends CrudRepository<Reserve, Long> {

}
