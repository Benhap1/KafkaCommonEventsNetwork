package ru.skillbox.common.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteFileEvent implements BaseEvent {

    private String eventType = "DELETE_FILE_EVENT";

    private List<String> urlsImageForDelete = new ArrayList<>();
}
