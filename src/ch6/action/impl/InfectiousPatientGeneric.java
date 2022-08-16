package ch6.action.impl;

import ch6.action.PatientActionsGeneric;
import ch6.entity.InfectiousPatient;

public class InfectiousPatientGeneric implements PatientActionsGeneric<InfectiousPatient> {
    @Override
    public void payForAnalysis() {
        System.out.println("You have to pay 5 bucks for analysis!");
    }

    @Override
    public void gettingPersonalInformation(InfectiousPatient infectiousPatient) {
        System.out.println(infectiousPatient);
    }

    @Override
    public void registerPatient() {
        System.out.println("Infectious patient was successfully registrated!");
    }
}
