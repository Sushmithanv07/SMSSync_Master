package com.sms.controller;


import com.sms.payload.SmsRequest;
import com.sms.service.SmsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping("/sendSms")
    public void sendSms(@RequestBody SmsRequest smsRequest){
        smsService.sendSms(smsRequest.getTo(), smsRequest.getMessage());
    }
}

