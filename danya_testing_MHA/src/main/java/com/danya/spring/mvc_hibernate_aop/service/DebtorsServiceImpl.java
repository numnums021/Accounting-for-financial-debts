package com.danya.spring.mvc_hibernate_aop.service;

import com.danya.spring.mvc_hibernate_aop.dao.DebtorsDao;
import com.danya.spring.mvc_hibernate_aop.entity.Debtors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DebtorsServiceImpl implements DebtorsService{

    @Autowired
    private DebtorsDao debtorsDao;

    @Override
    @Transactional
    public List<Debtors> getAllDebtors(int tmp) {
        return debtorsDao.getAllDebtors(tmp);
    }

    @Override
    @Transactional
    public void saveDebtors(Debtors debtors) {
        debtorsDao.saveDebtors(debtors);
    }

    @Override
    @Transactional
    public void getDebtors(int id) {
        debtorsDao.getDebtors(id);
    }

//    @Override
//    @Transactional
//    public void deleteDebtors(int id) {
//        debtorsDao.deleteDebtors(id);
//    }

}
