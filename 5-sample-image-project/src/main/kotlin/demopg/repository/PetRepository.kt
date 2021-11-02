package com.example.demopg.repository

import com.example.demopg.entities.Pet
import org.springframework.data.repository.CrudRepository

interface PetRepository : CrudRepository<Pet?, Long?>
