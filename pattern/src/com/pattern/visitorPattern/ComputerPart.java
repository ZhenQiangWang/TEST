package com.pattern.visitorPattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
