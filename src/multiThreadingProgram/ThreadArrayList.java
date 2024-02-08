package multiThreadingProgram;

import java.util.ArrayList;

public class ThreadArrayList {

    public ArrayList<Integer> myArrayList = new ArrayList<>();
    public synchronized void  addElement(int a){

        myArrayList.add(a);
    }
    public ArrayList<Integer> getMyArrayList() {
        return myArrayList;
    }
}
