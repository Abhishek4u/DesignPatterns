package com.adap;

// import com.another.PilotPen;

public class School {

    public static void main(String[] args) {
        // PilotPen pp = new PilotPen();
        Pen p = new PenAdaptor();

        AssignmentWork aw = new AssignmentWork();

        aw.setP(p);
        aw.writeAssignment("In School assignment work");
    }
}