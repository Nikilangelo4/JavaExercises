package ch6.action.impl;

import ch6.action.PatientActionsGeneric;
import ch6.entity.CovidPatient;

public class CovidPatientGeneric implements PatientActionsGeneric<CovidPatient> {
    @Override
    public void payForAnalysis() {
        System.out.println("Analysis if for free!");
    }

    @Override
    public void gettingPersonalInformation(CovidPatient covidPatient) {
        System.out.println(covidPatient);
    }

    @Override
    public void registerPatient() {
        System.out.println("Covid patient was successfully registrated!");
    }
}
