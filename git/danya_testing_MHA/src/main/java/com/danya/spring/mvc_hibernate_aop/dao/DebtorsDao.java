package com.danya.spring.mvc_hibernate_aop.dao;

import com.danya.spring.mvc_hibernate_aop.entity.Debtors;

import java.util.List;

public interface DebtorsDao {
    public List<Debtors> getAllDebtors(int tmp);

    public void saveDebtors(Debtors debtors);

    public void getDebtors(int id);
}
