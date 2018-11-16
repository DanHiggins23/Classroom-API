package com.qa.account.persistence.repo;

import com.qa.account.persistence.domain.Classroom;
import com.qa.account.util.JSONUtil;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepo implements ClassroomInterface {
    @PersistenceContext(unitName = "primary")
    private EntityManager em;

    @Inject
    private JSONUtil util;

    @Override
    public String getAllClassrooms() {
        TypedQuery<Classroom> query = em.createQuery("SELECT c FROM Classroom c  ORDER BY c.classroomID ASC", Classroom.class);
        return util.getJSONForObject(query.getResultList());
    }

    @Override
    @Transactional(REQUIRED)
    public String createUser(String jsonString) {
        Classroom newClassroom = util.getObjectForJSON(jsonString, Classroom.class);
        em.persist(newClassroom);
        return "{message: account created}";
    }

    @Override
    @Transactional(REQUIRED)
    public String updateUser(Long classroomID, String classroomToUpdate) {
        Classroom updatedClassroom = util.getObjectForJSON(classroomToUpdate, Classroom.class);
        Classroom classroomFromDB = findAccount(classroomID);
        classroomFromDB = updatedClassroom;
        em.merge(classroomFromDB);
        return "{message: account updated}";
    }

    @Override
    @Transactional(REQUIRED)
    public String deleteUser(Long classroomID) {
        Classroom classroomFromDB = findAccount(classroomID);
        em.remove(classroomFromDB);
        return "{message: account deleted}";
    }

    public Classroom findAccount(Long classroomID) {
        return em.find(Classroom.class, classroomID);
    }
}
