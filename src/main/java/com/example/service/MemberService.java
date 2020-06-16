package com.example.service;

import com.example.domain.Member;
import com.example.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@Transactional
public class MemberService {

    @Autowired
    private MemberRepository repository;

    public List<Member> findByPartOfName(String partOfName) {
        return repository.findByPartOfName(partOfName);
    }

}
