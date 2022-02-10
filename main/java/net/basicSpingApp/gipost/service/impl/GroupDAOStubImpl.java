package net.basicSpingApp.gipost.service.impl;
import java.util.*;

import net.basicSpingApp.gipost.entity.Group;

public class GroupDAOStubImpl extends Group {
    private DBImpl impl;

    public void setImpl(DBImpl impl){
        this.impl = impl;
    }
    public void create(Group group){
        impl.groups.put(group.getId(), group);
    }

    public void update(Group group){
        impl.groups.put(group.getId(), group);
    }
    public void delete(long id){
        impl.groups.remove(id);
    }

    public Group getById(long id){
        return impl.groups.get(id);
    }

    public List<Group> getAll(){
        ArrayList<Group> list = new ArrayList<>(impl.groups.values());
        return list;
    }
}