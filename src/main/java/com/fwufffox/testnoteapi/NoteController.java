package com.fwufffox.testnoteapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NoteController {

    private final List<Note> notes = new ArrayList<>();

    @GetMapping("/notes/{id}")
    public Note GetSingleNote(
            @PathVariable Number id
    ) {
        var a = notes.stream()
                .filter(x -> x.id().equals(id))
                .findFirst();

        return a.orElseGet(() -> new Note(0, "", ""));
    }
}
