package com.portfolio.mymall.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Builder
@Data
public class PageResultDTO<DTO> {


    //list
    private List<DTO> dtoList;

    //total page num
    private int totalPage;

    //cur page num
    private int page;

    //list size
    private int size;

    //start, end page num
    private int start, end;

    //pre, nex
    private  boolean prev, next;

    //page num list
    private List<Integer> pageList;


//    public PageResultDTO(Page<EN> result, Function<EN, DTO> fn){
//
//        dtoList = result.stream().map(fn).collect(Collectors.toList()); //Page<Entity> 형태의 DB 데이터를 DTO 리스트로 변환 (서비스에서 데이터 핸들링 하기위해)
//
//        totalPage = result.getTotalPages();
//
//        makePageList(result.getPageable());
//
//    }

}
