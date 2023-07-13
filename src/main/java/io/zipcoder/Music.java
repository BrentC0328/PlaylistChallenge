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
        //we need a counter.
        //We can check against the array length. There should be no possible combination that goes past the array length.
        //if array start index is selection stop count
        //else add to index. keep going.
        //if index == the length we go back to 0.
        //do the reverse for the lower.

        int counter = 0;
        int startIndexTwo = startIndex;

        for (int i = 0; i < playList.length; i++) {
            String song = playList[startIndex];

            if (song.equals(selection)){
                break;
            }

            if(startIndex == playList.length - 1){
                startIndex = 0;
                counter++;
            } else {
                counter++;
                startIndex += 1;

        } }

            int counterTwo = 0;
            for (int i = 0; i < playList.length; i++) {
                String song = playList[startIndexTwo];
                if (song.equals(selection)){
                    break;
                }
                if(startIndexTwo == 0){
                    startIndexTwo = playList.length -1;
                    counterTwo++;
                } else { counterTwo++;
                    startIndexTwo -= 1;

                }



            }
            return Math.min(counter, counterTwo);

    }
}


