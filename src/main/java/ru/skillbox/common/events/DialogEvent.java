package ru.skillbox.common.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DialogEvent implements BaseEvent {
    private String eventType = "DIALOG_EVENT";

    private UUID authorId;
    private UUID idRecipient;
    private UUID messageId;
    private UUID dialogId;
    private Instant sentTime;
    private Boolean isRead;
    private String content;
}