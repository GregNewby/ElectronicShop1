/**
 * 
 */
package com.electronicshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electronicshop.entity.Purchase;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Repository
public interface PurchaseRepo extends JpaRepository<Purchase, Integer>{

}
