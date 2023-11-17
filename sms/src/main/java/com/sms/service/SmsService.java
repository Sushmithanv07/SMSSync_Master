package com.sms.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    @Value("${twilio.accountSID}")
    private String twilioAccountSid;
    @Value("${twilio.authToken}")
    private String twilioAuthToken;

        public void sendSms(String to, String body){
            Twilio.init(twilioAccountSid, twilioAuthToken);

            Message message = Message.creator(
                    new PhoneNumber(to),
                    new PhoneNumber("+16562130478"),  // your Twilio Phone No.
                    body
            ).create();
            //System.out.println("message Sid:" +message);
        }
    }


