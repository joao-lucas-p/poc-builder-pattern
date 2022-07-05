package com.example.pocbuilderpattern.model.computer;

public class Computer {
    private final String motherboard;
    private final String processor;
    private final String graphicCard;
    private final String os;
    private final String cabinetColor;
    private int serialNumber;

    public Computer(ComputerBuilder builder) {
        this.motherboard = builder.motherboard;
        this.processor = builder.processor;
        this.graphicCard = builder.graphicCard;
        this.os = builder.os;
        this.cabinetColor =builder.cabinetColor;
        this.serialNumber = builder.serialNumber;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getOs() {
        return os;
    }

    public String getCabinetColor() {
        return cabinetColor;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard=" + motherboard +
                ", processor=" + processor +
                ", graphicCard=" + graphicCard +
                ", os='" + os + '\'' +
                ", cabinetColor='" + cabinetColor + '\'' +
                '}';
    }


    public static class ComputerBuilder {
        private int serialNumber;
        private String motherboard;
        private String processor;
        private String graphicCard;
        private String os;
        private String cabinetColor;

        public ComputerBuilder(String motherboard) {
            this.motherboard = motherboard;
        }

        public ComputerBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder graphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder os(String os) {
            this.os = os;
            return this;
        }

        public ComputerBuilder cabinetColor(String cabinetColor) {
            this.cabinetColor = cabinetColor;
            return this;
        }

        public ComputerBuilder serialNumber(int code){
            this.serialNumber = code;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}


