package com.portfolio.mymall.repository;


import com.portfolio.mymall.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@SpringBootTest
//@Transactional
public class JpaMemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;


//
//
////    @Test
//    public void getList()
//    {
//        List<Member> list = memberRepository.findAll();
//
//        System.out.println("====================");
//        for(Member m : list)
//        {
//            System.out.println(m.toString());
//        }
//
//        System.out.println("====================");
//    }
//
//    @Commit
//    @Test
//    public void save() {
//        Member member1 = new Member();
//        member1.setId("wot0011");
//        member1.setBase("경기도");
//        member1.setDetail("주교동");
//        member1.setNick("ㅋㅋ");
//        member1.setPassword("11");
//        member1.setPhone("111");
//
//        Member result = memberRepository.save(member1);
//
//        getList();
//    }

//    @Test
//    public Optional<Member> findBySeq(Long seq) {
//
//    }
//
//    @Test
//    public Optional<Member> findById(String id) {
//
//    }
//
//    @Test
//    public List<Member> findAll() {
//
//    }
//
//    @Commit


//    @Test
//    public void clearAll() {
//        memberRepository.clearAll();
////        getList();
//    }
//
//    @Test
//    public void clearAll() {
//        memberRepository.clearAll();
//        getList();
//    }
//

}
