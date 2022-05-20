package net.example.eshop.dao;

import net.example.eshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByName (String name);
}
