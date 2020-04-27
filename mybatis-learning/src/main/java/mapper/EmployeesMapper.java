package mapper;

import model.Employees;
import org.apache.ibatis.annotations.*;
import provider.SqlProvider;

import java.util.List;

public interface EmployeesMapper {
    //Select
    @Select("select * from employees where id=#{id}")
    Employees findById(int id);

    //Inset
    @Insert("insert into employees (name,age,position,hire_time) values (#{name},#{age},#{position},#{hire_time})")
    @SelectKey(keyColumn = "id",keyProperty = "id",statement = "select last_insert_id();",resultType = Integer.class,before = false)
    int insertEmployees(Employees employees);

    //Update
    @Update("update employees set name=#{name},age=#{age},position=#{position},hire_time=#{hire_time} where id=#{id}")
    int updateEmployees(Employees employees);

    //delete
    @Delete("delete from employees where id=#{id}")
    int deleteEmployees(int id);


    @Results(id = "employees_mapper",
        value = {
                @Result(property = "id",column = "e_id"),
                @Result(property = "name",column = "e_name"),
                @Result(property = "age",column = "e_age"),
                @Result(property = "position",column = "e_position"),
                @Result(property = "hire_time",column = "e_hire_time"),
        }
    )
    @Select("select id as e_id,name as e_name,age as e_age,position as e_position,hire_time as e_hire_time from employees")
    List<Employees> findAll();

    // ResultMap 对应上面 Results 的Id,可以重复利用
    @ResultMap("employees_mapper")
    @Select("select id as e_id,name as e_name,age as e_age,position as e_position,hire_time as e_hire_time from employees where name like #{name}")
    List<Employees> findByName(String name);

    // ResultMap 对应上面 Results 的Id,可以重复利用
    @SelectProvider(type = SqlProvider.class,method = "findByEmployees")
    List<Employees> findByEmployees(Employees employees);
}
