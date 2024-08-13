#!/bin/bash

# Q001_solution
CASE1_SOLUTION=$(echo -e "2360\n3776\n1416\n181720")

# chung
CLASS_DIR="chung"
JAVA_FILE="chung/Solution1.java"

# 클래스 파일의 이름을 추출합니다 (파일명에서 .java 확장자 제거)
CLASS_NAME=$(basename "$JAVA_FILE" .java)

# Java 파일 컴파일
javac "$JAVA_FILE"

# 실행
if [ $? -eq 0 ]; then
  echo " - - - - Solution1.class - - - - "
  echo " input1 = 472, input2 = 385"
  echo " - - - - Result - - - - "
  SOLUTION1_OUTPUT=$(echo -e "472\n385" | java -cp "$CLASS_DIR" "$CLASS_NAME")

  if [ "$SOLUTION1_OUTPUT" == "$CASE1_SOLUTION" ]; then
    echo "Solution1 . . . . . . . . [ pass ]"
  else 
    echo "Solution1 . . . . . . . . [ fail ]"
    echo "실제 출력값:"
    echo "$SOLUTION1_OUTPUT"
    echo "기대값:"
    echo "$CASE1_SOLUTION"
  fi

  # Solution1.class 파일 삭제
  rm "$CLASS_DIR/${CLASS_NAME}.class"
  echo "Solution1.class 파일이 삭제되었습니다."

else
  echo "컴파일 오류 발생"
fi
