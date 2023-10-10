/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author GoldCandy
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import model.WorkerData;

public class Validation<T> {

    public String inputString(String title) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (s.isBlank() || s.isEmpty()) {
            System.out.print(title + ": ");
            s = sc.nextLine();
        }
        return s;
    }

    public int inputAge(String title) {
        int a = 0;
        while (a < 18 || a > 50) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(title + ": ");
                a = sc.nextInt();
                if (a < 1) {
                    System.out.println("18 < a < 50");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input digit(18 < a < 50)");
                a = 0;
            }
        }
        return a;
    }

    public double inputDouble(String title) {
        double a = 0;
        while (a < 1) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(title + ": ");
                a = sc.nextDouble();
                if (a < 1) {
                    System.out.println("a > 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input digit(a > 0)");
                a = 0;
            }
        }
        return a;
    }

    public int checkID(List<WorkerData> workers, String iD) {
        if (workers.size() == 1){
            if(workers.get(0).getiD().equals(iD)) return 0;
            return -1;
        }
        for (int i = 1; i < workers.size(); i++) {
            if (workers.get(i-1).getiD().equals(iD) && !workers.get(i).getiD().equals(iD)) {
                return i-1;
            }
            if(i == workers.size() - 1 && workers.get(i).getiD().equals(iD)){
                return i;
            }
        }
        return -1;
    }

    public Date inputDate(String title) {
        Date date;
        while (true) {
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(inputString(title));
                return date;
            } catch (ParseException e) {
                System.out.println("Please input dd/MM/yyyy");
            }
        }
    }
}
