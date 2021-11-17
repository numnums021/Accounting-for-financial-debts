package com.danya.spring.mvc_hibernate_aop.service;

import com.danya.spring.mvc_hibernate_aop.entity.Debtors;

import java.util.List;

public interface DebtorsService {

    public List<Debtors> getAllDebtors(int tmp);

    public void saveDebtors(Debtors debtors);

    //public void deleteDebtors(int id);

    public void getDebtors(int id);

}
