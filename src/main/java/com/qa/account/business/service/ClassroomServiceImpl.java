package com.qa.account.business.service;

import com.qa.account.persistence.repo.ClassroomInterface;

import javax.inject.Inject;

public class ClassroomServiceImpl implements ClassroomService {
    @Inject
    private ClassroomInterface repo;

    @Override
    public String getAllClassrooms() {
        return repo.getAllClassrooms();
    }

    @Override
    public String getAllTrainees() {
        return repo.getAllTrainees();
    }

    @Override
    public String createUser(String account) {
        return repo.createUser(account);
    }

    @Override
    public String updateUser(Long classroomID, String classroomToUpdate) {
        return repo.updateUser(classroomID, classroomToUpdate);
    }

    @Override
    public String deleteUser(Long classroomID) {
        return repo.deleteUser(classroomID);
    }
}
