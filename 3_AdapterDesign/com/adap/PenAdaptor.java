package com.adap;

import com.another.PilotPen;

public class PenAdaptor implements Pen{
    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
