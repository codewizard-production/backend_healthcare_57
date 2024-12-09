package com.app.healthcare.repository;

import com.app.healthcare.model.Doctor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class DoctorRepository extends SimpleJpaRepository<Doctor, String> {
    private final EntityManager em;
    public DoctorRepository(EntityManager em) {
        super(Doctor.class, em);
        this.em = em;
    }
    @Override
    public List<Doctor> findAll() {
        return em.createNativeQuery("Select * from \"healthcare\".\"Doctor\"", Doctor.class).getResultList();
    }
}