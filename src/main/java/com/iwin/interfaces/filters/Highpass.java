package com.iwin.interfaces.filters;

public class Highpass extends Filter {
    double cutoff;
    public Highpass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
