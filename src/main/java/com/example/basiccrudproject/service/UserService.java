package com.example.basiccrudproject.service;

import com.example.basiccrudproject.exception.ClientNotFoundException;
import com.example.basiccrudproject.model.User;
import com.example.basiccrudproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllClients() {
        return userRepository.findAll();
    }

    public User getClientById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() ->
                        new ClientNotFoundException("Client not found with id: " + id));
    }

    public List<User> getClientsByFullName(String name) {
        return userRepository.findByFullName(name);
    }

    public List<User> getClientsByStatus(String status) {
        return userRepository.findByStatus(status);
    }

    public List<User> getClientsByGender(String gender) {
        return userRepository.findByGender(gender);
    }

    public User createClient(User client) {
        return userRepository.save(client);
    }

    public User updateClient(Long id, User updatedClient) {
        User existingClient = userRepository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException("Client not found with id: " + id));

        existingClient.setFullName(updatedClient.getFullName());
        existingClient.setGender(updatedClient.getGender());
        existingClient.setStatus(updatedClient.getStatus());

        return userRepository.save(existingClient);
    }

    public void deleteClient(Long id) {
        userRepository.deleteById(id);
    }
}
