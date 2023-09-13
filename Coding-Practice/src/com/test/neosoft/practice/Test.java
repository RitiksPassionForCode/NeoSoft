package com.test.neosoft.practice;

import java.util.*;
import java.io.*;

public class Test {
    public static List<String> processData(ArrayList<String> lines) {
        
    	Map<String, Double> longestTimeByEvent = new HashMap<>();
        Map<String, String> athleteByEvent = new HashMap<>();

        for (String athleteData : lines) {
            String[] athleteInfo = athleteData.split(", ");
            double time = Double.parseDouble(athleteInfo[3]);
            String eventName = athleteInfo[2];
            String athleteName = athleteInfo[1];

            if (!longestTimeByEvent.containsKey(eventName) || time > longestTimeByEvent.get(eventName)) {
                longestTimeByEvent.put(eventName, time);
                athleteByEvent.put(eventName, athleteName);
            }
        }

        List<String> retVal = new ArrayList<>();
        for (Map.Entry<String, String> entry : athleteByEvent.entrySet()) {
            String eventName = entry.getKey();
            String athleteName = entry.getValue();
            retVal.add("Longest time in " + eventName + " event: " + athleteName);
        }
        return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        inputData.add("1, John, Event1, 10.5, 100");
        inputData.add("2, Alice, Event2, 15.2, 90");
        inputData.add("3, Bob, Event1, 12.8, 80");
        inputData.add("4, Sarah, Event2, 14.7, 95");
        inputData.add("5, Mark, Event1, 11.3, 85");
        inputData.add("6, Emily, Event3, 9.8, 75");
        inputData.add("7, Mike, Event3, 10.1, 70");
        inputData.add("8, Olivia, Event3, 10.5, 78");
        List<String> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(System.out);
        for(String str: retVal)
            output.println(str);
        output.close();
    }
}

