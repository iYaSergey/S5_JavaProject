package com.company.model.parts.GPU;

import com.company.exceptions.InvalidDataException;
import com.company.model.parts.Part;

public class GPU extends Part {
    private int memory;
    private boolean raytracing;
    private GPUType type;

    public GPU(int vendorId, String name, String vendor, double frequency, double tdp, double cost, int count, boolean isAvailable, int memory, boolean raytracing, GPUType type) {
        super(vendorId, name, vendor, frequency, tdp, cost, count, isAvailable);
        this.memory = memory;
        this.raytracing = raytracing;
        this.type = type;
    }

    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        try {
            this.memory = memory;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public boolean isRaytracing() {
        return raytracing;
    }
    public void setRaytracing(boolean raytracing) {
        try {
            this.raytracing = raytracing;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public GPUType getType() {
        return type;
    }
    public void setType(GPUType type) {
        try {
            this.type = type;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
}
