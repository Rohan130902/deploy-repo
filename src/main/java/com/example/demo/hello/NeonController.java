package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.security.JwtUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
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
