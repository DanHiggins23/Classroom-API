package com.qa.account.persistence.repo;

public interface ClassroomInterface {
    String getAllClassrooms();
    String createUser(String jsonString);
    String updateUser(Long classroomID, String jsonString);
    String deleteUser(String jsonString);
}
