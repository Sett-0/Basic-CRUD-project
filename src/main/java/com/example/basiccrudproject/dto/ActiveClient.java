package com.example.basiccrudproject.dto;

import com.example.basiccrudproject.model.User;

import java.util.List;

public class ActiveClient {
    private List<User> clients;
    private Integer count;

    public ActiveClient(List<User> clients, Integer count) {
        this.clients = clients;
        this.count = count;
    }

    public List<User> getClients() {return clients; }
    public Integer getCount() { return count; }
}
