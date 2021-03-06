package com.reactspringreview.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConsultantRepository extends JpaRepository<Consultant, Long> {
}
