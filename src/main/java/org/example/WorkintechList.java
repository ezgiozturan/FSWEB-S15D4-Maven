package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList <E extends Comparable<E>>{

    private ArrayList<E> list;

    public WorkintechList(ArrayList<E> list) {
        this.list = new ArrayList<>();
    }
    public WorkintechList() {
        this.list = new ArrayList<>();
    }

    public ArrayList<E> get(int e) {
        return list;
    }


    public boolean add(E e){
      if (!list.contains(e)) {
          list.add(e);
          return true;
      } else  {
          return false;
      }
    }

    public void sort() {
        Collections.sort(list);
    }

    public boolean remove(E e) {
        boolean removed = list.remove(e);
        if (removed) {
            sort();
            return true;
        }
        return removed;
        }


    @Override
    public String toString() {
        return "WorkintechList{" +
                "list=" + list +
                '}';
    }


    public int size() {
           return list.size();
    }
}



