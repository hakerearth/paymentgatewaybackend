package com.example.paymentgatewaybackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RestController
@RequestMapping(PaymentController.BASE)
public class PaymentController {

     public static final String BASE = "/api/Payment/";

     @GetMapping("/")
     public String tester() {
          return "testing the root path /";
     }

     @PostMapping("setStatus/")
     public String setStatus() {
          return "Inside setStatus";
     }

     @PostMapping("rrlPaymentInitiate/")
     public String getPaymentStatus() {
          return "Inside getPaymentStatus";
     }


}
