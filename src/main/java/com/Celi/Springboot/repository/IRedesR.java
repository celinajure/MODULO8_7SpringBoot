
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.RedesE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRedesR  extends JpaRepository<RedesE, Long> {
    
}
