package com.orilore.service;
import com.orilore.model.*;
import com.orilore.mapper.*;

import java.sql.SQLException;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptService implements IDeptService{
	@Resource
	private DeptMapper mapper;
	//传播行为，隔离级别，只读状态，回滚原则
	@Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=SQLException.class)
	public void save(Dept dept) {
		if(dept.getId()!=null) {
			mapper.update(dept);
		}else {
			mapper.insert(dept);
		}
	}

	@Override
	public void remove(int id) {
		mapper.delete(id);
	}

	@Override
	public Dept get(int id) {
		return mapper.selectOne(id);
	}

	@Override
	public List<Dept> find() {
		return mapper.select();
	}

	@Override
	public void saves(Dept[] depts) {
		for (Dept dept : depts) {
			this.mapper.insert(dept);
		}
	}
	
}
