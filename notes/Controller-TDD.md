

# TDD - Controller
## Controller

## 개요

### post
1. test class 생성
2. @WebMvcTest
3. @Autowired MockMvc
4. test method 생성
5. mockMvc.perform(post())
6. expect - HTTP respose code (201)
7. expect - function

## Point TIP
> ⭐️ Point

- Type Safe하게
- ENUM 타입은 String (순서변경해도 영향없게)
- 응답타입은 되도록 accept에 정의
- andDo(print()) 에 찍히는 내용은 모두 검증 가능
- ObjectMapper GOD jackson!
- URI 만들때 hateoas WebMvcLinkBuilder LinkTo, methodOn

## Reference
- 강의교재 : Event 생성 API 구현: 201 응답 받기
- 강의 : 2. 이벤트 생성 API 개발 > 201 응답 받기