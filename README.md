# java-springboot-2025
2025 java개발자 과정 레포지토리

## 1일차 (04-01)

### 웹 개요
- 구성 3단계
    - 브라우저(클라이언트/프론트엔드) -  사용자 **요청**을 하고, 그 결과를 돌려받는 파트
    - 서버(백엔드) -  사용자의 요청을 받아서 DB에서 데이터를 가져와 처리하고, 사용자에게 **응답**하는 파트
    - 데이터베이스 - 가장 중요한 데이터가 저장되어 있는 파트
- 웹 개념
    - 사용자 Request(요청)에 대한 서버의 Response(응답)

### Spring Boot 개요
- java - 컴퓨팅 세상 모든곳에서 사용될 수 있는 언어가 되고자 개발됨
- 웹 개발
    1. CGI(Common Gateway Interface) - HTTP 프로토콜에서 정적인 데이터만 전달할 수 있는 웹기술
    2. Servlet - CGI를 개선한 Java 웹기술. 동적웹을 개발할 수 있음 
        - HTML코드를 전부다 Java에서 작성해야 함
    3. EJB(Enterprise Java Bean) - 서블릿으로 대형 프로젝트를 개발할 수 있는 Java 웹기술
        - 무지하게 복잡!
    4. JSP(Java Server Page) - 웹페이지 코드(HTML)에 자바코드를 포함시켜서 개발할 수 있는 Java 웹기술
        - 확장자가 .jsp/ 스파게티 코드
    5. Spring - Java웹개발에 전성기. 웹페이지와 자바영역 분리.
        - 설정이 복잡
    6. Spring Boot - Spring의 단접을 최소화. 설정을 간결화

- Spring Boot
    - Spring 기술을 그대로 사용(마이그레이션이 간단)
    - JPA 기술을 사용하면 ERD나 DB설계를 하지 않고도 손쉽게 DB를 생성
    - Tomcat Webserver가 내장!(설치 필요없음)
    - 서포트하는 기능 다수 존재(개발을 쉽게 도와줌)
    - 테스트용 JUnit, 로그용 Log4J2 모두 포함(설치 필요없음)
    - 프론트엔드를 다양하게 지원. JSP, **Thymeleaf**, Mustache 등
    - React 등의 자바스크립트 프론트엔드와 연계해서 풀스택 개발 가능
    - MVC(Model View Controller)로 영역을 분리, 각 부분별로 따로 개발

-MVC
    - view는 JSP포함, Thymeleaf, Mustach, HTML 등등
    <img src ="./image/sb001.png" width="600">

### Spring Boot 개발환경 설정
- 필요요소
    - Java, 개발 툴, 데이터베이스

- Java
    - java Runtime과 JDK(Java Developer Kit) 존재
        - Oracle 외에도 OpenJDK가 산재
        - https://jdk.java.net/
        - https://adoptium.net/
        - https://www.azul.com/downloads/?package=jdk#zulu
    - Java 17버전 이상설치
    - https://www.oracle.com/kr/java/technologies/downloads/archive/
    - jdk17 msi 다운로드
    
    - 시스템 정보(sysdm.cpl) 고급 > 환경변수 PATH 설정
        - 새로만들기
            - JAVA_HOME - 본인경로 입력
        - path에 %JAVA_HOME%\bin 추가, 맨 위로
    - powershell
        - java --version으로 확인

- VScode 확장 설치
    - Java 검색
        - Extension Pack for Java 설치, Debugger Pack for Java 등 7가지 설치

### 자바 기본실행
- VS Code에서 명령팔레트 실행 Ctrl+Shift+P
    - Java Create
        1. build tool 선택 > Maven
        2. No ArchType 선택
        3. Group ID 입력(com.example)
        4. Artifact ID 입력(demo)
        5. 저장위치 결정

### Spring Boot 설정
- VScode 확장 설치
    - Spring boot검색 
        - Spring Boot Extension Pack 설치(추가 3개 확장 설치 됨)
    - Gradle 검색
        - Gradle for Java 설치

### Spring Boot 기본 실행
- VS Code에서 명령 팔레트 실행
    - Spring Initializr : Create a Maven Project
    - Specify Spring Boot version : 3.3.10 선택
    - Specify project language : Java 선택
    - Input Group ID : com.hugo83(각자 설정할것)
    - Inpur Arcifact ID : spring_01
    - Specify packaging type : Jar(Java archive, 압축파일)
    - Specify Java version : 17
    - Choose dependencise : 
    - 저장위치
    - **새 창열기** - Spring Boot 프로젝트가 루트폴더가 된 개발 환경

- 실행 방법
    - 코드 작성
    - Spring Boot Dashboard > Apps > 앱 실행

- 기초문법
    - [자바기초문법](./Java_Basic.md)

## 2일차
- 기초문법 계속
    - [자바기초문법](./Java_Basic.md)
    - 흐름제어(반복문), 배열, 매서드, 객체/클래스, 상속

## 3일차
- 기초문법 계속
    - [자바기초문법](./Java_Basic.md)
    - 상속, 인터페이스, 예외처리, 제네릭, 컬렉션 프레임 워크, 입출력

## 4일차

## 5일차
