package com.example.pocbuilderpattern.controller;

import com.example.pocbuilderpattern.model.computer.Computer;
import com.example.pocbuilderpattern.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/computer")
public class ComputerController {

    @Autowired
    ComputerService service;

    @GetMapping("build-gaming")
    public ResponseEntity<Computer> buildGamingComputer(@RequestParam int code){
        return ResponseEntity.ok(service.newGamingComputer(code));
    }
    @GetMapping("build-work")
    public ResponseEntity<Computer> buildWorkComputer(@RequestParam int code){
        return ResponseEntity.ok(service.newWorkComputer(code));
    }
    @GetMapping("build-design")
    public ResponseEntity<Computer> buildDesignComputer(@RequestParam int code){
        return ResponseEntity.ok(service.newDesignComputer(code));
    }
}
