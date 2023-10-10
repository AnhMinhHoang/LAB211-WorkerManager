/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Comparator;
import model.WorkerData;

/**
 *
 * @author GoldCandy
 */
public class Library implements Comparator<WorkerData> {

    @Override
    public int compare(WorkerData o1, WorkerData o2) {
        int iDCompare = o1.getiD().compareTo(o2.getiD());
        if (iDCompare != 0) {
            return iDCompare;
        } else {
            return o1.getDate().compareTo(o2.getDate());
        }
    }

}
