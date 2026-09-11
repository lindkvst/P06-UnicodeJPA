package org.example.p06unicodejpa.repository;

import org.example.p06unicodejpa.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {

    //void saveAll(Set set);

    //Set unicode(int unicode);
}
