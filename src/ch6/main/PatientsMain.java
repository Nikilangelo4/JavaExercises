package ch6.main;

import ch6.action.PatientActionsGeneric;
import ch6.action.impl.CovidPatientGeneric;
import ch6.action.impl.InfectiousPatientGeneric;
import ch6.action.impl.InpatientGeneric;
import ch6.entity.CovidPatient;
import ch6.entity.InfectiousPatient;
import ch6.entity.Inpatient;

public class PatientsMain {
    public static void main(String[] args) {
        CovidPatient covidPatient = new CovidPatient("Alex","Covid-19","London",23,1453164);
        PatientActionsGeneric<CovidPatient> covidPatientActionsGeneric = new CovidPatientGeneric();

        Inpatient inpatient = new Inpatient("John","Drug addicted","USA",32,1232142);
        PatientActionsGeneric<Inpatient> inpatientActionsGeneric = new InpatientGeneric();

        InfectiousPatient infectiousPatient = new InfectiousPatient("Max","AIDS","Toronto",23,122386);
        PatientActionsGeneric<InfectiousPatient> infectiousPatientActionsGeneric = new InfectiousPatientGeneric();

        System.out.println("Info about patients:");
        infectiousPatientActionsGeneric.gettingPersonalInformation(infectiousPatient);
        inpatientActionsGeneric.gettingPersonalInformation(inpatient);
        covidPatientActionsGeneric.gettingPersonalInformation(covidPatient);

    }
}