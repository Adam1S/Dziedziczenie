package com.company;

/**
 * Created by adams on 09.07.16.
 */
public class Part {
    int id;
    String producerName;
    String modelName;
    int serialNumber;

    public Part(String producerName, String modelName, int serialNumber, int id){
        this.producerName=producerName;
        this.modelName=modelName;
        this.serialNumber=serialNumber;
        this.id=id;
    }
    
}
