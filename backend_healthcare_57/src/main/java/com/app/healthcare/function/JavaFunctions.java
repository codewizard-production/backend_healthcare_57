package com.app.healthcare.function;

import com.app.healthcare.model.Patient;
import com.app.healthcare.model.Doctor;
import com.app.healthcare.model.Appointment;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.healthcare.repository.AppointmentRepository;
import com.app.healthcare.repository.PatientRepository;
import com.app.healthcare.repository.DoctorRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
