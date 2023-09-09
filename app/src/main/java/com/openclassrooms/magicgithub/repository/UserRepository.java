package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser : Done

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // Done: A modifier
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // Done: A modifier
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // Done: A modifier
        apiService.deleteUser(user);
    }
}
