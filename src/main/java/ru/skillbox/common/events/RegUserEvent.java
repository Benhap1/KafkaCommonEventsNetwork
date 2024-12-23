package ru.skillbox.common.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegUserEvent implements BaseEvent {
    private String eventType = "REG_EVENT";

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
