# Redis Database를 활용한 채팅 서비스

### Redis Database란?

#### 1. Redis Database의 특징
- 오픈 소스 소프트웨어
- 디스크가 아닌 메모리 기반의 데이터 저장소
- NoSQL & Cache 솔루션 (주 DB는 RDMS, 캐시는 Redis 이런 식으로 사용 가능)
- 캐시 방식으로 DB 부하 감소 시킬 수 있음
- Expire를 설정하지 않으면 데이터가 삭제되지 않는, 영구적 보존 시스템
- 1개의 single thread로 수행되어 여러 대의 서버 구성 가능 (따라서 채팅 서비스로 Redis 사용 예정)
- 데이터베이스로 사용될 수 있고, Cache로도 사용될 수 있음
- Key-Value 형식으로 데이터 저장
###
#### 2. Redis Database의 장점
- 데이터 저장소로 입출력이 가장 빠른 메모리를 채택
- Key-Value 형식으로 속도 빠름
- 캐시 및 데이터 스토어에 유리
- 다양한 API 지원
###
#### 3. Redis Database의 단점
- 메모리를 2배로 사용
- Single Thread
- copy-on-write 방식으로 실제로 필요한 메모리 양보다 더 많은 메모리 사용
- 응답 속도의 불안정 (메모리 파편화로 인한 문제)
###
#### 4. Redis Database 선택 이유
- 간단한 채팅 프로그램을 만들기 위함
- 서비스의 특정 기능을 위한 목적으로 캐시 데이터를 사용할 때 Redis 사용 추천
###
### ∴ Redis Database는 Cache를 사용하는 서비스에 적합
#
사용 툴 : Intellij

사용 언어 : Java

데이터베이스 : MySQL, Redis

발전 방향 : Kafka를 사용하여 실시간 채팅 서비스 제작 가능