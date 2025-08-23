package com.example.demo.hello;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/neon")
public class NeonController {

    private final PlayingWithNeonRepository repository;

    public NeonController(PlayingWithNeonRepository repository) {
        this.repository = repository;
    }

    // Insert entry
    @PostMapping("/add")
    public PlayingWithNeon addEntry(@RequestBody NeonRequest request) {
        PlayingWithNeon entry = new PlayingWithNeon();
        entry.setName(request.getName());
        entry.setValue(request.getValue());
        return repository.save(entry);
    }

    // Get all entries
    @GetMapping("/all")
    public List<PlayingWithNeon> getAll() {
        return repository.findAll();
    }
}
