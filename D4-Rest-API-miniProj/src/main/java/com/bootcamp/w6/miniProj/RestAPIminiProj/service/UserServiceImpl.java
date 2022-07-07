package com.bootcamp.w6.miniProj.RestAPIminiProj.service;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.bootcamp.w6.miniProj.RestAPIminiProj.enums.UserRole;
import com.bootcamp.w6.miniProj.RestAPIminiProj.exception.RecordNotFoundException;
import com.bootcamp.w6.miniProj.RestAPIminiProj.models.User;
import com.bootcamp.w6.miniProj.RestAPIminiProj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserRepository userRepository;

    //++++++++++++++++++++++++++++++++++++++++CREATE EMPLOYEE++++++++++++++++++++++++++++++++++++++
    @Override
    public User saveUser(User user) {
        Optional.ofNullable(user.getPassword()).ifPresent(password -> {
            user.setPassword(new BCryptPasswordEncoder().encode(password));
        });
        return userRepository.save(user);
    }
    //++++++++++++++++++++++++++++++++++++++++RETRIEVE EMPLOYEES++++++++++++++++++++++++++++++++++++
    @Override
    public Page<User> getUser(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
    //++++++++++++++++++++++++++++++++++++++++++UPDATE EMPLOYEE++++++++++++++++++++++++++++++++++++++
    @Override
    public User updateUserById(User user, Long id) throws RecordNotFoundException {
        return userRepository.findById(id).map(usr -> {
            usr.setUsername(user.getUsername());
            usr.setPassword(user.getPassword());
            usr.setRole(user.getRole());
            usr.setStatus(user.getStatus());
            return userRepository.save(usr);
        }).orElseThrow(() -> new RecordNotFoundException("Employee not Found"));
    }
    //+++++++++++++++++++++++++++++++++++++++++++DELETE EMPLOYEE+++++++++++++++++++++++++++++++++++++
    @Override
    public String deleteUser(Long id) throws RecordNotFoundException {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            userRepository.delete(userOptional.get());
            return "User with ID" + id + " has been deleted";
        } else
            throw new RecordNotFoundException("Employee not found!!");
    }
    //+++++++++++++++++++++++++++++++++++++++++GET EMPLOYEE BY ID+++++++++++++++++++++++++++++++++++++
    @Override
    public User getUserById(Long id) throws RecordNotFoundException {
        return userRepository.findById(id).orElseThrow(RecordNotFoundException::new);
    }

    //++++++++++++++++++++++++++++++++++++USER VALIDATION FOR AUTHENTICATION++++++++++++++++++++++++++
    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(userId);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
    }
    private List<SimpleGrantedAuthority> getAuthority(User user) {
        UserRole userRole = Arrays.stream(UserRole.values()).filter(role -> {
        return role.name().equalsIgnoreCase(user.getRole().name());
        }).findFirst().orElse(null);
     return Arrays.asList(new SimpleGrantedAuthority(String.format("ROLE_%s", userRole.name())));
    }
}

