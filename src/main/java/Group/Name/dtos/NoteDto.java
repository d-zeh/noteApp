package Group.Name.dtos;

import Group.Name.entities.Note;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto implements Serializable {
    private Long id;
    private String body;
    private UserDto userDto;

    public NoteDto(Note note) {
        if (note.getId() != null) {
            this.id = note.getId();
        }
        if (note.getBody() != null) {
            this.body = note.getBody();
        }
    }
}
