package com.qa.account.persistence.repo;

public interface ClassroomInterface {
    String getAllClassrooms();
    String createUser(String jsonString);
    String updateUser(String jsonString);
    String deleteUser(String jsonString);
}
