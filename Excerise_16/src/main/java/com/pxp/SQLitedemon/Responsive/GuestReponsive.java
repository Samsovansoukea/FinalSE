package com.pxp.SQLitedemon.Responsive;



import com.pxp.SQLitedemon.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GuestReponsive extends JpaRepository<Guest, Integer>{

	public boolean existsByName(String name);

    public List<Guest> findByName(String name);

    @Query("select max(s.id) from Guest s")
    public Integer findMaxId();
}