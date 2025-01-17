package com.example.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // สามารถเพิ่ม query methods ที่กำหนดเองได้ที่นี่ ถ้าต้องการ
}
