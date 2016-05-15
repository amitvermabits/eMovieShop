/*    */ package com.calance.entity;
/*    */ 
/*    */ public class DueDays
/*    */ {
/*    */   private Integer id;
/*    */   private Integer item_id;
/*    */   private Integer due_in_days;
/*    */ 
/*    */   public Integer getId()
/*    */   {
/*  9 */     return this.id;
/*    */   }
/*    */   public void setId(Integer id) {
/* 12 */     this.id = id;
/*    */   }
/*    */   public Integer getItem_id() {
/* 15 */     return this.item_id;
/*    */   }
/*    */   public void setItem_id(Integer item_id) {
/* 18 */     this.item_id = item_id;
/*    */   }
/*    */   public Integer getDue_in_days() {
/* 21 */     return this.due_in_days;
/*    */   }
/*    */   public void setDue_in_days(Integer due_in_days) {
/* 24 */     this.due_in_days = due_in_days;
/*    */   }
/*    */ 
/*    */   public String toString() {
/* 28 */     return "Item id:" + this.item_id + ", Due in days:" + this.due_in_days;
/*    */   }
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 33 */     return 321 * this.item_id.intValue() - this.due_in_days.intValue();
/*    */   }
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 39 */     if ((obj instanceof DueDays))
/*    */     {
/* 42 */       return (((DueDays)obj).item_id.equals(this.item_id)) && 
/* 41 */         (((DueDays)obj).id.equals(this.id));
/*    */     }
/*    */ 
/* 46 */     return false;
/*    */   }
/*    */ }
