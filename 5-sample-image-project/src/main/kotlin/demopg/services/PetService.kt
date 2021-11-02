package com.example.demopg.services

import com.example.demopg.entities.Pet
import com.example.demopg.entities.PetDescription
import com.example.demopg.entities.PetType
import com.example.demopg.repository.PetRepository
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class PetService(
    private val repo: PetRepository
) {
    
    fun findPets() = repo.findAll()
    
    fun findPetDescriptionById(petId: Long): Pet {
        return repo.findById(petId).get()
    }
    
    @PostConstruct
    fun bootstrap() {
        repo.save(Pet(null, 52485027, "Dax", PetType.DOG))
        repo.save(Pet(null, 52485026, "Oreo", PetType.CAT))
    }
}
