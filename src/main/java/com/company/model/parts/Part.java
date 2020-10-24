package com.company.model.parts;

import com.company.exceptions.InvalidDataException;

abstract public class Part {
    private PartType partType;
    private int vendorId;
    private String name;
    private String vendor;
    private double frequency;
    private double tdp;
    private double cost;
    private int count;
    private boolean isAvailable;

    public Part(PartType partType, int vendorId, String name, String vendor, double frequency, double tdp, double cost, int count, boolean isAvailable) {
        this.partType = partType;
        this.vendorId = vendorId;
        this.name = name;
        this.vendor = vendor;
        this.frequency = frequency;
        this.tdp = tdp;
        this.cost = cost;
        this.count = count;
        this.isAvailable = isAvailable;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        try {
            this.name = name;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        try {
            this.vendor = vendor;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double frequency) {
        try {
            this.frequency = frequency;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public double getTdp() {
        return tdp;
    }
    public void setTdp(double tdp) {
        try {
            this.tdp = tdp;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        try {
            this.cost = cost;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        try {
            this.count = count;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        try {
            this.isAvailable = isAvailable;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public PartType getPartType() {
        return partType;
    }
    public void setPartType(PartType partType) {
        this.partType = partType;
    }
}
