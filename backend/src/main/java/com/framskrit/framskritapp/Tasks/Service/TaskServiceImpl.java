package com.framskrit.framskritapp.Tasks.Service;

import com.framskrit.framskritapp.Tasks.Entity.TaskEntity;
import com.framskrit.framskritapp.Tasks.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskEntityService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskEntity addTask(TaskEntity taskEntity){
        return taskRepository.save(taskEntity);
    };

    @Override
    public List<TaskEntity> getTask(){
        return taskRepository.findAll();
    }

}
