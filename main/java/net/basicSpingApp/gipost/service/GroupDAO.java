package net.basicSpingApp.gipost.service;
import net.basicSpingApp.gipost.entity.Group;
import java.util.*;

public interface GroupDAO{
	public void create(Group group);
	public void update(Group group);
	public void delete(long id);
	public Group getById(long id);
	public List<Group> getAll();
}