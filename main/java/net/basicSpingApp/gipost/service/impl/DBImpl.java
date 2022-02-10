package net.basicSpingApp.gipost.service.impl;
import net.basicSpingApp.gipost.entity.Group;
import net.basicSpingApp.gipost.entity.Student;

import java.util.*;

public class DBImpl{
    public Map<Long, Group> groups;
    public Map<Long, Student> students;
    public DBImpl(){
        this.groups = new HashMap<Long, Group>();
        this.students = new HashMap<Long, Student>();
    }
}