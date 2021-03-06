package com.qa.account.business.service;

public interface ClassroomService {
    String getAllClassrooms();
    String getAllTrainees();
    String createUser(String jsonString);
    String updateUser(Long classroomID, String classroomToUpdate);
    String deleteUser(Long classroomID);
}
