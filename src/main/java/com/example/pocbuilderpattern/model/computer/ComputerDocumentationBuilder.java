package com.example.pocbuilderpattern.model.computer;

public class ComputerDocumentationBuilder {
    private String motherboard;
    private String processor;
    private String graphicCard;
    private String os;
    private String cabinetColor;


    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }


    public void setProcessor(String processor) {
        this.processor = processor;
    }


    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }


    public void setOs(String os) {
        this.os = os;
    }


    public void setCabinetColor(String color) {
        this.cabinetColor = color;
    }

    public ComputerDocumentation getResult(){
        return new ComputerDocumentation(motherboard, processor, graphicCard, os, cabinetColor);
    }
}
