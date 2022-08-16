package ch6.action.impl;

import ch6.action.PatientActionsGeneric;
import ch6.entity.Inpatient;

public class InpatientGeneric implements PatientActionsGeneric<Inpatient> {
    @Override
    public void payForAnalysis() {
        System.out.println("You have to pay 15 bucks for analysis!");
    }

    @Override
    public void gettingPersonalInformation(Inpatient inpatient) {
        System.out.println(inpatient);
    }

    @Override
    public void registerPatient() {
        System.out.println("Inpatient was successfully registrated!");
    }
}
