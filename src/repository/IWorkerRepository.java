/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.WorkerData;

/**
 *
 * @author GoldCandy
 */
public interface IWorkerRepository {

    void addWorker(List<WorkerData> workers, WorkerData new_worker);

    void changeSalary(List<WorkerData> workers, int type);

    void display(List<WorkerData> workers);
    
}
