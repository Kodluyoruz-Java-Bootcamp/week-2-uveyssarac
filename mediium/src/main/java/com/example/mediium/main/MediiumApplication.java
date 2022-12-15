package com.example.mediium.main;

import com.example.mediium.model.User;
import com.example.mediium.model.Writing;
import com.example.mediium.service.UserService;
import com.example.mediium.service.WritingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class MediiumApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediiumApplication.class, args);
//UserService Katmanına ulaşma
        UserService userService = new UserService();
        WritingService writingService = new WritingService();
//User oluşturma
        User user1 = new User(1, "user1.com", "1234u1", "Üveys Saraç");
        User user2 = new User(2, "user2.com", "1234u2", "Cem Dırman");
//Yazı oluşturma
        Writing writing1 = new Writing("Java", "Java güzel bir dildir.", List.of("Java", "Yazılım"), user1, LocalDate.now());
        Writing writing2 = new Writing("C#", "C# javadan kötü bir dildir.", List.of("C#", "Yazılım"), user1, LocalDate.now());

        user1.setMyWritings(List.of(writing1, writing2));
//UserService üzerinden user create etme yada listeye ekleme bakış açımıza göre değişir
        userService.createUser(user1);
        userService.createUser(user2);
//WritingService üzerinden writing create etme
        writingService.createWriting((writing1));
        writingService.createWriting((writing1));

        //userService.printAll();
        writingService.printAll();


    }

}
