package api.api;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    @Select("SELECT * FROM city WHERE country = #{country}")
    City findByState(@Param("country") String country);
}