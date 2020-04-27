package provider;

import com.mysql.cj.util.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class SqlProvider {
    public String findByEmployees(final Map<String, Object> para)
    {
        return new SQL(){
            {
                SELECT("*");
                FROM("employees");
                if(!StringUtils.isNullOrEmpty((String) para.get("name")))
                {
                    WHERE("name=#{name}");
                }
                if(!StringUtils.isNullOrEmpty((String) para.get("position")))
                {
                    WHERE("position=#{position}");
                }
            }
        }.toString();
    }
}
