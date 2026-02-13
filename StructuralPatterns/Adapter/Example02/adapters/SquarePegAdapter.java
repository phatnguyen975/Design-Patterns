package StructuralPatterns.Adapter.Example02.adapters;

import StructuralPatterns.Adapter.Example02.round.RoundPeg;
import StructuralPatterns.Adapter.Example02.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
