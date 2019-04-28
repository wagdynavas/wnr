package com.wagdynavas.register.repositoty;

import com.wagdynavas.register.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, Long> {

    Reader findByUsername(String username);
}
