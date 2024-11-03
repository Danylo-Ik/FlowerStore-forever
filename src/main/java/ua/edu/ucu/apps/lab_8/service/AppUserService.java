package ua.edu.ucu.apps.lab_8.service;

import java.util.List;
import ua.edu.ucu.apps.lab_8.model.*;
import ua.edu.ucu.apps.lab_8.repository.AppUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    public AppUser createAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }
    public AppUser getAppUserByEmail(String email) {
        return appUserRepository.findByEmail(email);
    }
    
}
