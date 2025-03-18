package fr.uga.l3miage.tp1.bis.mappers;

import fr.uga.l3miage.tp1.bis.domain.models.Command;
import fr.uga.l3miage.tp1.bis.responses.CommandResponse;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper
public interface CommandMapper {

    CommandResponse toResponse(Command command);

    Set<CommandResponse> toResponses(Set<Command> commands);
}
