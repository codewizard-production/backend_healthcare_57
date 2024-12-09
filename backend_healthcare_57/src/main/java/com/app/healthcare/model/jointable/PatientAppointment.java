package com.app.healthcare.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.healthcare.model.Patient;
import com.app.healthcare.model.Doctor;
import com.app.healthcare.model.Appointment;

@Entity(name = "PatientAppointment")
@Table(schema = "\"healthcare\"", name = "\"PatientAppointment\"")
@Data
public class PatientAppointment{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PatientID\"")
	private Integer patientID;

    
    @Column(name = "\"AppointmentID\"")
    private Integer appointmentID;
 
}