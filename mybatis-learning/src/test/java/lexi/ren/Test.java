package lexi.ren;

import mapper.*;
import model.Account;
import model.Employees;
import model.Score;
import model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        EmployeesMapper mapper = sqlSession.getMapper(EmployeesMapper.class);

        Employees employees=new Employees();
        employees.setName("张三");

        System.out.println(mapper.findByEmployees(employees));


//        // 查询
//        System.out.println(mapper.findById(4));
//
//        // Insert
//        Employees employees=new Employees();
//        employees.setAge(18);
//        employees.setName("zhagnsan");
//        employees.setPosition("上海市宜山路333号");
//        employees.setHire_time(new Date());
//        System.out.println(mapper.insertEmployees(employees));
//        sqlSession.commit();
//        System.out.println(employees);
//
//        // Update
//        employees.setName("张三");
//        mapper.updateEmployees(employees);
//        sqlSession.commit();
//
//
//        //Delete
//        mapper.deleteEmployees(employees.getId());
//        sqlSession.commit();


//        List<Account> list=sqlSession.selectList("mapper.AccountMapper.findAccountByNameWith$","li");
//        System.out.println(list);


//        Account account = sqlSession.selectOne("mapper.AccountMapper.findAccountById",1);
//        System.out.println(account);
//        sqlSession.close();



//        sqlSession.delete("mapper.AccountMapper.deleteAccountById",12);
//
//        sqlSession.commit();
//
//        sqlSession.close();
//        Account account = sqlSession.selectOne("mapper.AccountMapper.findAccountById",1);
//
//        System.out.println(account);
//
//        account.setName("hahah");
//
//        sqlSession.update("mapper.AccountMapper.updateAccount",account);
//
//        sqlSession.commit();
//        sqlSession.close();
//
//        List<Account> account= sqlSession.selectList("mapper.AccountMapper.findAccountByName","li%");
//
//        System.out.println(account);
//
//        Account account=new Account();
//        account.setName("zhangsan");
//        account.setBalance(123);
//
//        int count = sqlSession.insert("mapper.AccountMapper.insertAccount",account);
//
//        sqlSession.commit();
//        System.out.println(count);
//        System.out.println(account);


    }
}
