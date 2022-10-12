package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Ventor;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        Customer siddhi = new Customer();

        siddhi.setName("Siddhi");
        siddhi.setCity("Nagpur");
        siddhi.setAddress("New Nandanvan Nagpur");
        siddhi.setState("Maharashtra");
        siddhi.setEmailId("abc@gmail.com");
        siddhi.setPhonenumber("9284787814L");

        System.out.println("Name :" + siddhi.getName());
        System.out.println("City :" + siddhi.getCity());
        System.out.println("State :" + siddhi.getAddress());
        System.out.println("Address :" + siddhi.getState());
        System.out.println("Emailid :" + siddhi.getEmailId());
        System.out.println("Phone :" + siddhi.getPhonenumber());


        Ventor haldiram = new Ventor();
        haldiram.setName("Haldiram Veg Restaurent");
        haldiram.setAddress("Ajni square nagpur");
        haldiram.setCategory("VEG");
        haldiram.setPhonenumber(071122336);
        haldiram.setRating(5.0);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Ventor Detail");
        System.out.println("Name :"+haldiram.getName() );
        System.out.println("Address:"+haldiram.getAddress());
        System.out.println("Category:"+haldiram.getCategory());
        System.out.println("Phone:"+haldiram.getPhonenumber());
        System.out.println("Rating:"+haldiram.getRating());
        System.out.println("State:"+haldiram.getState());
        System.out.println("City:"+haldiram.getCity());




        Order order = new Order();
        order.setCustomername("Siddhi");
        order.setVentor(haldiram);
        order.setTotalAmount(999.00);
        order.setOrderdate(new Date());
        order.setDeliveryaddress("101,Civil line Nagpur");


        System.out.println("Order Details");
        System.out.println("Total Amount:"+order.getTotalAmount());
        System.out.println("Order Date:"+order.getOrderdate());
        System.out.println("order Delivery Adress:"+order.getDeliveryaddress());

    }
}


