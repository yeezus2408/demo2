package com.example.demo.repository;

import com.example.demo.entity.order;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class reposit {
    ArrayList<order> REPOS = new ArrayList<>(Arrays.asList(

    ));


    public void add(order ord){
        ord.setMaster("131312");
        ord.setStatus("Новая заявка");
        ord.setNumber(UUID.randomUUID());
        ord.setStartDate(LocalDate.now());
        REPOS.add(ord);
    }

    public order findByNumber(UUID num){
        return (order) REPOS.stream().filter(el -> Objects.equals(el.getNumber(), num));
    }

    public ArrayList<order> getAll(){
        return REPOS;
    }

    public void delete(UUID num){
        REPOS.remove(findByNumber(num));
    }

    public order update(UUID num, order updatedOrder){
        order buffer = findByNumber(num);
        updatedOrder.setNumber(buffer.getNumber());
        updatedOrder.setModel(buffer.getModel());
        updatedOrder.setFullName(buffer.getFullName());
        updatedOrder.setStartDate(buffer.getStartDate());
        updatedOrder.setTypeTechnic(buffer.getTypeTechnic());
        return updatedOrder;
    }
}
