/*    */ package com.calance.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class Movie
/*    */   implements Serializable
/*    */ {
/*    */   private Integer id;
/*    */   private String name;
/*    */   private Date rel_date;
/*    */   private String cast;
/*    */   private String description;
/*    */   private Integer rating;
/*    */   private Double rent_amt;
/*    */   private DueDays dueDays;
/*    */ 
/*    */   public DueDays getDueDays()
/*    */   {
/* 22 */     return this.dueDays;
/*    */   }
/*    */   public void setDueDays(DueDays dueDays) {
/* 25 */     this.dueDays = dueDays;
/*    */   }
/*    */   public Integer getId() {
/* 28 */     return this.id;
/*    */   }
/*    */   public void setId(Integer id) {
/* 31 */     this.id = id;
/*    */   }
/*    */ 
/*    */   public String getName() {
/* 35 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 38 */     this.name = name;
/*    */   }
/*    */   public Date getRel_date() {
/* 41 */     return this.rel_date;
/*    */   }
/*    */   public void setRel_date(Date rel_date) {
/* 44 */     this.rel_date = rel_date;
/*    */   }
/*    */   public String getCast() {
/* 47 */     return this.cast;
/*    */   }
/*    */   public void setCast(String cast) {
/* 50 */     this.cast = cast;
/*    */   }
/*    */   public String getDescription() {
/* 53 */     return this.description;
/*    */   }
/*    */   public void setDescription(String description) {
/* 56 */     this.description = description;
/*    */   }
/*    */   public Integer getRating() {
/* 59 */     return this.rating;
/*    */   }
/*    */   public void setRating(Integer rating) {
/* 62 */     this.rating = rating;
/*    */   }
/*    */   public Double getRent_amt() {
/* 65 */     return this.rent_amt;
/*    */   }
/*    */   public void setRent_amt(Double rent_amt) {
/* 68 */     this.rent_amt = rent_amt;
/*    */   }
/*    */ 
/*    */   public String toString() {
/* 72 */     return "Name :" + this.name + ", Cast:" + this.cast + ", Rent amt:" + this.rent_amt;
/*    */   }
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 77 */     return 21 + this.name.length() / 4;
/*    */   }
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 82 */     if ((obj instanceof Movie))
/*    */     {
/* 84 */       return this.name.equalsIgnoreCase(((Movie)obj).name);
/*    */     }
/*    */ 
/* 89 */     return false;
/*    */   }
/*    */ }

