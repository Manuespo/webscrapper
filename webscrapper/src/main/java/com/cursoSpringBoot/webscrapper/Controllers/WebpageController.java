package com.cursoSpringBoot.webscrapper.Controllers;

import com.cursoSpringBoot.webscrapper.Models.Webpage;
import com.cursoSpringBoot.webscrapper.Repository.WebpageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebpageController {

    @Autowired
    WebpageRepository repository;
    @GetMapping("/api/search")
    public List<Webpage> search(@RequestParam("query") String query) {
        List<Webpage> list= new ArrayList<>();
        Iterable<Webpage> result = repository.findByText(query);
        for (Webpage webpage : result) {
            list.add(webpage);
        }
        return list;
    }
}
