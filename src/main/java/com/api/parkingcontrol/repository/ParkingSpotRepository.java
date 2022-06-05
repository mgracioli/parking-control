package com.api.parkingcontrol.repository;

import com.api.parkingcontrol.model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
    public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    //como esses métodos são personalizados, não é um metodo pronto do JpaRepository, eu declaro eles aqui
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByparkingSpotNumber(String parkingSpotNumber);
    boolean existsByAppartmentAndBlock(String apartment, String block);
}
