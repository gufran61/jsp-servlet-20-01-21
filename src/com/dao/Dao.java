package com.dao;

import java.util.List;

import com.bean.BookDetail;
import com.bean.InterviewBean;
import com.bean.LoginBean;
import com.bean.PaymentBean;
import com.bean.RegisterBean;

public interface Dao {
public void insert(RegisterBean rb);
public boolean validation(LoginBean lb);
public boolean validationRegister(RegisterBean rb);
void insertBd(BookDetail bd);
void insertInterview(InterviewBean ib);
void insertPayment(PaymentBean pb);
public List<RegisterBean> fetch();
}
