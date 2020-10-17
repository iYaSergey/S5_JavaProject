package com.company.model.parts;

import com.company.exceptions.InvalidDataException;

abstract public class Part {
    private int vendorId;
    private String name;
    private String vendor;
    private double frequency;
    private double tdp;
    private double cost;
    private int count;
    private boolean isAvailable;

    public Part(int vendorId, String name, String vendor, double frequency, double tdp, double cost, int count, boolean isAvailable) {
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
            e.toString();
        }
    }
    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        try {
            this.vendor = vendor;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double frequency) {
        try {
            this.frequency = frequency;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public double getTdp() {
        return tdp;
    }
    public void setTdp(double tdp) {
        try {
            this.tdp = tdp;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        try {
            this.cost = cost;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        try {
            this.count = count;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        try {
            this.isAvailable = isAvailable;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
}
