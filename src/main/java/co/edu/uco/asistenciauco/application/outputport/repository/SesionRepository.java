package co.edu.uco.asistenciauco.application.outputport.repository;

import co.edu.uco.asistenciauco.application.outputport.entity.SesionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SesionRepository extends JpaRepository<SesionEntity, UUID> {
}
