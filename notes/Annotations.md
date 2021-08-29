

# Annotations
## 프로젝트에서 사용한 어노테이션 

### Event 도메인 class
> Event.class    

- @Builder
- @AllArgsConstructor
- @NoArgsConstructor
  - 기본생성자로 생성하는 java bean 스펙도 지켜주기위해 사용 
- @Getter
- @Setter 
- @EqualsAndHashCode(of = "id")
  - Equals , HashCode 구현할때 기본적으로 모든 필드를 사용
  - 왜 of = "id" 를 썼는가? Equals, HashCode 구현시 id 필드 기준으로 하기위해
  - 객체간에 연관관계가 있을때 "상호 참조 관계"가 되버리면 스택 오버플로우가 발생할 수 있음
  - 위와같은 이유로 백기선님은 객체참조가 없는 필드, 보통 id 필드만 참조해서 사용한다고 함
  - 필요하다면 다른필드를 더 추가해서 사용해도 되지만 "참조관계가 있는 필드"는 사용하면안됨
- @Entity
- @Id
- @GeneratedValue
- @Enumerated(EnumType.STRING)
  - 그냥 선언할 경우 기본값이 ORDINAL 이기때문에 순서safe하게 String으로

> @Data 어노테이션 주의사항  
> @Data도 Equlas, HashCode 를 구현해주는데 "상호참조관계"가 있는 객체가 있을경우   
> 위에 EqualsAndHashCode에 id만 넣어서 구현한것과 같은 이유로  
> 스택 오버플로우가 발생 여지가 있기때문에 알고 잘 쓰는 것이 중요하다.

### Event Controller

> EventControllerTest.class
 
- @WebMvcTest
- @Autowired
- @Test

> EventController.class  
 
- @Controller
- @RequestMapping(value = "/api/events", produces = MediaTypes.HAL_JSON_VALUE)
  - MediaTypes.HAL_JSON_VALUE = "application/hal+json"
- @PostMapping
  - @PostMapping("/api/events"")
