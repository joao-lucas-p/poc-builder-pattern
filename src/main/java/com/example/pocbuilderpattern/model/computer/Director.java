package com.example.pocbuilderpattern.model.computer;

import org.springframework.stereotype.Component;

import static com.example.pocbuilderpattern.model.computer.GraphicCardEnum.*;
import static com.example.pocbuilderpattern.model.computer.CabinetColorEnum.*;
import static com.example.pocbuilderpattern.model.computer.MotherBoardEnum.*;
import static com.example.pocbuilderpattern.model.computer.ProcessorEnum.*;
import static com.example.pocbuilderpattern.model.computer.OperationalSystemEnum.*;

@Component
public class Director {

    public static Computer buildWorkComputer(int code){
        return new Computer.ComputerBuilder(H510.name())
                .cabinetColor(BLACK.name())
                .os(LINUX.name())
                .graphicCard(GTX350.name())
                .processor(I710400.name())
                .serialNumber(code)
                .build();
    }

    public static Computer buildDesignComputer(int code){
        return new Computer.ComputerBuilder(X570.name())
                .cabinetColor(WHITE.name())
                .os(WINDOWS.name())
                .graphicCard(RX6500.name())
                .processor(R55600X.name())
                .serialNumber(code)
                .build();
    }

    public static Computer buildGamingComputer(int code){
        return new Computer.ComputerBuilder(RX580.name())
                .cabinetColor(WHITE.name())
                .os(WINDOWS.name())
                .graphicCard(RX6500.name())
                .processor(R55600X.name())
                .serialNumber(code)
                .build();
    }
}
