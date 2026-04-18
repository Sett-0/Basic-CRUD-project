package com.example.basiccrudproject.controller;

import com.example.basiccrudproject.dto.ActiveClient;
import com.example.basiccrudproject.model.User;
import com.example.basiccrudproject.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET /api/clients
    @GetMapping
    public List<User> getAllClients() {
        return userService.getAllClients();
    }

    // GET /api/clients/{id}
    @GetMapping("/{id}")
    public User getClientById(@PathVariable Long id) {
        return userService.getClientById(id);
    }

    @PostMapping
    public User createClient(@RequestBody User client) {
        return userService.createClient(client);
    }

    // GET /api/clients/name/{name}

    @GetMapping("/name/{name}")
    public List<User> getClientsByFullName(@PathVariable String name) {
        return userService.getClientsByFullName(name);
    }
    // GET /api/clients/status/{status}

    @GetMapping("/status/{status}")
    public List<User> getClientsByStatus(@PathVariable String status) {
        return userService.getClientsByStatus(status);
    }
    // GET /api/clients/gender/{gender}

    @GetMapping("/gender/{gender}")
    public List<User> getClientsByGender(@PathVariable String gender) {
        return userService.getClientsByGender(gender);
    }
    // POST /api/clients

    // PUT /api/clients/{id}
    @PutMapping("/{id}")
    public User updateClient(@PathVariable Long id, @RequestBody User updatedClient) {
        return userService.updateClient(id, updatedClient);
    }

    // DELETE /api/clients/{id}
    @DeleteMapping("/{id}")
    public void deleteClientById(@PathVariable Long id) {
        userService.deleteClient(id);
    }

    // GET /api/clients
    @GetMapping("/active")
    public ActiveClient getActiveClients() {
        return userService.getActiveClients();
    }
}