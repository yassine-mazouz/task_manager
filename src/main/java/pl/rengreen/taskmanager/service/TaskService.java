package pl.rengreen.taskmanager.service;

import pl.rengreen.taskmanager.model.Task;
import pl.rengreen.taskmanager.model.User;

import java.util.List;

public interface TaskService {

    void createTask(Task task);

    List<Task> findAll();

    List<Task> findByOwnerOrderByDateDesc(User user);

    void setTaskCompleted(Long id);

    void setTaskNotCompleted(Long id);

    List<Task> findFreeTasks();

    Task getTaskById(Long taskId);

    void assignTaskToUser(Task task, User user);

    void unassignTask(Task task);
}
