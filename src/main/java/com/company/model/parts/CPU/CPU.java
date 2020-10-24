package com.company.model.parts.CPU;

import com.company.exceptions.InvalidDataException;
import com.company.model.parts.Part;
import com.company.model.parts.PartType;

public class CPU extends Part {
    private int cores;
    private int threads;
    private boolean virtualization;
    private boolean hyperthreading;
    private CPUSocket socket;
    private CPUType type;

    public CPU(int vendorId, String name, String vendor, double frequency, double tdp, double cost, int count, boolean isAvailable, int cores, int threads, boolean virtualization, boolean hyperthreading, CPUSocket socket, CPUType type) {
        super(PartType.CPU, vendorId, name, vendor, frequency, tdp, cost, count, isAvailable);
        this.cores = cores;
        this.threads = threads;
        this.virtualization = virtualization;
        this.hyperthreading = hyperthreading;
        this.socket = socket;
        this.type = type;
    }

    public int getCores() {
        return cores;
    }
    public void setCores(int cores) {
        try {
            this.cores = cores;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public int getThreads() {
        return threads;
    }
    public void setThreads(int threads) {
        try {
            this.threads = threads;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public boolean isVirtualization() {
        return virtualization;
    }
    public void setVirtualization(boolean virtualization) {
        try {
            this.virtualization = virtualization;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public boolean isHyperthreading() {
        return hyperthreading;
    }
    public void setHyperthreading(boolean hyperthreading) {
        try {
            this.hyperthreading = hyperthreading;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public CPUSocket getSocket() {
        return socket;
    }
    public void setSocket(CPUSocket socket) {
        try {
            this.socket = socket;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
    public CPUType getType() {
        return type;
    }
    public void setType(CPUType type) {
        try {
            this.type = type;
        } catch (InvalidDataException e) {
            throw new InvalidDataException();
        }
    }
}
