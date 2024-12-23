package ru.skillbox.common.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {

    private UUID id;
    private UUID authorId;
    private String content;
    private NotificationType notificationType;
    private Instant sentTime;
    private UUID receiverId;
    private NotificationServiceType serviceType;
    private UUID eventId;
    private Boolean isReaded;
}
