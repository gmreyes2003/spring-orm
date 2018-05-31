package net.viralpatel.spring.repository;

import net.viralpatel.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
