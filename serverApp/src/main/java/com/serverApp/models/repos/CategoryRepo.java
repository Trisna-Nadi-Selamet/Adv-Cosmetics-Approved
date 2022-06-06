//package com.serverApp.models.repos;
//
//import java.util.List;
//
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;
//import org.apache.ibatis.annotations.Update;
//
//import com.serverApp.models.Category;
//
//@Mapper
//public interface CategoryRepo {
//
//	@Select("SELECT * FROM approval")
//    public  List <Category> findAll();
//
//	
//    @Select("SELECT * FROM approval WHERE id = #{id}")
//    public Category findById(String id);
//
//  
//    
//    @Insert("INSERT INTO approval(id,category,username,Lev_User) VALUES (#{id}, #{category}, #{userName}, #{levUser})")
//    public int insert(Category category);
//
//    
//    //@Update("UPDATE approval SET jenis = #{jenis}, username = #{userName}, Lev_User = #{levUser} WHERE id = #{id}")
//    public int update(Category category);
//}
