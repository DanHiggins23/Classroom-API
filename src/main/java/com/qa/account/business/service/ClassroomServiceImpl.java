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
    public String createUser(String account) {
        return repo.createUser(account);
    }

    @Override
    public String updateUser(String account) {
        return repo.updateUser(account);
    }

    @Override
    public String deleteUser(String account) {
        return repo.deleteUser(account);
    }
}
