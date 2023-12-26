package com.example.customermanagement.model.service;

import com.example.customermanagement.model.dao.CustomerDAO;
import com.example.customermanagement.model.entity.Customer;

import java.util.List;

public class CustomerServiceFactory implements CustomerService{
    private CustomerDAO customerDAO;

    public CustomerServiceFactory() {
        customerDAO = new CustomerDAO();
    }

    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerDAO.findById(id);
    }
}
