package com.framskrit.framskritapp.Tasks.Repository;

import com.framskrit.framskritapp.Tasks.Entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TaskRepository extends JpaRepository<TaskEntity,String> {
    List<TaskEntity> findByTitle(String title);
    List<TaskEntity> findByDescription(String description);

    List<TaskEntity> findAll();
}
