package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;




@Repository

public class CategoryDAOImpl implements CategoryDAO {
static List list=new ArrayList();
static {
list.add("Television");
list.add("Mobile");
list.add("fashon");
}
public List<String> list() {
	// TODO Auto-generated method stub
	return list;
}
	
	
}
