package com.example.pocbuilderpattern.model.computer;

public class ComputerDocumentation {
    private final String motherboard;
    private final String processor;
    private final String graphicCard;
    private final String os;
    private final String cabinetColor;

    public ComputerDocumentation(String motherboard, String processor, String graphicCard, String os, String cabinetColor) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.os = os;
        this.cabinetColor = cabinetColor;
    }
}
