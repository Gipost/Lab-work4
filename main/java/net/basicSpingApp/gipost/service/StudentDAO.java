package net.basicSpingApp.gipost.service;
import net.basicSpingApp.gipost.entity.Student;

import java.util.*;

public interface StudentDAO {
    public void create(Student student);

    public void update(Student student);
    public void delete(long id);
    public Student getById(long id);
    public List<Student> getAll();
}