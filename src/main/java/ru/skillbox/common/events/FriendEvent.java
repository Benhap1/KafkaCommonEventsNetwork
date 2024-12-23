package ru.skillbox.common.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendEvent implements BaseEvent {
    private String eventType = "FRIEND_EVENT";

    private String userId;
    private String friendId;
    private String status;
    private Instant updatedAt;
}