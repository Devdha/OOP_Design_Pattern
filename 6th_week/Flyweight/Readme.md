# Flyweight Pattern

The Flyweight pattern is a software design pattern. A flyweight is an object that minimizes memory
use by sharing as much data as possible with other similar objects; it is a way to use objects in
large numbers when a simple repeated representation would use an unacceptable amount of memory.
Often some parts of the object state can be shared, and it is common practice to hold them in
external data structures and pass them to the objects temporarily when they are used.

플라이웨이트 패턴은 매번 비슷한 데이터로 객체를 만들 때 메모리를 절약하기 위해 사용된다.
비슷한 클래스들의 고정된 부분을 특정 클래스에 저장해두고, 팩토리 패턴을 사용하여 해당 클래스들을 한번만 만들어 고정적으로 사용한다.
그렇게 되면 기존에 매번 객체를 만들어 사용하던 것보다 메모리를 훨씬 적게 사용할 수 있다.