/*    */ package com.calance.entity;
/*    */ 
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class ShoppingCart
/*    */ {
/*    */   private Set<Movie> movieItems;
/*    */   private Double grandTotal;
/*    */ 
/*    */   public Double getGrandTotal()
/*    */   {
/* 13 */     return this.grandTotal;
/*    */   }
/*    */   public void setGrandTotal(Double grandTotal) {
/* 16 */     this.grandTotal = grandTotal;
/*    */   }
/*    */   public ShoppingCart() {
/* 19 */     this.movieItems = new HashSet();
/* 20 */     this.grandTotal = Double.valueOf(0.0D);
/*    */   }
/*    */   public Set<Movie> getMovieItems() {
/* 23 */     return this.movieItems;
/*    */   }
/*    */ 
/*    */   public void setMovieItems(Set<Movie> movieItems) {
/* 27 */     this.movieItems = movieItems;
/*    */   }
/*    */ 
/*    */   public synchronized void addItem(Movie movie) {
/* 31 */     if (this.movieItems.add(movie))
/* 32 */       this.grandTotal = Double.valueOf(this.grandTotal.doubleValue() + movie.getRent_amt().doubleValue());
/*    */   }
/*    */ 
/*    */   public synchronized void removeItem(Movie movie)
/*    */   {
/* 37 */     if (this.movieItems.remove(movie))
/* 38 */       this.grandTotal = Double.valueOf(this.grandTotal.doubleValue() - movie.getRent_amt().doubleValue());
/*    */   }
/*    */ }

