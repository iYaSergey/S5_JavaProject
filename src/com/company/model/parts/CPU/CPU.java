package com.company.model.parts.CPU;

import com.company.model.parts.Part;

public class CPU extends Part {
    private int cores;
    private int threads;
    private boolean virtualization;
    private boolean hyperthreading;
    private CPUSocket socket;
    private CPUType type;
}
