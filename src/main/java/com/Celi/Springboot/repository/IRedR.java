
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.RedE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRedR  extends JpaRepository<RedE, Long> {
}
