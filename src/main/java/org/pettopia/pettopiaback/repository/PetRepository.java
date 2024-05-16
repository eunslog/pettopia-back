package org.pettopia.pettopiaback.repository;

import org.pettopia.pettopiaback.domain.Pet;
import org.pettopia.pettopiaback.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {


    Pet findByUsers(Users user);
    List<Pet> findAllByUsers(Users user);


}
