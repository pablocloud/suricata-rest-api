package com.besuricata.rest.repositories;

import com.besuricata.rest.domain.Suricata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface SuricataRepository extends JpaRepository<Suricata, Long> {

    Suricata findByName(String name);

    Collection<Suricata> findAllByHeightGreaterThanEqual(Double height);

}
