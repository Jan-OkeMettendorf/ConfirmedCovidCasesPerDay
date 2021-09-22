package de.neuefische.confirmedcovidcasesperday.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CovidApiCountryPerDay {

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Confirmed")
    private long confirmedCases;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getConfirmedCases() {
        return confirmedCases;
    }

    public void setConfirmedCases(long confirmedCases) {
        this.confirmedCases = confirmedCases;
    }
}
