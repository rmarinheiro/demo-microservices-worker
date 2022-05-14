package workerhr.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import workerhr.microservices.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
