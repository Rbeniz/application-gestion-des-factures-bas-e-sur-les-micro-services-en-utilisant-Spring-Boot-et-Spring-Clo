package org.sid.securityservice.service;

import org.sid.securityservice.entities.AppRole;
import org.sid.securityservice.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String userName, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
