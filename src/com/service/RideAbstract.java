package com.service;

import com.po.Ride;
import com.po.Visitor;

public abstract class RideAbstract {
    public abstract void addVisitorToQueue(Visitor visitor);
    public abstract void removeVisitorToQueue(Visitor visitor);
    public abstract void printQueue();
    public abstract void runOneCycle(Ride ride);
    public abstract void addVisitorToHistory(Visitor visitor);
    public abstract boolean checkVisitorFromHistory(Visitor visitor);
    public abstract int numberOfVisitors();
    public abstract void printRideHistory();
}
