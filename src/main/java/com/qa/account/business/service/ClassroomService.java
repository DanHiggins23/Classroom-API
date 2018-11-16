package com.qa.account.business.service;

public interface ClassroomService {
    String getAllClassrooms();
    String createUser(String jsonString);
    String updateUser(Long classroomID, String jsonString);
    String deleteUser(String jsonString);
}
