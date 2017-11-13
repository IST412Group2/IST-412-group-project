package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MoodType {
    private ArrayList<String> moodArray;
    private HashMap<Integer, String> moodMap;

    public MoodType() {
        moodArray = new ArrayList<>();
        moodArray.add("Ecstatic");
        moodArray.add("Very Happy");
        moodArray.add("Happy");
        moodArray.add("Normal");
        moodArray.add("Meloncholy");
        moodArray.add("Sad");
        moodArray.add("Very Sad");
        moodArray.add("Morose");
        moodArray.add("Angry");
        moodArray.add("Anxious");
        
        createMoodMap(moodArray);
    }

    public HashMap createMoodMap(ArrayList<String> moodArray){
        moodMap = new HashMap<>();
        int i = 0;
        
        Iterator<String> moodIter = moodArray.iterator();
        
        while(moodIter.hasNext()){
            String tempMood = moodIter.next();
            moodMap.put(i, tempMood);
            i++;
        }
        
        return moodMap;
    }

    /**
     * @return the moodArray
     */
    public ArrayList<String> getMoodArray() {
        return moodArray;
    }

    /**
     * @param moodArray the moodArray to set
     */
    public void setMoodArray(ArrayList<String> moodArray) {
        this.moodArray = moodArray;
    }

    /**
     * @return the moodMap
     */
    public HashMap<Integer, String> getMoodMap() {
        return moodMap;
    }

    /**
     * @param moodMap the moodMap to set
     */
    public void setMoodMap(HashMap<Integer, String> moodMap) {
        this.moodMap = moodMap;
    }
}
