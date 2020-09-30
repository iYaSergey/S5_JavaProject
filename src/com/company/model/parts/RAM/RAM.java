package com.company.model.parts.RAM;

import com.company.exceptions.InvalidDataException;
import com.company.model.parts.Part;

public class RAM extends Part {
    private int memory;
    private RAMType type;

    public RAM(int vendorId, String name, String vendor, double frequency, double tdp, double cost, int count, boolean isAvailable, int memory, RAMType type) {
        super(vendorId, name, vendor, frequency, tdp, cost, count, isAvailable);
        this.memory = memory;
        this.type = type;
    }

    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        try {
            this.memory = memory;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public RAMType getType() {
        return type;
    }
    public void setType(RAMType type) {
        try {
            this.type = type;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
}
