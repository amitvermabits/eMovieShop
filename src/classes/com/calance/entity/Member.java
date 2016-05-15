/*    */ package com.calance.entity;
/*    */ 
/*    */ public class Member
/*    */ {
/*    */   private Integer id;
/*    */   private String name;
/*    */   private String address;
/*    */   private String contactNo;
/*    */   private String emailId;
/*    */   private String username;
/*    */   private String hashed_password;
/*    */ 
/*    */   public Integer getId()
/*    */   {
/* 14 */     return this.id;
/*    */   }
/*    */   public void setId(Integer id) {
/* 17 */     this.id = id;
/*    */   }
/*    */   public String getName() {
/* 20 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 23 */     this.name = name;
/*    */   }
/*    */   public String getAddress() {
/* 26 */     return this.address;
/*    */   }
/*    */   public void setAddress(String address) {
/* 29 */     this.address = address;
/*    */   }
/*    */   public String getContactNo() {
/* 32 */     return this.contactNo;
/*    */   }
/*    */   public void setContactNo(String contactNo) {
/* 35 */     this.contactNo = contactNo;
/*    */   }
/*    */   public String getEmailId() {
/* 38 */     return this.emailId;
/*    */   }
/*    */   public void setEmailId(String emailId) {
/* 41 */     this.emailId = emailId;
/*    */   }
/*    */   public String getUsername() {
/* 44 */     return this.username;
/*    */   }
/*    */   public void setUsername(String username) {
/* 47 */     this.username = username;
/*    */   }
/*    */   public String getHashed_password() {
/* 50 */     return this.hashed_password;
/*    */   }
/*    */   public void setHashed_password(String hashed_password) {
/* 53 */     this.hashed_password = hashed_password;
/*    */   }
/*    */ 
/*    */   public String toString() {
/* 57 */     return "Name: " + this.name + ", Username:" + this.username;
/*    */   }
/*    */ }

