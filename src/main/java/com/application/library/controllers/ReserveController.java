package com.application.library.controllers;

import com.application.library.models.Reserve;
import com.application.library.services.IReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reserve")
public class ReserveController {
    @Autowired
    IReserveService reserveService;

    @GetMapping("/find")
    public List<Reserve> findAll(){
        return reserveService.findAll();
    }
    @GetMapping("/find/{id}")
    public Reserve findById(@PathVariable Long id){
        return reserveService.findById(id);
    }
    @PostMapping("/create")
    public String createReserve(@RequestBody Reserve reserve){
        reserveService.save(reserve);
        return "Reservacion creada...";
    }
    @DeleteMapping("/delete")
    public String deleteReserve(@RequestParam Long id){
        reserveService.deleteById(id);
        return "Reservacion eliminada...";
    }
    @PutMapping("/update")
    public String updateReserve(@RequestBody Reserve reserve){
        reserveService.update(reserve);
        return "Reservacion actualizada...";
    }
}
