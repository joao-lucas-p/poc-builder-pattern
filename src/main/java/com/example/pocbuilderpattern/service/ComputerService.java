package com.example.pocbuilderpattern.service;

import com.example.pocbuilderpattern.model.computer.Computer;
import com.example.pocbuilderpattern.model.computer.Director;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {

    public Computer newGamingComputer(int code){
        return Director.buildGamingComputer(code);
    }
    public Computer newDesignComputer(int code){
        return Director.buildDesignComputer(code);
    }

    public Computer newWorkComputer(int code){
        return Director.buildWorkComputer(code);
    }
}
