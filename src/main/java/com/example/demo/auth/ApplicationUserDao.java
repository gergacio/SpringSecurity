package com.example.demo.auth;

import java.awt.desktop.OpenFilesEvent;
import java.util.Optional;

public interface ApplicationUserDao {
     Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
