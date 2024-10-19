package com.framskrit.framskritapp.Tasks.Service;

import com.framskrit.framskritapp.Tasks.Entity.TaskEntity;

import java.util.List;

public interface TaskEntityService {

    public TaskEntity addTask(TaskEntity taskEntity);
    public List<TaskEntity> getTask();
}
