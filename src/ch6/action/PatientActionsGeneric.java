package ch6.action;

import ch6.entity.AbstractPatient;

public interface PatientActionsGeneric<T extends AbstractPatient> {
    void payForAnalysis();
    void gettingPersonalInformation(T t);
    void registerPatient();
}
