package ru.skillbox.common.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentEvent implements BaseEvent {
    private String eventType = "COMMENT_EVENT";

    private UUID postId;
    private UUID authorId;
    private UUID parentId;
    private String content;
    private Instant createdAt;
    private boolean edited;
}
