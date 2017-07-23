package TrimaximumSoftware.trimaximum.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import TrimaximumSoftware.trimaximum.model.Role;
import TrimaximumSoftware.trimaximum.model.User;
import TrimaximumSoftware.trimaximum.repository.RoleRepository;
import TrimaximumSoftware.trimaximum.repository.UserRepository;
import TrimaximumSoftware.trimaximum.service.UserService;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<Role>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
