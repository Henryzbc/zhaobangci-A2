package com;

import com.VisitorComparator.VisitorComparator;
import com.po.Ride;
import com.po.Visitor;
import com.service.impl.RideInterfaceImpl;

import java.util.*;

public class AssignmentTwo {
    private RideInterfaceImpl rideInterface = new RideInterfaceImpl();
    private String FILE_PATH = "E:/GitHub/JAVA/zhaobangci-A2/test.txt";

    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        System.out.println("partThree====================");
        assignmentTwo.partThree();
        System.out.println();
        System.out.println();
        System.out.println("partFourA====================");
        assignmentTwo.partFourA();
        System.out.println();
        System.out.println();
        System.out.println("partFourB====================");
        assignmentTwo.partFourB();
        System.out.println();
        System.out.println();
        System.out.println("partFive====================");
        assignmentTwo.partFive();
        System.out.println();
        System.out.println();
        System.out.println("partSix====================");
        assignmentTwo.partSix();
        System.out.println();
        System.out.println();
        System.out.println("partSeven====================");
        assignmentTwo.partSeven();
    }
    public void partThree(){
        List<Visitor> list = createVisitor();
        list.forEach(item->rideInterface.addVisitorToQueue(item));
        rideInterface.removeVisitorToQueue(list.get(0));
        rideInterface.printQueue();
        rideInterface.clear();
    }
    public void partFourA(){
        //Add a minimum of 5 Visitors to the collection.
        List<Visitor> list = createVisitor();
        list.forEach(item->rideInterface.addVisitorToHistory(item));

        //Check if a Visitor is in the collection.
        if (rideInterface.checkVisitorFromHistory(list.get(0))) System.out.println(list.get(0).toString()+" presence");
        else System.out.println(list.get(0).toString()+" not presence");

        //Print the number of Visitors in the collection.
        System.out.println("numbers: "+rideInterface.numberOfVisitors());

        //Print all Visitors in the collection.
        rideInterface.printRideHistory();
        rideInterface.clear();
    }
    public void partFourB(){
        List<Visitor> list = createVisitor();
        //Add a minimum of 5 Visitors to the collection.
        list.forEach(item->rideInterface.addVisitorToHistory(item));
        //Print all Visitors in the collection.
        rideInterface.printRideHistory();
        //Sort the collection
        Collections.sort(list,new VisitorComparator());
        System.out.println("Collections:");
        //Print all Visitors in the collection again to show that the collection has been sorted.
        list.forEach(item-> System.out.println(item.toString()));
        rideInterface.clear();
    }
    public void partFive(){
        Ride ride = new Ride(null,2,0);
        List<Visitor> list = createVisitor();
        list.addAll(createVisitor());
        list.forEach(item->rideInterface.addVisitorToQueue(item));
        rideInterface.printQueue();
        rideInterface.runOneCycle(ride);
        rideInterface.printQueue();
        rideInterface.printRideHistory();
        rideInterface.clear();
    }
    public void partSix(){
        List<Visitor> list = createVisitor();
        list.forEach(item->rideInterface.addVisitorToHistory(item));
        rideInterface.exportRideHistory(FILE_PATH);
        rideInterface.printRideHistory();
        rideInterface.clear();
    }
    public void partSeven(){
        rideInterface.importRideHistory(FILE_PATH);
        rideInterface.printRideHistory();
        rideInterface.clear();
    }

    private List<Visitor> createVisitor(){
        Visitor one = new Visitor("Mr Zhao","20","man","40",new Date());
        Visitor tow = new Visitor("Mr Wang","18","man","40",new Date());
        Visitor three = new Visitor("Mr Liu","30","woman","40",new Date());
        Visitor four = new Visitor("Mr Li","33","woman","40",new Date());
        Visitor five = new Visitor("Mr Zhang","60","man","40",new Date());
        List<Visitor> list = new ArrayList<>();
        list.add(one);
        list.add(tow);
        list.add(three);
        list.add(four);
        list.add(five);
        return list;
    }
}
