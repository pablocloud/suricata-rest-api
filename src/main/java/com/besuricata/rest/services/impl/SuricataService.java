package com.besuricata.rest.services.impl;

import com.besuricata.rest.domain.Suricata;
import com.besuricata.rest.repositories.SuricataRepository;
import com.besuricata.rest.services.BasicServiceAbstract;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SuricataService extends BasicServiceAbstract<Suricata, Long> {

    public SuricataService(SuricataRepository suricataRepository) {
        this.repository = suricataRepository;
    }

    public Suricata findSuricataByName(String name) {
        return ((SuricataRepository) repository).findByName(name);
    }

    public Collection<Suricata> findAllByMinimunHeight(Double height) {
        return ((SuricataRepository) repository).findAllByHeightGreaterThanEqual(height);
    }

}
