package com.saosebastiao.escontroEJC.repository;

import com.saosebastiao.escontroEJC.entity.OqueAchouVideo;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OqueAchouRepository extends JpaRepository<OqueAchouVideo, Long> {
    @Modifying
    @Transactional
    @Query("UPDATE OqueAchouVideo v SET v.ameiCount = v.ameiCount + 1 WHERE v.id = 1")
    void incrementAmei();

    @Modifying
    @Transactional
    @Query("UPDATE OqueAchouVideo v SET v.rachoCount = v.rachoCount + 1 WHERE v.id = 1")
    void incrementRacho();

    @Modifying
    @Transactional
    @Query("UPDATE OqueAchouVideo v SET v.abencoadoCount = v.abencoadoCount + 1 WHERE v.id = 1")
    void incrementAbencoado();

    @Modifying
    @Transactional
    @Query("UPDATE OqueAchouVideo v SET v.topCount = v.topCount + 1 WHERE v.id = 1")
    void incrementTop();
}
