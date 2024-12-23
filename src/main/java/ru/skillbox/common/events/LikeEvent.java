package ru.skillbox.common.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikeEvent implements BaseEvent{
    private String eventType = "LIKE_EVENT";

    private UUID postId;
    private Long authorId;
    private Instant time;
    private Long itemId;
    private String likeType;
    private String reactionType;

}

