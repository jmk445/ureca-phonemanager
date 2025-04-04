package com.mycom.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mycom.myapp.dto.Order;
import com.mycom.myapp.dto.Phone;

@Mapper
public interface OrderDao {
	public List<Order> listOrders() ;
	public String getPhoneByOrderId(int orderId);
	
	Integer getOrderId();
	//todo : 맞는지 모르겠음...refactoring하기
    public boolean insertOrder(int shoppingCartId);
    public boolean insertOrder2(int orderId, int phoneId);
}
