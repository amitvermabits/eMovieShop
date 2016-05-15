/*    */ package com.calance.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public class BillDetails
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = -1744490914302812154L;
/*    */   private Integer id;
/*    */   private String description;
/*    */   private Double service_tax;
/*    */   private Date bill_date;
/*    */   private Double net_payable;
/*    */   private Double amt_recvd;
/*    */   private Double advanced_amt;
/*    */   private Double balance_amt;
/*    */   private List<RentDetails> rentDetailList;
/*    */ 
/*    */   public BillDetails()
/*    */   {
/* 28 */     this.rentDetailList = new ArrayList();
/*    */   }
/*    */ 
/*    */   public List<RentDetails> getRentDetailList() {
/* 32 */     return this.rentDetailList;
/*    */   }
/*    */ 
/*    */   public void setRentList(List<RentDetails> rentList) {
/* 36 */     this.rentDetailList = rentList;
/*    */   }
/*    */ 
/*    */   public Integer getId() {
/* 40 */     return this.id;
/*    */   }
/*    */   public void setId(Integer id) {
/* 43 */     this.id = id;
/*    */   }
/*    */   public String getDescription() {
/* 46 */     return this.description;
/*    */   }
/*    */   public void setDescription(String description) {
/* 49 */     this.description = description;
/*    */   }
/*    */   public Double getService_tax() {
/* 52 */     return this.service_tax;
/*    */   }
/*    */   public void setService_tax(Double service_tax) {
/* 55 */     this.service_tax = service_tax;
/*    */   }
/*    */   public Date getBill_date() {
/* 58 */     return this.bill_date;
/*    */   }
/*    */   public void setBill_date(Date bill_date) {
/* 61 */     this.bill_date = bill_date;
/*    */   }
/*    */   public Double getNet_payable() {
/* 64 */     return this.net_payable;
/*    */   }
/*    */   public void setNet_payable(Double net_payable) {
/* 67 */     this.net_payable = net_payable;
/*    */   }
/*    */   public Double getAmt_recvd() {
/* 70 */     return this.amt_recvd;
/*    */   }
/*    */   public void setAmt_recvd(Double amt_recvd) {
/* 73 */     this.amt_recvd = amt_recvd;
/*    */   }
/*    */   public Double getAdvanced_amt() {
/* 76 */     return this.advanced_amt;
/*    */   }
/*    */   public void setAdvanced_amt(Double advanced_amt) {
/* 79 */     this.advanced_amt = advanced_amt;
/*    */   }
/*    */   public Double getBalance_amt() {
/* 82 */     return this.balance_amt;
/*    */   }
/*    */   public void setBalance_amt(Double balance_amt) {
/* 85 */     this.balance_amt = balance_amt;
/*    */   }
/*    */ }

