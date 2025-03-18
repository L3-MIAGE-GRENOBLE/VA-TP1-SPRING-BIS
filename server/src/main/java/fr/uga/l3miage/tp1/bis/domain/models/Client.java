package fr.uga.l3miage.tp1.bis.domain.models;

import lombok.Data;

import java.util.Set;

@Data
public class Client {
    private String name;
    private String email;
    private Set<Command> commands;
}
