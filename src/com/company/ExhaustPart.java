package com.company;

/**
 * Created by adams on 09.07.16.
 */
public class ExhaustPart extends Part {

    boolean isEUCompliant;



    public ExhaustPart(String producerName, String modelName, int serialNumber, int id, boolean isEUCompliant){
        super(producerName, modelName, serialNumber, id);
        this.isEUCompliant=isEUCompliant;

    }
}
