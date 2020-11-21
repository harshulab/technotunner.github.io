package hackathon.octahacks.complaintregistration.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import hackathon.octahacks.complaintregistration.entity.Department;

public interface RoomRepository extends MongoRepository<Department, String> {

}

