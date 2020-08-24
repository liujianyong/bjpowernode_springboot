package com.bjpowernode.springboot.mapper;

import com.bjpowernode.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // 或者是在主类上添加 @MapperScan("com.bjpowernode.springboot.mapper") 注解包扫描
//加maper是为了将此类变为spring的bean
public interface StudentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAllStudent();
}
