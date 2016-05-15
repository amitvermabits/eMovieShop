/*    */ package com.calance.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class RentDetails
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = -4662745004207331143L;
/*    */   private Integer id;
/*    */   private Integer member_id;
/*    */   private Date start_date;
/*    */   private Date due_date;
/*    */   private Integer item_id;
/*    */   private Date return_date;
/*    */   private Double rent_amt;
/*    */   private Integer bill_id;
/*    */   private String item_name;
/*    */ 
/*    */   public Integer getId()
/*    */   {
/* 27 */     return this.id;
/*    */   }
/*    */   public void setId(Integer id) {
/* 30 */     this.id = id;
/*    */   }
/*    */   public Integer getMember_id() {
/* 33 */     return this.member_id;
/*    */   }
/*    */   public void setMember_id(Integer member_id) {
/* 36 */     this.member_id = member_id;
/*    */   }
/*    */   public Date getStart_date() {
/* 39 */     return this.start_date;
/*    */   }
/*    */   public void setStart_date(Date start_date) {
/* 42 */     this.start_date = start_date;
/*    */   }
/*    */   public Date getDue_date() {
/* 45 */     return this.due_date;
/*    */   }
/*    */   public void setDue_date(Date due_date) {
/* 48 */     this.due_date = due_date;
/*    */   }
/*    */   public Integer getItem_id() {
/* 51 */     return this.item_id;
/*    */   }
/*    */   public void setItem_id(Integer item_id) {
/* 54 */     this.item_id = item_id;
/*    */   }
/*    */   public Date getReturn_date() {
/* 57 */     return this.return_date;
/*    */   }
/*    */   public void setReturn_date(Date return_date) {
/* 60 */     this.return_date = return_date;
/*    */   }
/*    */   public Double getRent_amt() {
/* 63 */     return this.rent_amt;
/*    */   }
/*    */   public void setRent_amt(Double rent_amt) {
/* 66 */     this.rent_amt = rent_amt;
/*    */   }
/*    */   public Integer getBill_id() {
/* 69 */     return this.bill_id;
/*    */   }
/*    */   public void setBill_id(Integer bill_id) {
/* 72 */     this.bill_id = bill_id;
/*    */   }
/*    */   public void setItem_name(String item_name) {
/* 75 */     this.item_name = item_name;
/*    */   }
/*    */   public String getItem_name() {
/* 78 */     return this.item_name;
/*    */   }
/*    */ }
