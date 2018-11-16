package com.qa.account.persistence.repo;

import com.qa.account.persistence.domain.Classroom;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import static javax.transaction.Transactional.TxType.SUPPORTS;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepo implements ClassroomInterface {
    @PersistenceContext(unitName = "primary")
    private EntityManager em;

    @Inject
    private JSONUTIL util;

    @Override
    public String getAllClassrooms() {
        TypedQuery<Classroom> query = em.createQuery("SELECT c FROM Classroom c  ORDER BY c.classroomID ASC", Classroom.class);
        return null;
    }

    @Override
    public String createUser(String jsonString) {
        return null;
    }

    @Override
    public String updateUser(String jsonString) {
        return null;
    }

    @Override
    public String deleteUser(String jsonString) {
        return null;
    }
}
