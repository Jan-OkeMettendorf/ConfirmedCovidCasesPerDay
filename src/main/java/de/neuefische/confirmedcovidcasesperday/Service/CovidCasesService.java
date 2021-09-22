package de.neuefische.confirmedcovidcasesperday.Service;

import de.neuefische.confirmedcovidcasesperday.api.CovidCasesApi;
import de.neuefische.confirmedcovidcasesperday.model.CovidCasesPerDay;
import de.neuefische.confirmedcovidcasesperday.model.api.CovidApiCountryPerDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CovidCasesService {

    private CovidCasesApi covidCasesApi;
    private CovidCasesMapper covidCasesMapper;

    @Autowired
    public CovidCasesService(CovidCasesApi covidCasesApi, CovidCasesMapper covidCasesMapper) {
        this.covidCasesApi = covidCasesApi;
        this.covidCasesMapper = covidCasesMapper;
    }

    public List<CovidCasesPerDay> list(){

        CovidApiCountryPerDay[] covidApiCountryPerDays = covidCasesApi.getCovidApiCountryPerDay();

        List<CovidCasesPerDay> covidCasesPerDay = covidCasesMapper.mapToCovidCasesPerDay(covidApiCountryPerDays);

        return covidCasesPerDay;
    }
}
