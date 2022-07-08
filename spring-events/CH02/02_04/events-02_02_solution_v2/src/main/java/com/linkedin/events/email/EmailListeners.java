package com.linkedin.events.email;

import com.linkedin.events.customer.CustomerRegisteredEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailListeners
{
    private final EmailService emailService;

    @EventListener
    public void onRegisterEvent(CustomerRegisteredEvent event)
    {
        emailService.sendRegisterEmail(event.getCustomer());
    }
}
