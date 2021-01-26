package me.hyeonwoo.demospringmvc;

import lombok.*;

import java.time.LocalDateTime;

// pojo  Model

/**
 * Maven -> compile -> target 디렉토리
 * 애노테이션 자바코드로 구현된 것을 확인한다.
 */
@Getter
@Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Event {

    private String name;

    private int limitOfEnrollment;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;


}
