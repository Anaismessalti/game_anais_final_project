package com.example.test.controller;

import com.example.test.models.Info;
import com.example.test.models.TestModel;
import com.example.test.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping
public class TestController {

    @Autowired
    TestRepository testRepository;

    @RequestMapping(value = "/get/{id}")
    public TestModel getToyById(@PathVariable int id) throws Exception {

        return testRepository.findById(id)
                .orElseThrow(() -> new Exception());
    }

    @RequestMapping(value = "/getAll")
    public List<TestModel> getAllToys(){
        List<TestModel> toys = new ArrayList<TestModel>();
        testRepository.findAll().forEach(toy -> toys.add(toy));
        return toys;
    }

    @RequestMapping(value = "/totalprice")
    public double getTotalPrice(){
        List<TestModel> toys = new ArrayList<TestModel>();
        testRepository.findAll().forEach(toy -> toys.add(toy));
        double price = 0.00;
        for(int i = 0; i< toys.toArray().length; i++){
            price = price + toys.get(i).getPrice();
        }
        return price;
    }

    @RequestMapping(value = "/info")
    public Info InfogetInfo(){
        Info inf = new Info("Anaïs Messalti", "62495", 6, " 26/04/2022");

        return inf;
    }
}
