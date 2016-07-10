package com.company;

/**
 * Created by adams on 09.07.16.
 */
public class Tire extends Part{
    int size;
    int width;

    public Tire(String producerName, String modelName, int serialNumber, int id, int size, int width){
        super(producerName, modelName, serialNumber, id);
        this.size=size;
        this.width=width;
    }
}
