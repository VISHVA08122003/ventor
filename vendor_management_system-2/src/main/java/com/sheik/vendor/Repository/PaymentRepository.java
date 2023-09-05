package com.sheik.vendor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheik.vendor.model.Payment;




public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}