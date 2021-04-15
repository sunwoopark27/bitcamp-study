// 애노테이션 중복 사용 - 여러 번 사용 가
package com.eomcs.annotation.ex7;

import java.lang.annotation.Repeatable;
// 애노테이션을 중복해서 사용할 수 있게 하려면
// - @Repeatable로 표시해 줘야한다.
// - 이 때 반복에 대한 정보를 따로 정의한 애노테이션을 지정해야 한다.
@Repeatable(Employees.class)
public @interface Employee {
  String value();
}


