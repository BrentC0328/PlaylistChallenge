package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int counter = 0;
        int reverseCounter = 0;
        int defaultStart = startIndex;
        //Have a playlist of arrays. Find the string selection's index in the array to make it a number.
        List<String> theList = new ArrayList<String>(Arrays.asList(playList));
        for (String song : playList) {
            theList.add(song);
        }
        int selectionNumber = theList.indexOf(selection);
        //While the startIndex is not equal to the selection number

        while (startIndex != selectionNumber) {
            counter++;
            startIndex++;
            if (startIndex == playList.length) {
                startIndex = 0;
            }
        }

        startIndex = defaultStart;

        while (startIndex != selectionNumber) {

            if (startIndex == 0) {
                startIndex = playList.length ;
                reverseCounter++;
            } else {
                reverseCounter++;
                startIndex--;
            }

        }

        //startIndex go up one and counter go up one.
        //If Start index goes over the last index, reset start index to 0 on next count.
        //return count once startIndex and selection number are equal.


        if (counter >= reverseCounter) {
            return Math.abs(reverseCounter);
        } else {

            return counter;
        }

    }
}

