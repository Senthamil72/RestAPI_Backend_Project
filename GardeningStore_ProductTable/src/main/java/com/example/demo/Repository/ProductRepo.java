package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import com.example.demo.model.Bike;
import com.example.demo.model.Prodect;

import jakarta.transaction.Transactional;

public interface ProductRepo extends JpaRepository<Prodect, Integer>{
	
	@Query(value="select * from prodecttable where productid=:sn",nativeQuery=true)
	public List<Prodect>getid(@Param("sn") int id);
	
	@Query(value="select * from prodecttable where name=:sn",nativeQuery=true)
	public List<Prodect>getname(@Param("sn") String productname);
	
	@Query(value="select * from prodecttable where price=:sn",nativeQuery=true)
	public List<Prodect>getprice(@Param("sn") String price);
	@Modifying
	@Transactional
	@Query(value="delete  from prodecttable where productid=:sn",nativeQuery=true)
	public Integer deleteid(@Param("sn") int id);
	@Modifying
	@Transactional
	@Query(value="update  from prodecttable where productid=:sn",nativeQuery=true)
	public Integer updateid(@Param("sn") int id);

}
