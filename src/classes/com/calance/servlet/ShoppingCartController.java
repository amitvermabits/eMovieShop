/*     */ package com.calance.servlet;
/*     */ 
/*     */ import com.calance.entity.BillDetails;
/*     */ import com.calance.entity.DueDays;
/*     */ import com.calance.entity.Member;
/*     */ import com.calance.entity.Movie;
/*     */ import com.calance.entity.RentDetails;
/*     */ import com.calance.entity.ShoppingCart;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.HashMap;
import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServlet;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*     */ 
/*     */ public class ShoppingCartController extends HttpServlet
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */ 
/*     */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  42 */     super.doGet(request, response);
/*     */   }
/*     */ 
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  50 */     if (request.getParameter("addToCart") != null) {
/*  51 */       processAddToCart(request, response);
/*     */     }
/*  53 */     if (request.getParameter("removeItemsFromCart") != null) {
/*  54 */       processRemoveItemsFromCart(request, response);
/*     */     }
/*  56 */     if (request.getParameter("confirmCartItems") != null)
/*  57 */       processConfirmCartItems(request, response);
/*     */   }
/*     */ 
/*     */   private void processAddToCart(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  66 */     List movies = null;
/*  67 */     ShoppingCart shoppingCart = (ShoppingCart)request.getSession().getAttribute("shoppingCart");
/*     */ 
/*  69 */     if (shoppingCart == null) {
/*  70 */       shoppingCart = new ShoppingCart();
/*     */     }
/*     */ 
/*  73 */     String[] items = request.getParameterValues("items");
/*     */ 
/*  75 */     if (items != null)
/*     */     {
/*  77 */       movies = (List)request.getSession().getAttribute("collection");
/*  78 */       Map movieMap = new HashMap();
/*     */ 
/*  80 */       if(movies != null){
					Iterator itr = movies.iterator(); 
					while(itr.hasNext()) {


/* 132 */       Movie movie = (Movie) itr.next();

/*  81 */         movieMap.put(movie.getId(), movie);
/*     */       }
			}
/*     */ 
/*  84 */       if (items.length > 0) {
/*  85 */         for (int i = 0; i < items.length; i++) {
/*  86 */           shoppingCart.addItem((Movie)movieMap.get(Integer.valueOf(items[i])));
/*     */         }
/*     */       }
/*  89 */       request.getSession().setAttribute("shoppingCart", shoppingCart);
/*  90 */       request.getSession().setAttribute("cartItemsMap", movieMap);
/*  91 */       Forwarder.forward("/WEB-INF/jsp/cart/shoppingCart.jsp", request, response);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void processRemoveItemsFromCart(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 101 */     ShoppingCart shoppingCart = (ShoppingCart)request.getSession().getAttribute("shoppingCart");
/* 102 */     String[] items = request.getParameterValues("cartItems");
/* 103 */     Map movieMap = (Map)request.getSession().getAttribute("cartItemsMap");
/*     */ 
/* 105 */     if (items.length > 0) {
/* 106 */       for (int i = 0; i < items.length; i++) {
/* 107 */         shoppingCart.removeItem((Movie)movieMap.get(Integer.valueOf(items[i])));
/*     */       }
/*     */     }
/*     */ 
/* 111 */     request.getSession().setAttribute("shoppingCart", shoppingCart);
/* 112 */     request.getSession().setAttribute("cartItemsMap", movieMap);
/* 113 */     Forwarder.forward("/WEB-INF/jsp/cart/shoppingCart.jsp", request, response);
/*     */   }
/*     */ 
/*     */   private void processConfirmCartItems(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 121 */     ShoppingCart shoppingCart = (ShoppingCart)request.getSession().getAttribute("shoppingCart");
/*     */ 
/* 123 */     BillDetails billDetails = new BillDetails();
/*     */ 
/* 125 */     List rentDetailsList = new ArrayList();
/*     */ 
/* 128 */     Double grandTotal = Double.valueOf(0.0D);
/* 129 */     Member member = (Member)request.getSession().getAttribute("user");
/*     */ 
/* 131 */     Set movies = shoppingCart.getMovieItems();
              if(movies != null){
            	  Iterator itr = movies.iterator(); 
            	  while(itr.hasNext()) {


/* 132 */       Movie movie = (Movie) itr.next();
/* 134 */       RentDetails rentDetails = new RentDetails();
/*     */ 
/* 137 */       rentDetails.setItem_id(movie.getId());
/* 138 */       rentDetails.setItem_name(movie.getName());
/*     */ 
/* 140 */       rentDetails.setMember_id(member.getId());
/* 141 */       rentDetails.setRent_amt(movie.getRent_amt());
/*     */ 
/* 143 */       Calendar dueDate = Calendar.getInstance();
/* 144 */       rentDetails.setStart_date(Calendar.getInstance().getTime());
/* 145 */       dueDate.add(5, movie.getDueDays().getDue_in_days().intValue());
/* 146 */       rentDetails.setDue_date(dueDate.getTime());
/* 147 */       grandTotal = Double.valueOf(grandTotal.doubleValue() + rentDetails.getRent_amt().doubleValue());
/* 148 */       rentDetailsList.add(rentDetails);
/*     */     }
/*     */ }
/* 152 */     billDetails.setRentList(rentDetailsList);
/*     */ 
/* 155 */     billDetails.setService_tax(Double.valueOf(10.300000000000001D));
/* 156 */     billDetails.setNet_payable(Double.valueOf(grandTotal.doubleValue() * (1.0D + billDetails.getService_tax().doubleValue() / 100.0D)));
/* 157 */     request.getSession().setAttribute("billDetails", billDetails);
/* 158 */     Forwarder.forward("/WEB-INF/jsp/payment/paymentDetails.jsp", request, response);
/*     */   }
/*     */ }

