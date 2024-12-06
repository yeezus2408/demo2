package com.example.demo.controllers;

import com.example.demo.entity.order;
import com.example.demo.repository.reposit;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class MainController {
    private reposit repo;

    @GetMapping("/getAll")
    public String getAll(Model model){
        model.addAttribute("orders", repo.getAll());
        return "getAll";
    }

    @PostMapping("/create")
    public void create(order order){
        repo.add(order);
    }

    @GetMapping("/find/{id}")
    public order findBId(@RequestParam UUID id){
        return repo.findByNumber(id);
    }

    @PostMapping("/delete/{id}")
    public void delete(@RequestParam UUID id){
        repo.delete(id);
    }

    @PostMapping("/update/{id}")
    public void update(@RequestParam UUID id, order newOrder){
        repo.update(id, newOrder);
    }

}
