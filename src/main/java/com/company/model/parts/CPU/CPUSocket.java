package com.company.model.parts.CPU;

public enum CPUSocket {
    LGA1700,
    LGA1200,
    LGA2066,
    LGA1151,
    LGA2011v3 {
        public String toString() {
            return "LGA2011-3";
        }
    },
    LGA1150,
    LGA1356,
    AM2,
    AM3,
    AM3plus {
        public String toString() {
            return "AM3+";
        }
    },
    AM4,
    FM2
}
