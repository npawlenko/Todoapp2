package com.np.tasks.storage;

import com.np.tasks.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {

    private static TaskStorage instance;

    private final List<Task> tasks;

    public static TaskStorage getInstance() {
        if(instance == null) {
            instance = new TaskStorage();
        }
        return instance;
    }

    private TaskStorage() {
        tasks = new ArrayList<>();
        for(int i = 1; i <= 150; i++) {
            Task task = new Task();
            task.setName("Pilne zadanie numer " + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID taskId) {
        for(Task task : tasks) {
            if(taskId.equals(task.getId()))
                return task;
        }
        return null;
    }


    public void addTask(Task task) {
        tasks.add(0, task);
    }
}
