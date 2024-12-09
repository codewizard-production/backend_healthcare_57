package com.app.healthcare.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.healthcare.model.Patient;
import com.app.healthcare.model.Doctor;
import com.app.healthcare.model.Appointment;
import com.app.healthcare.converter.DurationConverter;
import com.app.healthcare.converter.UUIDToByteConverter;
import com.app.healthcare.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Patient")
@Table(name = "\"Patient\"", schema =  "\"healthcare\"")
@Data
                        
public class Patient {
	public Patient () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"PatientID\"", nullable = true )
  private Integer patientID;
	  
  @Column(name = "\"PatientName\"", nullable = true )
  private String patientName;
  
	  
  @Column(name = "\"PatientAge\"", nullable = true )
  private Integer patientAge;
  
	  
  @Column(name = "\"ContactInfo\"", nullable = true )
  private Integer contactInfo;
  
	  
  @Column(name = "\"Dob\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date dob;  
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PatientAppointment\"",
            joinColumns = @JoinColumn( name="\"PatientID\""),
            inverseJoinColumns = @JoinColumn( name="\"AppointmentID\""), schema = "\"healthcare\"")
private List<Appointment> appointment = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Patient [" 
  + "PatientID= " + patientID  + ", " 
  + "PatientName= " + patientName  + ", " 
  + "PatientAge= " + patientAge  + ", " 
  + "ContactInfo= " + contactInfo  + ", " 
  + "Dob= " + dob 
 + "]";
	}
	
}