package com.orilore.service;
import com.orilore.model.*;
import java.util.List;
public interface IDeptService{
	public void save(Dept dept);
	public void remove(int id);
	public Dept get(int id);
	public List<Dept> find();
	public void saves(Dept[] depts);
}