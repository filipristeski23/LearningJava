package com.framskrit.framskritapp.Tasks.Controller;

import com.framskrit.framskritapp.Tasks.Entity.TaskEntity;
import com.framskrit.framskritapp.Tasks.Service.TaskEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskEntityController {

    @Autowired
    private TaskEntityService taskEntityService;

    @PostMapping("/addTask")
    public TaskEntity addTask(@RequestBody TaskEntity taskEntity){
        return taskEntityService.addTask(taskEntity);
    }
    @GetMapping("/getTask")
    public List<TaskEntity> getTask(){
        return taskEntityService.getTask();
    }
}
