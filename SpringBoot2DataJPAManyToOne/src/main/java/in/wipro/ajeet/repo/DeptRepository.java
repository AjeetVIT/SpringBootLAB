package in.wipro.ajeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.wipro.ajeet.model.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer> {

}
