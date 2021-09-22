package de.neuefische.confirmedcovidcasesperday.Service;

import de.neuefische.confirmedcovidcasesperday.model.CovidCasesPerDay;
import de.neuefische.confirmedcovidcasesperday.model.api.CovidApiCountryPerDay;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CovidCasesMapper {

    public List<CovidCasesPerDay> mapToCovidCasesPerDay(CovidApiCountryPerDay[] covidApiCountryPerDays){

        List<CovidCasesPerDay> covidCasesPerDays = new ArrayList<>();

        for (CovidApiCountryPerDay covidApiCountryPerDay : covidApiCountryPerDays ) {
            CovidCasesPerDay covidCasesPerDay = new CovidCasesPerDay(
                    covidApiCountryPerDay.getDate(),
                    covidApiCountryPerDay.getConfirmedCases()
            );
            covidCasesPerDays.add(covidCasesPerDay);
        }
        return covidCasesPerDays;
    }

}
