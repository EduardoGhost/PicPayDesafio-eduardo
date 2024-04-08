package org.example.services;

import org.example.Domain.user.User;
import org.example.dto.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class NotificationService {

    @Autowired
    private RestTemplate restTemplate;

    public void senderNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, message);

//        ResponseEntity<String> notificationResponse = restTemplate.postForEntity("http://o4d9z.mocklab.io/notify", notificationRequest, String.class);
//
//        if(notificationResponse.getStatusCode() == HttpStatus.OK){
//            System.out.println("Erro Notificação");
//            throw new Exception("Serviço denotificação fora do ar");
//
//        }
        System.out.println("noti enviada ao user");
    }
}


