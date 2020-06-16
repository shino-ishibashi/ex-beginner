package com.example.repository;

import com.example.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepository {

    private static final RowMapper<Member> MEMBER_ROW_MAPPER = (rs, i) ->{
      Member member = new Member();
      member.setId(rs.getInt("id"));
      member.setName(rs.getString("name"));
      member.setAge(rs.getInt("age"));
      member.setDepId(rs.getInt("dep_id"));
      return member;
    };


    @Autowired
    private NamedParameterJdbcTemplate template;

    public List<Member> findByPartOfName(String partOfName) {
        String sql = "select id,name,age,dep_id from members where name like :partOfName order by age";
        // SETECT * ではresult set に入らない
        String partOfNameQuery = "%" + partOfName + "%";
        SqlParameterSource param = new MapSqlParameterSource().addValue("partOfName",partOfNameQuery);

        List<Member> membersList = template.query(sql, param, MEMBER_ROW_MAPPER);

        return membersList;
    }

}
