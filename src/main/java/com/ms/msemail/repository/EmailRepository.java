package com.ms.msemail.repository;

import com.ms.msemail.dtos.EmailDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailDto, UUID> {
}
