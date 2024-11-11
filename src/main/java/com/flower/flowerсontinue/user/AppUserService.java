package com.flower.flowerсontinue.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public void addUser(AppUser user) {
        appUserRepository.findUserByEmail(user.getEmail())
                .ifPresent(existingUser -> {
                    throw new IllegalStateException("Email already in use");
                });
        appUserRepository.save(user);
    }
}