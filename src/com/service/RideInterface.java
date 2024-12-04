package com.service;

import com.po.Ride;
import com.po.Visitor;
// Interface
public interface RideInterface {
    public void addVisitorToHistory(Visitor visitor);
    public boolean checkVisitorFromHistory(Visitor visitor);
    public int numberOfVisitors();
    public void printRideHistory();
}
