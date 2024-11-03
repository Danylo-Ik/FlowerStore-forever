package ua.edu.ucu.apps.lab_8.controller;
import java.util.List;
import ua.edu.ucu.apps.lab_8.model.*;
import ua.edu.ucu.apps.lab_8.service.AppUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AppUserController {
        
        private AppUserService appUserService;
    
        @Autowired
        public AppUserController(AppUserService appUserService) {
            this.appUserService = appUserService;
        }
    
        @GetMapping("/app_users")
        public List<AppUser> getAppUsers() {
            return appUserService.getAppUsers();
        }
    
        @PostMapping("/app_users")
        public AppUser createAppUser(@RequestBody AppUser appUser) {
            return appUserService.createAppUser(appUser);
        }



@GetMapping("/app_users/email")
public ResponseEntity<AppUser> getAppUserByEmail(@RequestParam String email) {
    AppUser appUser = appUserService.getAppUserByEmail(email);
    if (appUser == null) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return ResponseEntity.notFound().build();
}

}