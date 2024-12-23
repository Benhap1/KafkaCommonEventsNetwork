package ru.skillbox.common.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonEvent<T> implements BaseEvent {

    private String eventType;
    private T data;

    public CommonEvent(T data) {
        this.eventType = data.getClass().getSimpleName();
        this.data = data;
    }

    @Override
    public String getEventType() {
        return eventType;
    }
}
