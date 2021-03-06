package com.qa.account.persistence.repo;

public interface ClassroomInterface {
    String getAllClassrooms();
    String getAllTrainees();
    String createUser(String jsonString);
    String updateUser(Long classroomID, String classroomToUpdate);
    String deleteUser(Long classroomID);
}
