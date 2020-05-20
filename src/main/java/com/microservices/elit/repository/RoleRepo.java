package com.microservices.elit.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.microservices.elit.model.Role;
@RepositoryRestResource(collectionResourceRel = "Role", path = "Role")
public interface RoleRepo  extends JpaRepository<Role, Integer> {

}