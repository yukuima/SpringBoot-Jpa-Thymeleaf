package com.myk.learning.thymeleaf.service;

import com.myk.learning.thymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface User repository.
 *
 * @author <a href="https://github.com/myk" style="background: #55a7e3;">myk</a>
 */
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Find by id user.
     *
     * @param id the id
     * @return the user
     */
    User findById(long id);

}
