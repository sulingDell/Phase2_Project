package com.simplilearn.userShoppingCart.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.userShoppingCart.entity.UserShoppingCart;

public interface UserShoppingCartRepository extends JpaRepository<UserShoppingCart, Integer>{

}
