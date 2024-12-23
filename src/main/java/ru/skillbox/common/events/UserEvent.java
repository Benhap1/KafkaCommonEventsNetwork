package ru.skillbox.common.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
//UserEvent
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEvent implements BaseEvent {
    private String eventType = "USER_EVENT";

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
    private String messagePermission;
    private boolean deleted;
    private boolean blocked;
}
