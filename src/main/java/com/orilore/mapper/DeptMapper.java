package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;

public interface DeptMapper{
	public void insert(Dept bean);
	public Dept selectOne(int id);
	public void delete(int id);
	public List<Dept> select();
	public void update(Dept bean);
}