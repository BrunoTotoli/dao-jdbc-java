package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department department);

    void deleteById(Integer id);

    void update(Department department);

    Department findById(Integer id);

    List<Department> findAll();
}

