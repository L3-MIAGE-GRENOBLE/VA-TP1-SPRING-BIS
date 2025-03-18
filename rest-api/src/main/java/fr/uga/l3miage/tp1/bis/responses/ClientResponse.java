package fr.uga.l3miage.tp1.bis.responses;

import lombok.Data;

import java.util.Set;

@Data
public class ClientResponse {
    private String name;
    private String email;
    private Set<CommandResponse> commands;
}
