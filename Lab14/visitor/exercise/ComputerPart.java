package com.patterns.visitor.exercise;

public interface ComputerPart {
    void accept(ComputerPartVisitor v);
}

