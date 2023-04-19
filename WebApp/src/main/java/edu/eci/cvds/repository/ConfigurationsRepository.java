
package edu.eci.cvds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.eci.cvds.model.*;

@Repository
public interface ConfigurationsRepository extends JpaRepository<Configuration, String>{
    
}
