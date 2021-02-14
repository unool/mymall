package com.portfolio.mymall.repository;

import com.portfolio.mymall.domain.Board;
import com.portfolio.mymall.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

public class JpaBoardRepository implements BoardRepository{

    private final EntityManager entityManager;

    public JpaBoardRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Board save(Board board) {
        return null;
    }

    @Override
    public Optional<Board> findBySeq(Long seq) {
        return Optional.empty();
    }

    //페이징

    @Override
    public Long getBoardTotalCount(){
        return entityManager.createQuery
                ("select count(b) from Board b",Long.class)
                .getSingleResult();
    }



    @Override
    public Object getBoardWithMemberAll(Integer start, Integer end) {

        Object object = entityManager.createQuery("select b,m from Board b left join Member m order by b.seq desc")
                .setFirstResult(start)
                .setMaxResults(end)
                .getResultList();
        return object;
    }



    @Override
    public Long getBoardReplyCount() {

        Object object = entityManager.createQuery("select b, w from Board b left join b.writer_id w " +
                "left join Reply r ON r.board_seq = b.seq")
                .getResultList();
        return null;
    }

    //페이징

    @Override
    public List<Board> findAll() {
        return entityManager.createQuery("select b from Board b")
                .getResultList();

    }

}
