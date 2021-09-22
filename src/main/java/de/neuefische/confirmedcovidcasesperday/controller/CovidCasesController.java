package de.neuefische.confirmedcovidcasesperday.controller;

import de.neuefische.confirmedcovidcasesperday.Service.CovidCasesService;
import de.neuefische.confirmedcovidcasesperday.model.CovidCasesPerDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("covidcases")
public class CovidCasesController {

    private final CovidCasesService covidCasesService;

    @Autowired
    public CovidCasesController(CovidCasesService covidCasesService) {
        this.covidCasesService = covidCasesService;
    }

    @GetMapping
    public List<CovidCasesPerDay> getList(){
        return covidCasesService.list();
    }
}
