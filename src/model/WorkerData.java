/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GoldCandy
 */
public class WorkerData {

    private String iD;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    private Date date;
    private String status;
    private List<WorkerData> workers = new ArrayList<>();

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<WorkerData> getWorkers() {
        return workers;
    }

    public void setWorkers(List<WorkerData> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        SimpleDateFormat Dateformat = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%-15s%-20s%-15d%-15.2f%-20s%-15s%s",
                this.getiD(), this.getName(),
                this.getAge(), this.getSalary(),
                this.getWorkLocation(), this.getStatus(),
                Dateformat.format(this.getDate()));
    }
}
